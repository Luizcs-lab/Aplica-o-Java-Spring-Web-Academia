package com.projeto.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.projeto.academia.entity.Aparelho;
import com.projeto.academia.entity.Exercicios;
import com.projeto.academia.entity.Grupo;
import com.projeto.academia.entity.Pessoa;
import com.projeto.academia.entity.Usuario;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home() {
        return "index"; // Aponta para src/main/resources/templates/index.html
    }

    @GetMapping("/Cadastroalunos")
    public String Cadastroalunos(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "Cadastroalunos";
    }

    @GetMapping("/CadastroAparelho")
    public String CadastroAparelho(Model model) {
        model.addAttribute("aparelho", new Aparelho());
        return "CadastroAparelho";
    }

    @GetMapping("/CadastroExercicio")
    public String CadastroExercicio(Model model) {
        model.addAttribute("exercicio", new Exercicios());
        return "CadastroExercicio";
    }

    @GetMapping("/CadastroGrupo")
    public String CadastroGrupo(Model model) {
        model.addAttribute("grupo", new Grupo());
        return "CadastroGrupo";
    }

    @GetMapping("/Instrutores")
    public String Instrutores(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "Instrutores";
    }

    @GetMapping("/LoginUsuario")
    public String LoginUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "LoginUsuario";
    }
}