package com.mx.ux.Unidad2.practicas.paradigmaoo.clasesAbstractasJuego;

public class Main {
    public static void main(String[] args) {
        // Personaje p = new Personaje(); // Esto daría ERROR porque es abstracta

        Personaje g = new Guerrero();
        Personaje m = new Mago();

        g.atacar();
        m.atacar();
    }
}