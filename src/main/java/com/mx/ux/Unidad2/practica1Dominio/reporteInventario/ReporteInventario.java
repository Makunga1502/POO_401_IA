package com.mx.ux.Unidad2.practica1Dominio.reporteInventario;

public class ReporteInventario {
    public static void main(String[] args) {
        int[] stock = {60, 25, 5, 0, 80, 15, 3, 45, 0, 10};

        System.out.println("--- REPORTE DE INVENTARIO ---");
        for (int i = 0; i < stock.length; i++) {
            int cantidad = stock[i];
            String estado;

            if (cantidad > 50) estado = "En stock";
            else if (cantidad >= 10) estado = "Bajo stock";
            else if (cantidad >= 1) estado = "Urgente";
            else estado = "Descontinuado";

            System.out.println("Producto " + (i + 1) + ": Cantidad " + cantidad + " " + estado + " ");
        }
    }
}
