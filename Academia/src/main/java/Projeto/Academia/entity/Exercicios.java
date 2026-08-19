package Projeto.Academia.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_exercicios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Exercicios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Ideal para PostgreSQL
    private Long id;

    @Column(name = "cod_exercicio", nullable = false, length = 10)
    private String codExercicio;

    @Column(name = "nm_exercicio", nullable = false, length = 40)
    private String nmExercicio;

    @Column(name = "obs", nullable = true, length = 255)
    private String obs;

    // AQUI ESTÁ A CORREÇÃO:
    // 1. Atributo renomeado para "aparelho" (bate com o mappedBy = "aparelho" da classe Aparelho)
    // 2. fetch = FetchType.LAZY adicionado para otimizar consultas no banco
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aparelho") // Nome da FK no PostgreSQL
    private Aparelho aparelho;
}