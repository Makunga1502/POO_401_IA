package com.mx.ux.Unidad2.herenciaMasSobreEscritura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(12));
        figuras.add(new Rectangulo(15, 4));

        for (FiguraGeometrica f: figuras){
            f.mostrarNombre();
            System.out.println(f.calcularArea());
        }
        System.out.println("Implementación remix");

        RectanguloRemix rectanguloRemix = new RectanguloRemix("Rectangulo Remix");
        rectanguloRemix.setBase(20);
        rectanguloRemix.setAltura(13);
        rectanguloRemix.mostrarNombre();
        System.out.println("El area es = " + rectanguloRemix.calcularArea());
    }
}
