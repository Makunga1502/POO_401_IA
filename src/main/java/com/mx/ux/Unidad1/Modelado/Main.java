package com.mx.ux.Unidad1.Modelado;

public class Main {
    public static void main(String[] args) {
        Drone drone1 = new Drone(1, "100%");
        Drone drone2 = new Drone(2, "100%");
        Drone drone3 = new Drone(3, "100%");

        System.out.println("Estado inicial: ");
        System.out.println("Drone 1 con porcentaje de batería de: " + drone1.NivelBateria);
        System.out.println("Drone 2 con porcentaje de batería de: " + drone2.NivelBateria);
        System.out.println("Drone 3 con porcentaje de batería de: " + drone3.NivelBateria);

        drone1.NivelBateria = "50%";

        System.out.println("Modificación de la batería del Drone 1:");

        System.out.println("Drone 1 bateria: " + drone1.NivelBateria);
        System.out.println("Drone 2 bateria: " + drone2.NivelBateria);
        System.out.println("Drone 3 bateria: " + drone3.NivelBateria);
    }
}
