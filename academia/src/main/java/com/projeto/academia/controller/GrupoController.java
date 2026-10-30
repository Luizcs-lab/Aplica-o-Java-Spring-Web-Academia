package com.projeto.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.academia.entity.Grupo;
import com.projeto.academia.service.GrupoService;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/Grupo")
public class GrupoController {
    private final GrupoService service;

    public GrupoController(GrupoService service) {
        this.service = service;
    }

    @GetMapping("/CadastroGrupo")
    public String CadastroGrupo(Model model) {
        model.addAttribute("grupo", new Grupo());

        return "CadastroGrupo";
    }

    @PostMapping
    public String salvarGrupo(@ModelAttribute("grupo") Grupo grupo, BindingResult result,
            RedirectAttributes attributes) {
        if (result.hasErrors()) {
            System.out.println(">>> Erro de validação nos campos do formulário");
            attributes.addFlashAttribute("erro", "Preencha todos os campos corretamente.");
            return "CadastroGrupo";
        }
        try {
            service.salvarGrupo(grupo);
            attributes.addFlashAttribute("mensagem", "Grupo cadastrado com sucesso!");
            return "redirect:/Grupo/CadastroGrupo";
        } catch (Exception e) {
            System.out.println(">>> Erro ao salvar no banco:");
            e.printStackTrace();
            attributes.addFlashAttribute("erro", "Erro no banco: " + e.getMessage());
            return "redirect:/Grupo/CadastroGrupo";
        }

    }
}
