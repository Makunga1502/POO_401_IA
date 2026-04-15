package com.mx.ux.Unidad2.practica1Dominio.trazabilidadPedidos;

import java.util.Scanner;

public class TrazabilidadPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Entregado")) {
            System.out.print("Ingrese estado actual (Procesando / En camino / Error / Entregado): ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("Error")) {
                System.out.println("Proceso abortado por fallo en el sistema.");
                break;
            }

            if (estado.equalsIgnoreCase("En camino")) {
                System.out.println("El pedido se está moviendo... saltando validación interna.");
                continue;
            }

            System.out.println("Estado actualizado a: " + estado);
        }
        System.out.println("Proceso de trazabilidad finalizado.");
    }
}