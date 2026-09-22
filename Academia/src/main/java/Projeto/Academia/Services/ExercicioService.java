package Projeto.Academia.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Projeto.Academia.entity.Exercicios;
import Projeto.Academia.repository.ExerciciosRepository;
import Projeto.Academia.dto.exercicioRequestdto;

@Service
public class ExercicioService {
//injeção de dependência do repository dos exercicios
    @Autowired 
    private final ExerciciosRepository repository;

    public ExercicioService(ExerciciosRepository repository){
        this.repository=repository;
    }
    //verificação dos dados
    public Exercicios salvarExercicio(exercicioRequestdto dto) {
         if(dto.codExercicio()==null){
          throw new IllegalArgumentException("o código do exercicio não pode ser nulo"); 
         }
         if(dto.nmExercicio()==null|| dto.nmExercicio().isEmpty()){
            throw new IllegalArgumentException("O nome do exercicio não pode ser nulo ou estar em branco");
         }
         if(dto.obs()==null|| dto.obs().isBlank()){
            throw new IllegalArgumentException("deve haver alguma observação ");
         }

         //Conversão
         Exercicios e = new Exercicios();
         e.setCodExercicio(dto.codExercicio());
         e.setNmExercicio(dto.nmExercicio());
         e.setObs(dto.obs());
   

         //repository
         repository.save(e);
        return null;
       
    }
     public Exercicios salvarExercicio(Exercicios e) {
        return repository.save(e);
     }
}
