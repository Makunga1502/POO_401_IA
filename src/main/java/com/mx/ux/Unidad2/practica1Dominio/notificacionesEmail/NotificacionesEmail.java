package com.mx.ux.Unidad2.practica1Dominio.notificacionesEmail;

import java.util.Scanner;

public class NotificacionesEmail {


    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correo;

        do {
            System.out.print("Por favor, ingrese su email para notificaciones: ");
            correo = sc.nextLine();

            if (!validarEmail(correo)) {
                System.out.println("Formato de correo inválido. Intente de nuevo.");
            }
        } while (!validarEmail(correo));

        System.out.println("Notificaciones activadas para: " + correo);
    }
}
