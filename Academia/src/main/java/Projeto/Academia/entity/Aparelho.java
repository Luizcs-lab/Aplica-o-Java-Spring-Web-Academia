package Projeto.Academia.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_aparelho")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aparelho implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Otimizado para PostgreSQL (SERIAL)
    private Long id;

    @Column(name = "cod_aparelho", nullable = false, length = 10)
    private String codigoAparelho; // Renomeado para camelCase

    @Column(name = "nm_aparelho", nullable = false, length = 30)
    private String nomeAparelho; // Renomeado para camelCase

    @OneToMany(mappedBy = "aparelho")
    private List<Exercicios> exercicios = new ArrayList<>();
}