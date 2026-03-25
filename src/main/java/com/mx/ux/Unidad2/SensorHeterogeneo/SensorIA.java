package com.mx.ux.Unidad2.SensorHeterogeneo;

public abstract class SensorIA {
    private String modelo;
    private double consumoEnergia;


    public SensorIA(String modelo, double consumoEnergia) {
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    //Getter
    public String getModelo() {
        return modelo;
    }
    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    //Setter
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public abstract void leerDatos();
}
