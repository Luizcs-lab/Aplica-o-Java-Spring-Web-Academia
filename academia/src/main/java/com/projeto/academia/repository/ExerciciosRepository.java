package com.projeto.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.academia.entity.Exercicios;

public interface ExerciciosRepository extends JpaRepository<Exercicios, Long> {

}
