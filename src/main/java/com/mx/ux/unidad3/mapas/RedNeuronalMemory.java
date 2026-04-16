package com.mx.ux.unidad3.mapas;


import java.util.HashMap;
import java.util.Map;

public class RedNeuronalMemory {
    public static void main(String[] args) {

        //crear un mapa que reciba String y double
        //implementando HashMap
        Map<String, Double> mapa = new HashMap<>();

        //agregar valores al mapa
        mapa.put("w1", 0.57);
        mapa.put("w2", 0.17);
        mapa.put("w4", 0.47);
        mapa.put("w5", 0.27);

        //crear implementacion para suamr los pesos del mapa
        double sumaPesos = 0.00;
        for(Double d : mapa.values()){
            if(mapa.containsKey("w1")){
                mapa.replace("w1", 0.87);
            }
            sumaPesos += d;
        }
        System.out.println("La suma total de los pesos del mapa es"+ " " + sumaPesos);

        //metodo remover de map
        mapa.remove("w2");

        System.out.println("Mapa despues de remover w2" + mapa);
    }

}
