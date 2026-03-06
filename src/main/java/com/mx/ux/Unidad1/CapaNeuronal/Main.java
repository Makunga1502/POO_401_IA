package com.mx.ux.Unidad1.CapaNeuronal;

public class Main {
    public static void main(String[] args) {
        CapaNeuronal capa1 = new CapaConvolucional();
        CapaNeuronal capa2 = new CapaDensa();

        capa1.propagacionHaciaAdelante();
        capa2.propagacionHaciaAdelante();
    }
}
