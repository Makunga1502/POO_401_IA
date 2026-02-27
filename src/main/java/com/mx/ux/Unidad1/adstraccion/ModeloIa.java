package com.mx.ux.Unidad1.adstraccion;

public abstract class ModeloIa {
    protected  String nombre;

    public ModeloIa(String nombre) { this.nombre = nombre; }

    public abstract void procesarEntrada(String entrada);
}
