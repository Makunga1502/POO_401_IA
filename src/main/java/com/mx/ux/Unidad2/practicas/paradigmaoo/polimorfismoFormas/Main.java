package com.mx.ux.Unidad2.practicas.paradigmaoo.polimorfismoFormas;

public class Main {
    public static void main(String[] args) {
        Forma[] figuras = new Forma[3];


        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(10, 2);
        figuras[2] = new Circulo(2);

        System.out.println("--- Cálculo de Áreas Polimórfico ---");


        for (Forma f : figuras) {
            System.out.println("El área de la forma es: " + f.calcularArea());
        }
    }
}