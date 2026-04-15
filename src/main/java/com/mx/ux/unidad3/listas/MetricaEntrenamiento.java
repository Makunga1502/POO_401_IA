package com.mx.ux.unidad3.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class MetricaEntrenamiento {

    int epoca;
    double loss;
    double accuracy;

        public MetricaEntrenamiento(int epoca, double loss, double accuracy) {
        this.epoca = epoca;
        this.loss = loss;
        this.accuracy = accuracy;
        }

    @Override
    public String toString(){
            return "MetricaEntrenamiento{" +
                    "epoca=" + epoca +
                    ", loss=" + loss +
                    ", accuracy=" + accuracy +
                    '}';
    }


    public class MonitorIA{
        public static void main(String[] args) {
            List<MetricaEntrenamiento> metricas = new ArrayList<>();
            metricas.add(new MetricaEntrenamiento(10,.15,30.45));
            metricas.add(new MetricaEntrenamiento(20,.20,40.85));
            metricas.add(new MetricaEntrenamiento(30,.25,726.548));
            metricas.add(new MetricaEntrenamiento(40,.30,521.251));

            System.out.println("Lista de metrica de entrenamiento " + metricas);

            //imprimir el primer y ultimo elemento


            // eliminar el primer y ultimo elemento
                metricas.remove(0);
                metricas.remove(4);

            }
        }
    }

