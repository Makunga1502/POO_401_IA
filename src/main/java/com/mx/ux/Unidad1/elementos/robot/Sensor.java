package com.mx.ux.Unidad1.elementos.robot;

public class Sensor {
    private String Estatus;
    private Boolean DetectoMovimiento;

    public void estatusActual(String estatus, Boolean deteccion){
        Estatus = estatus;
        DetectoMovimiento = deteccion;

        System.out.println("Estatus: "+ Estatus);
        System.out.println("Detección de movimiento: " + DetectoMovimiento);
    }

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.estatusActual("Activo",true);
    }
}
