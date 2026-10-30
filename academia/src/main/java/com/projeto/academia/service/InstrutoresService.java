package com.projeto.academia.service;

import org.springframework.stereotype.Service;

import com.projeto.academia.repository.PessoaRepository;

@Service
public class InstrutoresService {
    private final PessoaRepository repository;

    public InstrutoresService(PessoaRepository repository) {
        this.repository = repository;
    }

    public String listarInstrutores() {
        return repository.findAll().toString();
    }
}
