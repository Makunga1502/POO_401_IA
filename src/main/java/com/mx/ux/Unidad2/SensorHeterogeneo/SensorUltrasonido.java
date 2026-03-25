package com.mx.ux.Unidad2.SensorHeterogeneo;

public class SensorUltrasonido extends SensorIA{


    public SensorUltrasonido(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Enviando pulso sónico... Midiendo tiempo de rebote para proximidad.");
        System.out.println();
    }

}
