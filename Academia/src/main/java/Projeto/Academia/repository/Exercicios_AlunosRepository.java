/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Projeto.Academia.repository;

import Projeto.Academia.entity.ExerciciosAlunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface Exercicios_AlunosRepository extends JpaRepository<ExerciciosAlunos, Long>{
    
}
