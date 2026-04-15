package com.mx.ux.Unidad2.practica1Dominio.autenticacionSistema;

import java.util.Scanner;

public class AutenticacionSistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean accesoConcedido = false;

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("\nIntento " + intento + " de 3");
            System.out.print("Usuario: ");
            String user = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();


            if (user.equals("admin")) {
                if (pass.equals("pass123")) {
                    System.out.println("Acceso concedido. Bienvenido.");
                    accesoConcedido = true;
                    break;
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

        if (!accesoConcedido) {
            System.out.println("\nDemasiados intentos. Su cuenta ha sido bloqueada.");
        }
    }
}
