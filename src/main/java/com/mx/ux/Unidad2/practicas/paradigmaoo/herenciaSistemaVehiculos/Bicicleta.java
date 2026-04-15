package com.mx.ux.Unidad2.practicas.paradigmaoo.herenciaSistemaVehiculos;

public class Bicicleta extends Vehiculo {
    @Override
    void acelerar() {
        // La bicicleta aumenta de 2 en 2
        velocidad += 2;
        System.out.println("Pedaleando... Velocidad actual: " + velocidad + " km/h");
    }
}