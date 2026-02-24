package com.OrodeLeyMB.menu_bebidas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;



    public void enviarPedido(String nombre, String bebida) {

        try {
            SimpleMailMessage mensaje = new SimpleMailMessage();
            mensaje.setFrom("gerardovaa19@gmail.com");
            mensaje.setTo("gerardovaa19@gmail.com");
            mensaje.setSubject("Nuevo pedido recibido");
            mensaje.setText("Cliente: " + nombre + "\nBebida: " + bebida);

            mailSender.send(mensaje);

            System.out.println("CORREO ENVIADO CORRECTAMENTE ✅");

        } catch (Exception e) {
            System.out.println("ERROR AL ENVIAR CORREO ❌");
            e.printStackTrace();
        }
    }
}
