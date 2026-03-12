package com.mx.ux.Unidad1.optimizador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OptimizadorIA> optimizadores = new ArrayList<>();

        optimizadores.add(new DescensoGradiente("Descenso Gradiente"));
        optimizadores.add(new AlgoritmoGenetico("algoritmo Genetico"));

        for (OptimizadorIA f: optimizadores){
            f.ajustarParametros();
        }
    }
}
