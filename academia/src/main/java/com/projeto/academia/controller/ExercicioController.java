package com.projeto.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.academia.entity.Exercicios;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.projeto.academia.service.AparelhoService;
import com.projeto.academia.service.ExercicioService;
import com.projeto.academia.repository.ExerciciosRepository;
import com.projeto.academia.repository.AparelhoRepository;

@Controller
@RequestMapping("/Exercicio")
public class ExercicioController {

    private final ExercicioService service;
    private final AparelhoService aparelhoService;
    private final ExerciciosRepository repository;
    private final AparelhoRepository arepository;

    public ExercicioController(ExercicioService service, ExerciciosRepository repository,
            AparelhoRepository arepository, AparelhoService aparelhoService) {
        this.service = service;
        this.aparelhoService = aparelhoService;
        this.repository = repository;
        this.arepository = arepository;
    }

    @GetMapping("/CadastroExercicio")
    public String CadastroExercicio(Model model) {
        if (!model.containsAttribute("exercicio")) {
        model.addAttribute("exercicio", new Exercicios());
    }
    model.addAttribute("listaAparelhos", arepository.findAll());
    model.addAttribute("listaExercicios", repository.findAll());
        return "CadastroExercicio";
    }

    @PostMapping("/salvarExercicio")
    public String salvarExercicio(@ModelAttribute Exercicios exercicio, BindingResult result,
            RedirectAttributes attributes) {
        if (result.hasErrors()) {
            System.out.println(">>> Erro de validação nos campos do formulário");
            return "redirect:/Exercicio/CadastroExercicio";
        }
        try {
            service.salvarExercicio(exercicio);
            attributes.addFlashAttribute("mensagem", "Exercício cadastrado com sucesso!");
            return "redirect:/CadastroExercicio";

        } catch (Exception e) {
            attributes.addFlashAttribute("erro", "Erro ao salvar o exercício: " + e.getMessage());
            return "redirect:/Exercicio/CadastroExercicio";
        }

    }

}