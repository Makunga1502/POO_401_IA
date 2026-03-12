package com.mx.ux.Unidad1.optimizador;
import java.util.ArrayList;
import java.util.List;

public abstract class OptimizadorIA {
    protected String nombreAlgoritmo;

    public OptimizadorIA(String nombreAlgoritmo){
        this.nombreAlgoritmo = nombreAlgoritmo;
    }

    public abstract void ajustarParametros();


}
