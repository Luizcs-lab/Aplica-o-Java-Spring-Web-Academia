package Projeto.Academia.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Projeto.Academia.Services.AparelhoService;
import Projeto.Academia.entity.Aparelho;
import Projeto.Academia.entity.Exercicios;
import Projeto.Academia.repository.ExerciciosRepository;

@Controller
@RequestMapping("/Aparelho")
public class AparelhoController {
    @Autowired
    private final AparelhoService service; 
    private final ExerciciosRepository repository;

    public AparelhoController(AparelhoService service, ExerciciosRepository repository){
        this.service = service;
        this.repository = repository;
    }
    //exibir dados dos exercicios na página
    @GetMapping("/cadastroAparelho")
    public String listaExercicios(Model model){
        model.addAttribute("aparelho", new Aparelho());
        List<Exercicios> exercicios = repository.findAll();
        model.addAttribute("listaExercicios", exercicios);

        return "CadastroAparelho";
    }


   @PostMapping
public String salvarAparelho(@ModelAttribute Aparelho aparelho) {
      
        service.salvarAparelho(aparelho);        
        return "redirect:/CadastroAparelho";
    
}

}
