package com.mx.ux.Unidad1.elementos.robot;

public class Bateria {

    private String nivelBateria;
    private float porcentajeBateria;

    public void chequeoEstado(String nivel, float porcentaje){
        nivelBateria = nivel;
        porcentajeBateria = porcentaje;

        System.out.println("Nivel: " + nivelBateria);
        System.out.println("Porcentaje:" + porcentajeBateria);
    }

    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        bateria.chequeoEstado("Medio", 55.5f);
    }
}
