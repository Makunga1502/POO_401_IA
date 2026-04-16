package com.mx.ux.Unidad2.herenciaMasSobreEscritura;

public class RectanguloRemix extends FiguraGeometrica{

    private double base, altura;


    public RectanguloRemix(String nombre) {
        super(nombre);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void mostrarNombre(){
        super.mostrarNombre();
    }


    @Override
    double calcularArea() {
        double area = getBase() * getBase();
        return area;
    }
}
