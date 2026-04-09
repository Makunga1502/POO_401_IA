package com.mx.ux.Unidad2.ejercicios.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalizadorDeNumeros {
    public static void main(String[] args) {
        // Tarea 1
        int suma = 0;
        for (int i = 0; i < 100 ; i++) {
            suma += i;
        }
        System.out.println("La suma es = " + suma);

        // Subtarea
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);

        for (Integer d: numeros){
            System.out.println("valor = " + d);
        }

        // Tarea 2
        int num = 1;
        while (num < 52){
            if (num > 50) {
                System.out.println("Numero encotrado = " + num);
                break;
            }
            num++;

        }

        // Tarea 3

        Scanner sc = new Scanner(System.in);
        String Pass = "qwerty123";
        boolean esIncorrecto = false;
        do {
            System.out.println("Ingresa una contraseña");
            String entrada = sc.nextLine();
            esIncorrecto = !entrada.equals(Pass);

        } while (esIncorrecto);
        System.out.println("Contraseña Aceptada");

    }
}
