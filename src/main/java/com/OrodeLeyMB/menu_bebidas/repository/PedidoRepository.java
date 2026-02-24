package com.OrodeLeyMB.menu_bebidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.OrodeLeyMB.menu_bebidas.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
