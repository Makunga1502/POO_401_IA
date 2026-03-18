package com.mx.ux.Unidad1.examen;

public class PagoTarjeta extends MetodoPago { // se hereda el metodo pago
    private String numeroTarjeta;


    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto); // se llama al constructor de la clase padre
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() { // se cambia un poco lo del padre
        System.out.println("Procesando el numero de tarjeta...");
        System.out.println("el numero de la tarjeta es:" +numeroTarjeta);
        System.out.println("se pago" + monto + "con la tarjeta");

    }
}
