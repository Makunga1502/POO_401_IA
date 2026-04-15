package com.mx.ux.Unidad2.practicas.paradigmaoo.interfacesDispositivos;

class TV implements Encendible {
    public void encender() { System.out.println("TV encendida."); }
    public void apagar() { System.out.println("TV apagada."); }
}