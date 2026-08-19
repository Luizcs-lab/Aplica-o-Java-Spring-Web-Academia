package Projeto.Academia.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // CORRIGIDO: Lado proprietário do @OneToOne (Guarda a FK id_pessoa)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pessoa", nullable = false, unique = true)
    private Pessoa pessoa;

    // Aumentado o tamanho para suportar Hash de senha (ex: BCrypt do Spring Security)
    @Column(nullable = false, length = 100)
    private String senha;

    @Column(nullable = false, length = 1)
    private Character situacao;
}