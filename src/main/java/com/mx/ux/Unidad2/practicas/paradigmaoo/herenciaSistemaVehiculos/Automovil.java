package com.mx.ux.Unidad2.practicas.paradigmaoo.herenciaSistemaVehiculos;

public class Automovil extends Vehiculo {
    @Override
    void acelerar() {
        // El automóvil aumenta de 20 en 20
        velocidad += 20;
        System.out.println("Acelerando motor... Velocidad actual: " + velocidad + " km/h");
    }
}
