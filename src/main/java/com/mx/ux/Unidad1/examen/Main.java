package com.mx.ux.Unidad1.examen;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // lista del padre nos deja guardar  subclases
        List<MetodoPago> pagos = new ArrayList<>();

        // se crean objetos pero se guardan como metopago
        pagos.add(new PagoTarjeta(1500, "2901945465"));
        pagos.add(new PagoEfectivo(200, 200));

        for (MetodoPago pago : pagos) {
            pago.mostrarMonto();
            pago.procesarPago();
            // cada objeto ejecuta su propia version
        }


    }
}
