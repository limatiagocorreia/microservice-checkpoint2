package br.com.fiap.checkpoint2.usecase;

import br.com.fiap.checkpoint2.dto.PedidoOutputDTO;

public interface GetPedidoByIdUseCase {

    PedidoOutputDTO execute(Long id);
}
