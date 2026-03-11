package com.mx.ux.Unidad1.dataset;

public class Main {
    public static void main(String[] args) {
        DatasetImagen img = new DatasetImagen();
        DatasetTexto txt = new DatasetTexto();

        img.cargarDatos();
        txt.cargarDatos();
    }
}
