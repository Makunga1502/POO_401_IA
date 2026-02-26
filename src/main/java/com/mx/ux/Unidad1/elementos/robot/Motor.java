package com.mx.ux.Unidad1.elementos.robot;

public class Motor {

    private String tipoPotencia;
    private Float cantidadFuerza;

    public void asignarFuncion (String Potencia, Float Fuerza){
        tipoPotencia = Potencia;
        cantidadFuerza = Fuerza;

        System.out.println("Potencia: " + tipoPotencia);
        System.out.println("Fuerza: " + cantidadFuerza);
    }

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.asignarFuncion("Alta", 65.0f);
    }
}
