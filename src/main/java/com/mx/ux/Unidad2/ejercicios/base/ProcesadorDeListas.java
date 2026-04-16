package com.mx.ux.Unidad2.ejercicios.base;

import java.util.Scanner;

public class ProcesadorDeListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] frutas = {"manzana", "banana", "pera", "uva"};

        System.out.println("--- Tarea 1: Lista de frutas ---");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
        }


        System.out.println("\n--- Tarea 2: Buscando fruta que inicie con 'P' ---");
        int contador = 0;
        boolean encontrado = false;


        while (contador < frutas.length && !encontrado) {

            if (frutas[contador].toLowerCase().startsWith("p")) { // [cite: 134]
                System.out.println("Nombre encontrado: " + frutas[contador] + " en la posición: " + contador);
                encontrado = true;
            }
            contador++;
        }


        System.out.println("\n--- Tarea 3: Validación de entrada ---");
        String entradaUsuario;
        boolean frutaValida = false;


        do {
            System.out.print("Ingrese una fruta de la lista: ");
            entradaUsuario = scanner.nextLine();


            for (String f : frutas) {
                if (f.equalsIgnoreCase(entradaUsuario)) {
                    frutaValida = true;
                    break;
                }
            }

            if (!frutaValida) {
                System.out.println("Fruta no válida. Intente de nuevo.");
            }
        } while (!frutaValida);

        System.out.println("Confirmación: '" + entradaUsuario + "' es una fruta válida.");

        scanner.close();
    }
}
