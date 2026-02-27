package com.mx.ux.Unidad1.sistemas_nlp;

import com.mx.ux.Unidad1.adstraccion.ModeloIa;

abstract class MotorIA {
    private String nombreModelo;
    private double precision;

    public MotorIA(String nombre, double precision){
        this.nombreModelo = nombre;
        this.precision = precision;
    }

    public String getNombre() {
        return  nombreModelo;
    }

    public double getPrecision() {
        System.out.println("Precision: " + precision);
        return precision;
    }

    public abstract void analizar(String analizando);
}
