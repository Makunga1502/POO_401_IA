package com.mx.ux.Unidad1.examen;

public class PagoEfectivo extends MetodoPago{ // tambien se hereda lo de metodopago
    private double dineroRecibido;



    public PagoEfectivo(double monto, double dineroRecibido) {
        super(monto); // el atributo heredado
        this.dineroRecibido = dineroRecibido;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando el dinero en efectivo...");
        System.out.println("el dinero recibido es la cantidad de: "+ dineroRecibido);
    }
}
