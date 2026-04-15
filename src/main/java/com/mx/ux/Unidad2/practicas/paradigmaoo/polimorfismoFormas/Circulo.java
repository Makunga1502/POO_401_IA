package com.mx.ux.Unidad2.practicas.paradigmaoo.polimorfismoFormas;

class Circulo extends Forma {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}