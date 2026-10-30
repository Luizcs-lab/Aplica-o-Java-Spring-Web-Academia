package com.projeto.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.academia.entity.Pessoa;
import com.projeto.academia.service.InstrutoresService;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/Instrutores")
public class InstrutoresController {
    private final InstrutoresService service;

    public InstrutoresController(InstrutoresService service) {
        this.service = service;
    }

    @GetMapping("/ListaInstrutores")
    public String ListaInstrutores(Model model) {
        model.addAttribute("Instrutores", new Pessoa());
        return "Instrutores";
    }
}
