package com.mx.ux.Unidad1.orquestadorModelos;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClasificadorIA> modelos = new ArrayList<>();

        modelos.add(new ArbolDeDecision("Arbol de Decision"));
        modelos.add(new SupportVectorMachine("Support Vector Machine"));
        modelos.add(new RedNeuronal("Red Neuronal"));

        String datosEntrada = "edad=23, ingreso=12000, historial=bueno";

        for (ClasificadorIA modelo : modelos) {
            modelo.predecir(datosEntrada);
        }
    }

}
