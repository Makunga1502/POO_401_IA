package com.mx.ux.Unidad2.practicas.paradigmaoo.modeladoRestaurante;

public class Main extends Restaurante{
    public static void main(String[] args) {Restaurante r1 = new Restaurante();
        r1.nombre = "La Pasta Loca";
        r1.abrir();

        Restaurante r2 = new Restaurante();
        r2.nombre = "Sushi Zen";
        r2.abrir();
    }
}
