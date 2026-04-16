package com.mx.ux.Unidad2.herenciaMasSobreEscritura;

abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;

    }

    abstract  double calcularArea();

    public void mostrarNombre(){
        System.out.println("nombre = " + nombre);
    }
}
