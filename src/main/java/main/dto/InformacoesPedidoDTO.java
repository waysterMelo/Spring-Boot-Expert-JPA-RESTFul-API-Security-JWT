package main.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InformacoesPedidoDTO {


    private Integer codigo;
    private String cpf;
    private String nomeCliente;
    private BigDecimal total;
    private List<InformacaoItemPedidoDTO> items;
    private String dataPedido;



}
