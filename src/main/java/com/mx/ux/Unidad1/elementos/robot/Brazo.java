package com.mx.ux.Unidad1.elementos.robot;

public class Brazo {

    // Atributos
    private String tipoMovimiento;
    private Float Velocidad;

    public void asignarMovimiento(String movimiento,Float vel){
        tipoMovimiento = movimiento;
        Velocidad = vel;

        System.out.println("Movimiento: " + tipoMovimiento);
        System.out.println("Velocidad: " + Velocidad);
    }

    // Metodo main
    public static void main(String[] args) {
        Brazo brazo = new Brazo();
        brazo.asignarMovimiento("Arriba", 5.5f);
    }

}
