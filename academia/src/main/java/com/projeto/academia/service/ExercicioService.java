package com.projeto.academia.service;

import org.springframework.stereotype.Service;

import com.projeto.academia.dto.exercicioRequestdto;
import com.projeto.academia.entity.Exercicios;
import com.projeto.academia.repository.ExerciciosRepository;

@Service
public class ExercicioService {
    // injeção de dependência do repository dos exercicios

    private final ExerciciosRepository repository;

    public ExercicioService(ExerciciosRepository repository) {
        this.repository = repository;
    }

    public void salvarExercicio(exercicioRequestdto dto) {
        if (dto.codExercicio() == null || dto.codExercicio().isBlank()) {
            throw new IllegalArgumentException("o codigo não pode estar vazio");
        }
        if (dto.nmExercicio() == null || dto.nmExercicio().isBlank()) {
            throw new IllegalArgumentException("o nome do exercicio deve estar presente");
        }
        if (dto.obs() == null || dto.obs().isBlank()) {
            throw new IllegalArgumentException("a observação deve conter algo");
        }

        Exercicios e = new Exercicios();
        e.setId(dto.id());
        e.setCodExercicio(dto.codExercicio());
        e.setNmExercicio(dto.nmExercicio());
        e.setObs(dto.obs());

        repository.save(e);

    }

    public Exercicios salvarExercicio(Exercicios exercicio) {
        return repository.save(exercicio);
    }

}