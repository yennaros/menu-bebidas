package com.OrodeLeyMB.menu_bebidas.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private String bebida;

    public void setNombreCliente(String nombreCliente) {

    }

    public void setBebida(String bebida) {
    }
}
