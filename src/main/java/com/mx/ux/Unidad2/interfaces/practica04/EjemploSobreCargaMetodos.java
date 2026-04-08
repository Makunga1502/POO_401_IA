package com.mx.ux.Unidad2.interfaces.practica04;

import com.mx.ux.Unidad1.dataset.DataSet;

public class EjemploSobreCargaMetodos {
    public void entrenar(DataSet[] dataSets){
        System.out.println("Metodo entrenar con 1 parametro");
    }

    public void entrenar(DataSet[] dataSets, int epocas){
        System.out.println("Metodo entrenar sobrecargado");
    }
}
