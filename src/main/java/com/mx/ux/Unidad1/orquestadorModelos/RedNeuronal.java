package com.mx.ux.Unidad1.orquestadorModelos;

public class RedNeuronal extends ClasificadorIA{

    public RedNeuronal(String nombreModelo) {
        super(nombreModelo);
    }

    @Override
    public void predecir(String datosEntrada) {
        System.out.println(nombreModelo + ":procesando capas neuronales con los datos: " + datosEntrada);

    }
}
