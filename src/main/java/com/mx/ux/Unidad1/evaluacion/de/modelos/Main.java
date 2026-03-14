package com.mx.ux.Unidad1.evaluacion.de.modelos;

public class Main {

    public static void main(String[] args) {

        EvaluadorMetricas[] metricas = new EvaluadorMetricas[2];

        metricas[0] = new ErrorCuadraticoMedio();
        metricas[1] = new ErrorAbsolutoMedio();

        for(EvaluadorMetricas m : metricas){
            m.calcularError();
        }

    }
}
