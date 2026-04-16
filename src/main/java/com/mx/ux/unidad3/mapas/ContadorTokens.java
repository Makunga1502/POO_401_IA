package com.mx.ux.unidad3.mapas;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokens {
    public static void main(String[] args) {
        // arreglo de cadenas
        String [] tokens = {"ia", "python", "redes", "neuronas", "ia", "neuronas"};

        // instalacion map (interface) las implementaciones HashMap
        Map<String, Integer> frecuencia = new HashMap<>();

        // iterar el arreglo y llenar el mapa de fecuencias
        for(String d : tokens){
            frecuencia.put(d, frecuencia.getOrDefault(d, 0)+1);
        }

        // obtener las oalabras unicas
        System.out.println("Vocabulario" + " " + frecuencia.keySet());

        // iteramos el map
        for (Map.Entry<String, Integer> entrada: frecuencia.entrySet()){
            System.out.println("Token: "+ " " + entrada.getKey() +
                    " "+ "| Frecuencia: " + entrada.getValue());

        }


    }
}
