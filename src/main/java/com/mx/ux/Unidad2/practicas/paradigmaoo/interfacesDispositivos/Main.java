package com.mx.ux.Unidad2.practicas.paradigmaoo.interfacesDispositivos;

public class Main {
    public static void main(String[] args) {
        Encendible[] dispositivos = new Encendible[2];


        dispositivos[0] = new TV();
        dispositivos[1] = new Bombilla();

        System.out.println("--- Ejecutando Ciclo de Dispositivos ---");


        for (Encendible dispositivo : dispositivos) {
            dispositivo.encender();
            dispositivo.apagar();
            System.out.println("-----------------------");
        }
    }
}
