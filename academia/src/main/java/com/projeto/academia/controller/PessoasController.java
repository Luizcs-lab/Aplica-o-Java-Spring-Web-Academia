package com.projeto.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.academia.service.PessoaService;
import com.projeto.academia.entity.Pessoa;

@Controller
@RequestMapping("/Pessoa")
public class PessoasController {

    private final PessoaService service;

    public PessoasController(PessoaService service) {
        this.service = service;
    }

    // Exibe o formulário Thymeleaf em: http://localhost:8081/Pessoa/Cadastroalunos
    @GetMapping("/cadastroalunos")
    public String exibirFormulario(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "cadastroalunos";
    }

    // Processa o envio do formulário via POST
    @PostMapping
    public String salvarPessoa(@ModelAttribute("pessoa") Pessoa pessoa,
            BindingResult result,
            RedirectAttributes attributes) {

        // Se houver erro de validação/binding nos campos do formulário
        if (result.hasErrors()) {
            System.out.println(">>> Erro de validação nos campos do formulário");
            attributes.addFlashAttribute("erro", "Preencha todos os campos corretamente.");
            return "redirect:/Pessoa/cadastroalunos";
        }

        try {
            service.salvarPessoa(pessoa);
            attributes.addFlashAttribute("mensagem", "Pessoa cadastrada com sucesso!");
            return "redirect:/Pessoa/cadastroalunos";
        } catch (Exception e) {
            System.out.println(">>> Erro ao salvar no banco:");
            e.printStackTrace();
            attributes.addFlashAttribute("erro", "Erro no banco: " + e.getMessage());
            return "redirect:/Pessoa/cadastroalunos";
        }
    }

    // Rota GET para listar pessoas na tela (se você tiver uma página
    // ListaPessoas.html)
    /*
     * @GetMapping
     * public String listarPessoas(Model model) {
     * List<Pessoa> pessoas = service.ListarPessoas();
     * model.addAttribute("pessoas", pessoas);
     * return "ListaPessoas";
     * }
     */
}