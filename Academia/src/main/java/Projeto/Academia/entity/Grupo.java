package Projeto.Academia.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_grupo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String codigo;

    @Column(nullable = false, length = 40)
    private String descricao;

    @Column(nullable = false, length = 1)
    private Character situacao;

    @Column(nullable = true, length = 255)
    private String obs;

    // Relacionamento com Aluno (Vários grupos podem estar associados a um aluno)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno")
    private Pessoa aluno;

    // Relacionamento com Instrutor que criou/gerencia o grupo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_instrutor")
    private Pessoa instrutor;

    @Column(name = "data_cadastro")
    private LocalDateTime data;
}