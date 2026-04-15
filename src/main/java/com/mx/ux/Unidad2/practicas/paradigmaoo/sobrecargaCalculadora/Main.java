package com.mx.ux.Unidad2.practicas.paradigmaoo.sobrecargaCalculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma 2 enteros: " + calc.sumar(5, 10));
        System.out.println("Suma 3 enteros: " + calc.sumar(5, 10, 15));
        System.out.println("Suma 2 decimales: " + calc.sumar(5.5, 10.2));
    }
}
