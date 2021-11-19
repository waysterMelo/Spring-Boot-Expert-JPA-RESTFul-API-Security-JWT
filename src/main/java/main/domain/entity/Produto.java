package main.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "Descricao é obrigatorio")
    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco_unitario")
    @NotNull(message = "Preco nao pode ser nulo")
    private BigDecimal preco;

}
