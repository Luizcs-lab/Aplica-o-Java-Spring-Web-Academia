package Projeto.Academia.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "tb_pessoa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Otimizado para PostgreSQL
    private Long id;

    @Column(nullable = false, length = 1)
    private Character tipo; // 'A' para Aluno, 'I' para Instrutor, etc.

    @Column(nullable = false, length = 80)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento; // LocalDate para manipulação simples de datas

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(nullable = false, unique = true, length = 12)
    private String rg;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 11)
    private String telefone;

    @Column(nullable = false, length = 8)
    private String cep;

    @Column(nullable = false, length = 90)
    private String endereco;

    @Column(nullable = false, length = 8)
    private String numero;

    @Column(nullable = false, length = 25)
    private String bairro;

    @Column(nullable = false, length = 25)
    private String cidade;

    // CORRIGIDO: Removido unique = true que impedia vários cadastros no mesmo estado
    @Column(nullable = false, length = 2)
    private String estado;

    @Column(nullable = true, length = 225)
    private String observacao;

    @Column(name = "data_admissao", nullable = false)
   @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAdmissao;
}