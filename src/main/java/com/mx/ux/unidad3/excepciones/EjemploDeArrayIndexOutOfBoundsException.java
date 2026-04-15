package com.mx.ux.unidad3.excepciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploDeArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        List<Integer> listaEneteros = new ArrayList<>();
        listaEneteros.add(1);
        listaEneteros.add(2);
        listaEneteros.add(3);

        System.out.println(listaEneteros.get(5));

        try {
            listaEneteros.add(1);
            listaEneteros.add(2);
            listaEneteros.add(3);

            System.out.println(listaEneteros.get(5));
        }catch (Exception e){
            System.out.println("Nombre de clase " + " " + e.getClass());
            System.out.println("Exception " + " " + e.getStackTrace());
            System.out.println("Causa " + " " + e.getCause());
            System.out.println("Metodo " + " " + "Main");
        }
    }
}
