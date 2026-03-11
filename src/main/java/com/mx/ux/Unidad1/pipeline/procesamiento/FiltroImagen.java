package com.mx.ux.Unidad1.pipeline.procesamiento;

import java.util.ArrayList;
import java.util.List;

public class FiltroImagen {

    public void procesar(){
        System.out.println("Procesando imagen");
    }

    public static void main(String[] args) {
        List<FiltroImagen> pipeline = new ArrayList<>();

        pipeline.add(new ReductorDeRuido());
        pipeline.add(new DetectorDeBordes());

        // El motor de ejecución no sabe qué filtro es, solo sabe que todos "procesan"
        for(FiltroImagen f:pipeline){
            f.procesar();
        }
    }

}
