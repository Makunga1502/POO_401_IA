package com.mx.ux.Unidad1.procesamiento.de.señales;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<ProcesadorDeAudio> procesadores = new ArrayList<>();

        procesadores.add(new ReductorDeEco());
        procesadores.add(new Ecualizador());
        procesadores.add(new Normalizador());

        for (ProcesadorDeAudio p : procesadores) {
            p.filtrar();
        }

    }
}
