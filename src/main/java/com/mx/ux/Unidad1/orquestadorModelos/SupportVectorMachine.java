package com.mx.ux.Unidad1.orquestadorModelos;

public class SupportVectorMachine extends ClasificadorIA{

    public SupportVectorMachine(String nombreModelo){
        super(nombreModelo);
    }

    @Override
    public void predecir(String datosEntrada) {
        System.out.println(nombreModelo + ": Separando clases con un hiperplano usando los datos: " + datosEntrada);

    }
}
