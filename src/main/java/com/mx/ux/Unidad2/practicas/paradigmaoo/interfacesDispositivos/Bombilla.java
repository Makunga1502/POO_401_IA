package com.mx.ux.Unidad2.practicas.paradigmaoo.interfacesDispositivos;

class Bombilla implements Encendible {
    public void encender() { System.out.println("Bombilla iluminando..."); }
    public void apagar() { System.out.println("Bombilla apagada."); }
}