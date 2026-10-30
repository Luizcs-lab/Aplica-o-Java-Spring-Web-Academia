package com.projeto.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.academia.entity.Aparelho;

public interface AparelhoRepository extends JpaRepository<Aparelho, Long> {

}
