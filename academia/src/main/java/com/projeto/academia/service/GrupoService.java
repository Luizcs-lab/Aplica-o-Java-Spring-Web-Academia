package com.projeto.academia.service;

import org.springframework.stereotype.Service;

import com.projeto.academia.dto.grupoRequestdto;
import com.projeto.academia.entity.Grupo;
import com.projeto.academia.repository.GrupoRepository;

@Service
public class GrupoService {

    private final GrupoRepository repository;

    public GrupoService(GrupoRepository repository) {
        this.repository = repository;
    }

    public void salvarGrupo(grupoRequestdto dto) {
        if (dto.codigo() == null || dto.codigo().isBlank()) {
            throw new IllegalArgumentException("o codigo não pode estar vazio");
        }
        if (dto.descricao() == null || dto.descricao().isBlank()) {
            throw new IllegalArgumentException("a descricao deve estar presente");
        }
        if (dto.obs() == null || dto.obs().isBlank()) {
            throw new IllegalArgumentException("a observação deve conter algo");
        }

        Grupo e = new Grupo();
        e.setId(dto.id());
        e.setCodigo(dto.codigo());
        e.setDescricao(dto.descricao());
        e.setSituacao(dto.situacao());
        e.setObs(dto.obs());

        repository.save(e);

    }

    public Grupo salvarGrupo(Grupo grupo) {
        return repository.save(grupo);
    }

}
