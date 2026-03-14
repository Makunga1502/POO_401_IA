package com.mx.ux.Unidad1.orquestadorModelos;

public class ArbolDeDecision extends ClasificadorIA {

    public ArbolDeDecision(String nombreModelo){
        super(nombreModelo);
    }

    @Override
    public void predecir(String datosEntrada) {
        System.out.println(nombreModelo + ": Clasificador de reglas tipo árbol usando los datos: " + datosEntrada);


    }
}
