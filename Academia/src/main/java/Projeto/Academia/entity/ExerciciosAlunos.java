package Projeto.Academia.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_exercicios_alunos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ExerciciosAlunos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacionamento com o Exercício (Lado "Muitos" guarda a FK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_exercicio", nullable = false)
    private Exercicios exercicio;

    // Relacionamento com o Aluno (Dono da ficha)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno", nullable = false)
    private Pessoa aluno;

    // Relacionamento com SubGrupo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sub_grupo")
    private SubGrupo subGrupo;

    @Column(nullable = false)
    private Integer sequencia;

    @Column(nullable = true)
    private Integer quantidade;

    @Column(nullable = true)
    private Integer peso;

    @Column(nullable = false, length = 1)
    private Character situacao;

    // Instrutor que incluiu a ficha
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_instrutor_inc")
    private Pessoa instrutorInclusao;

    // Instrutor que alterou a ficha
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_instrutor_alt")
    private Pessoa instrutorAlteracao;

    // Data moderna em Java 8+
    @Column(name = "data_alteracao")
    private LocalDateTime dataAlteracao;
}