package com.mx.ux.Unidad1.Kernel;

public class FiltroImagen {

    public void aplicar(){
        System.out.println("Se estan procesando pixeles");
    }

    public class Ejemplo{
        public static void main(String[] args) {
            DetectorDeBordes filtro1 = new DetectorDeBordes();
            filtro1.aplicar();
        }

    }
}
