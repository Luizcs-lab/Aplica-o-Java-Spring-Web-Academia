package com.projeto.academia.service;

import org.springframework.stereotype.Service;

import com.projeto.academia.dto.aparelhoRequestdto;
import com.projeto.academia.entity.Aparelho;
import com.projeto.academia.repository.AparelhoRepository;

@Service
public class AparelhoService {

    private final AparelhoRepository repository;

    public AparelhoService(AparelhoRepository repository) {
        this.repository = repository;
    }

    public void salvarAparelho(aparelhoRequestdto dto) {
        if (dto.codigoAparelho() == null && dto.nomeAparelho() == null) {
            throw new IllegalArgumentException("Código e Nome do aparelho não podem ser nulos");
        }

        Aparelho a = new Aparelho();
        a.setCodigoAparelho(dto.codigoAparelho());
        a.setNomeAparelho(dto.nomeAparelho());
        repository.save(a);
    }

    public Aparelho salvarAparelho(Aparelho aparelho) {
        return repository.save(aparelho);
    }
}
