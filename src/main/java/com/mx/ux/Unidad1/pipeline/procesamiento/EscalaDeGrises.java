package com.mx.ux.Unidad1.pipeline.procesamiento;

public class EscalaDeGrises extends FiltroImagen{

    @Override
    public void procesar(){
        System.out.println("Convierte la imagen a una escala de grises");
    }

    EscalaDeGrises escalaDeGrises = new EscalaDeGrises();
}
