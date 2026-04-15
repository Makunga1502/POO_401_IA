package com.mx.ux.Unidad2.practicas.paradigmaoo.herenciaSistemaVehiculos;

public class Main {
    public static void main(String[] args) {
        // Creamos los objetos
        Vehiculo miBici = new Bicicleta();
        Vehiculo miAuto = new Automovil();

        System.out.println("--- Probando Bicicleta ---");
        miBici.acelerar();
        miBici.acelerar();

        System.out.println("\n--- Probando Automóvil ---");
        miAuto.acelerar();
        miAuto.acelerar();
    }
}