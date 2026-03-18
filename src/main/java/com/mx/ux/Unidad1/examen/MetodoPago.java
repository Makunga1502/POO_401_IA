package com.mx.ux.Unidad1.examen;

public abstract class MetodoPago {
    public double monto;

    public MetodoPago(double monto){
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarMonto(){
        System.out.println("el monto a pagar es de:" + monto);
    }

}
