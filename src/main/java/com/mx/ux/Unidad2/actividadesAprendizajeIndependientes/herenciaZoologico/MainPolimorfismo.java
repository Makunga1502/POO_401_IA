package com.mx.ux.Unidad2.actividadesAprendizajeIndependientes.herenciaZoologico;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Animal[] misAnimales = new Animal[2];
        misAnimales[0] = new Perro();
        misAnimales[1] = new Gato();

        System.out.println("--- Paseando por el zoológico ---");
        for (Animal animal : misAnimales) {

            animal.hacerSonido();
        }
    }
}
