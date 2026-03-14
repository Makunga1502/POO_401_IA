package com.mx.ux.Unidad1.orquestadorModelos;

public abstract class ClasificadorIA {
    public String nombreModelo;

    public ClasificadorIA(String nombreModelo){
        this.nombreModelo = nombreModelo;
    }

    public abstract void predecir(String datosEntrada);
}
