package com.mx.ux.Unidad2.procesador.lenguaje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String texto = "El modelo es excelente, es un modelo muy bueno y genial";

        List<ProcesadorNLP> procesador = new ArrayList<>();

        procesador.add(new ProcesadorSimple());
        procesador.add(new ProcesadorAnalisisSentimiento());

        for (ProcesadorNLP p: procesador){
            System.out.println("\n=== Procesador" + p.getClass().getSimpleName() + "===");
            p.cargarTexto(texto);
            p.limpiarTexto();
            List<String> tokens = p.tokenizar();
            Object resultado = p.transformarModelo();

            System.out.println("Tokens" + tokens);
            System.out.println("Resultados" + resultado);
        }
    }
}
