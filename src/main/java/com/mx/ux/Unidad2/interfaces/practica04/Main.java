package com.mx.ux.Unidad2.interfaces.practica04;

import com.mx.ux.Unidad1.dataset.DataSet;

public class Main {
    public static void main(String[] args) {

        EjemploSobreCargaMetodos carga = new EjemploSobreCargaMetodos();

        DataSet[] dataSets = new DataSet[5];
        int epoca = 1;

        carga.entrenar(dataSets, epoca);
    }
}
