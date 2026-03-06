package com.mx.ux.Unidad1.Kernel;

public class Main {
    public static void main(String[] args) {
        FiltroImagen filtro1 = new DetectorDeBordes();
        FiltroImagen filtro2 = new ReductorDeRuido();

        filtro1.aplicar();
        filtro2.aplicar();
    }
}
