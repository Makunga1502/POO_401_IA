package com.mx.ux.Unidad2.ejercicios.base;

public class ManejoDeCiclos {
    public static void main(String[] args) {

        System.out.println("--- Tarea 1: Conteo Ascendente (1 al 5) ---");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++;
        }

        System.out.println("\n--- Tarea 2: Conteo Descendente (10 al 8) ---");
        int descendente = 10;
        do {
            System.out.println("Número: " + descendente);
            descendente--;
        } while (descendente >= 8);

        System.out.println("\n--- Tarea 3: Tabla del 7 (1 al 10) ---");
        int numeroTabla = 7;
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }
    }
}