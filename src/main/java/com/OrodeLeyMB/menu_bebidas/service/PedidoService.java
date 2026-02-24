package com.OrodeLeyMB.menu_bebidas.service;

import com.OrodeLeyMB.menu_bebidas.repository.PedidoRepository;
import com.OrodeLeyMB.menu_bebidas.model.Pedido;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public Pedido guardarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }


}
