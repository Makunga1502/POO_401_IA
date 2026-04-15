package com.mx.ux.Unidad2.ejercicios.base;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraEdad {
    public static void main(String[] args) {

        int anioActual = 2026;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Por favor, ingrese su año de nacimiento: ");


            int anioNacimiento = scanner.nextInt();


            int edad = anioActual - anioNacimiento;
            System.out.println("Según el año actual (" + anioActual + "), tu edad aproximada es: " + edad + " años.");

        } catch (InputMismatchException e) { // [cite: 14, 15]

            System.out.println("Error: El dato ingresado no es válido. Por favor, asegúrese de ingresar un número entero.");

        } finally {
            scanner.close();
            System.out.println("Recursos liberados correctamente.");
        }
    }
}
