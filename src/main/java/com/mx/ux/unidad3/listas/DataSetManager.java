package com.mx.ux.unidad3.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSetManager {
    public static void main(String[] args) {

        List<String> dataset = new ArrayList<>();
        dataset.add("gato_01.jpg");
        dataset.add("gato_02.jpg");
        dataset.add("gato_03.jpg");
        dataset.add("gato_04.jpg");
        dataset.add("gato_05.png");

        System.out.println("dataset original "+ " " + dataset);

        //Metodo para saber el tamaño de la lista
        System.out.println("Tamaño de lista (dataset) " + dataset.size());

        //saber si la lista contiene un elementop especifico
        //remove para eliminar una posicion en especifico
        if(dataset.contains("gato_05.png")){
            int index = dataset.indexOf("gato_05.png");
            System.out.println("Encontro " + " " + index);
            dataset.remove(index);

        }

        //creacion de sublista
        List<String> sublista = dataset.subList(0, 3);
        System.out.println("sublista = " + sublista);

        //para remplazar un elemento especifico
        dataset.set(0, dataset.get(0).replace(".jpg", ".tmp"));

        //Metodo clear
        System.out.println("ultimo elelmto " + dataset.get(0));
        dataset.clear();
        System.out.println("Tamaño de la lista actual "+ " " + dataset.size());

    }
}
