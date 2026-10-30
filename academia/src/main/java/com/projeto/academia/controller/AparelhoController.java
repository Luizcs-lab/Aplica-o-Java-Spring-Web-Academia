package com.projeto.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.academia.entity.Aparelho;
import com.projeto.academia.repository.AparelhoRepository;
import com.projeto.academia.service.AparelhoService;

@Controller
@RequestMapping("/Aparelho")
public class AparelhoController {

    private final AparelhoService service;

    public AparelhoController(AparelhoService service, AparelhoRepository repository) {
        this.service = service;
    }

    // exibir dados dos exercicios na página
    @GetMapping("/CadastroAparelho")
    public String listaExercicios(Model model) {
        model.addAttribute("aparelho", new Aparelho());

        return "CadastroAparelho";
    }

    @PostMapping("/salvarAparelho")
    public String salvarAparelho(@ModelAttribute Aparelho aparelho, BindingResult result,
            RedirectAttributes attributes) {
        if (result.hasErrors()) {
            System.out.println(">>> Erro de validação nos campos do formulário");
            return "redirect:/CadastroAparelho";
        }
        try {
            service.salvarAparelho(aparelho);
            attributes.addFlashAttribute("mensagem", "Aparelho cadastrado com sucesso!");
            return "redirect:/CadastroAparelho";

        } catch (Exception e) {
            attributes.addFlashAttribute("erro", "Erro ao salvar o aparelho: " + e.getMessage());
            return "redirect:/CadastroAparelho";
        }

    }

}
