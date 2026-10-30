package com.projeto.academia.repository;

import com.projeto.academia.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Aqui você pode adicionar métodos personalizados de consulta, se necessário

}
