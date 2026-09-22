package Projeto.Academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import Projeto.Academia.entity.Exercicios;
import org.springframework.ui.Model;
import Projeto.Academia.Services.ExercicioService;
import Projeto.Academia.repository.ExerciciosRepository;
import Projeto.Academia.repository.AparelhoRepository;

@Controller
@RequestMapping("/Exercicio") 
public class ExercicioController {

    @Autowired 
    private final ExercicioService service;
    private final ExerciciosRepository repository;
    private final AparelhoRepository arepository;

    public ExercicioController(ExercicioService service, ExerciciosRepository repository, AparelhoRepository arepository){
        this.service = service;
        this.repository= repository;
        this.arepository = arepository;
    }

   @GetMapping("/CadastroExercicio")
    public String CadastroExercicio(Model model){
        model.addAttribute("exercicio", new Exercicios());
        model.addAttribute("listaExercicios", repository.findAll());
        model.addAttribute("listaAparelhos", arepository.findAll());
        return "CadastroExercicio";
    }

    @PostMapping("/salvar")
    public String salvarExercicio(@ModelAttribute("exercicio") Exercicios exercicios){
 service.salvarExercicio(exercicios);

 return "redirect:/Exercicio/CadastroExercicio";
    }

    
}
