package com.mx.ux.unidad3.set;

import java.util.*;

public class GeneradorVocabulario {
    public static void main(String[] args) {
        String texto = "el modelo de ia es un modelo bueno porque el modelo aprende";
        String [] tokens = texto.split(" ");

        //Instanciamos un set con la implementacion HashSet
        Set<String> vocabulario = new HashSet<>();

        //iteramos el arreglo de tokens y agragamos al set
        for (String t: tokens){
            vocabulario.add(t);
        }
        System.out.println("vocabulario = " + vocabulario);
        System.out.println("palabras procesadas"+ " " + tokens.length);
        System.out.println("numero de palabras" + " " +vocabulario.size());
        System.out.println("vocabulario final"+ " " + vocabulario);

        if (vocabulario.contains("ia")){
            System.out.println("El vocabulario contiene la palabra ia");
        }

    }
}
