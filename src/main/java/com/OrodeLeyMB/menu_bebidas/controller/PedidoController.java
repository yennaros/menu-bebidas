package com.OrodeLeyMB.menu_bebidas.controller;

import com.OrodeLeyMB.menu_bebidas.model.Pedido;
import com.OrodeLeyMB.menu_bebidas.service.EmailService;
import com.OrodeLeyMB.menu_bebidas.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;
    private final EmailService emailService;


    @GetMapping("/")
    public String mostrarMenu(){
        return "menu";
    }

    @PostMapping("/pedido")
    public String hacerPedido(@RequestParam String nombreCliente,
                              @RequestParam String bebida) {

        System.out.println("ENTRANDO AL CONTROLLER ✅");

        Pedido pedido = new Pedido();
        pedido.setNombreCliente(nombreCliente);
        pedido.setBebida(bebida);

        pedidoService.guardarPedido(pedido);

        System.out.println("ANTES DE ENVIAR CORREO 📧");

        emailService.enviarPedido(nombreCliente, bebida);

        System.out.println("DESPUES DE ENVIAR CORREO 📧");

        return "confirmacion";
    }
}
