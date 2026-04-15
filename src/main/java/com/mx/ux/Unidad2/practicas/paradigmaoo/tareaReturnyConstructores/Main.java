package com.mx.ux.Unidad2.practicas.paradigmaoo.tareaReturnyConstructores;

public class Main {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5);


        double area = miCirculo.calcularArea();
        double perimetro = miCirculo.calcularCircunferencia();

        System.out.println("--- Resultados del Círculo (Radio: 5) ---");
        System.out.println("Área calculada: " + area);
        System.out.println("Circunferencia calculada: " + perimetro);


        System.out.println("Área formateada: " + String.format("%.2f", miCirculo.calcularArea()));
    }
}