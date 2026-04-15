package com.mx.ux.Unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        double nota1 = 00, nota2 = 00;

        Scanner sc = new Scanner(System.in);




        try {
            System.out.println("Ingresa la nota1: ");
            nota1 = sc.nextDouble();
            System.out.println("Ingresa la nota2: ");
            nota2 = sc.nextDouble();
            double promedio = (nota1 + nota2) / 2;
            System.out.println("promedio = " + promedio);
        }catch (InputMismatchException e){
            System.out.println("Error al ingresar el tipo de dato= " + e.getMessage());
        }finally {
            System.out.println("Liberando recursos");
            sc.close();
        }

    }
}
