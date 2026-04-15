package com.mx.ux.Unidad2.practicas.paradigmaoo.tareaReturnyConstructores;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
}
