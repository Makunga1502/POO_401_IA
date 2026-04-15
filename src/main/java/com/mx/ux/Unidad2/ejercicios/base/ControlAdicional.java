package com.mx.ux.Unidad2.ejercicios.base;

public class ControlAdicional {

    public static void main(String[] args) {
        System.out.println("--- Sección 1: break (Detener en 5) ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Número: " + i);
        }


        System.out.println("\n--- Sección 2: continue (Solo impares) ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Número impar: " + i);
        }


        System.out.println("\n--- Sección 3: return (Búsqueda) ---");
        int[] misNumeros = {10, 20, 30, 40, 50};
        String resultado = encontrarNumero(misNumeros, 30);
        System.out.println(resultado);
    }


    public static String encontrarNumero(int[] arreglo, int objetivo) {
        for (int n : arreglo) {
            if (n == objetivo) {

                return "El número " + objetivo + " fue encontrado.";
            }
        }

        return "El número " + objetivo + " no se encontró.";
    }
}
