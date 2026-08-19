package Projeto.Academia.dto;

import java.time.LocalDate;

public record pessoaRequestdto(
        Long id,
        Character tipo,
        String nome,
        LocalDate data_nascimento,
        String cpf,
        String rg,

        String email,

        String telefone,
        String cep,

        String endereco,
        String numero,

        String bairro,

        String cidade,
        String estado,

        String observacao,
        LocalDate data_admissao) {

}
