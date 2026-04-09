package com.mx.ux.Unidad2.herenciaMasSobreEscritura;

public class Rectangulo extends FiguraGeometrica{

    double base, altura;

    public Rectangulo(String nombre) {
        super(nombre);
    }

    @Override
    double calcularArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public void mostrarNombre(){
        super.mostrarNombre();
    }
}
