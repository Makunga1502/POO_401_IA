package com.mx.ux.Unidad2.practicas.paradigmaoo.polimorfismoFormas;

class Rectangulo extends Forma {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}