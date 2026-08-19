package Projeto.Academia.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Projeto.Academia.entity.Pessoa;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home() {        
        return "index"; // Aponta para src/main/resources/templates/index.html
    }

    @GetMapping("/Cadastroalunos")
    public String Cadastroalunos(Model model){
        model.addAttribute("pessoa", new Pessoa());
        return "Cadastroalunos";
    }
    
    @GetMapping("/CadastroAparelho")
    public String CadastroAparelho(){
        return "CadastroAparelho";
    }

     @GetMapping("/Instrutores")
    public String Instrutores(){
        return "Instrutores";
    }
}