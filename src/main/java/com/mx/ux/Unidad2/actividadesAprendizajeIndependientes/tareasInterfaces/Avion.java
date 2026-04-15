package com.mx.ux.Unidad2.actividadesAprendizajeIndependientes.tareasInterfaces;

class Avion implements PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El avión enciende sus motores y despega de la pista.");
    }
}
