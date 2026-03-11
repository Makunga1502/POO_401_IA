package com.mx.ux.Unidad1.pipeline.procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Lista polimórfica que acepta cualquier tipo de filtro
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
