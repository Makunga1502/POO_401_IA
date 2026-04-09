package com.mx.ux.Unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {

        int anoActual = 2026;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Ingresa tu año de nacimiento: ");
            int anoNacimiento = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error al ingresar el tipo de dato"+ e.getMessage());
            System.out.println("Error al ingresar el tipo de dato"+ e.getCause());
            System.out.println("Error al ingresar el tipo de dato"+ e.getLocalizedMessage());
        }finally {
            sc.close();
        }





    }
}
