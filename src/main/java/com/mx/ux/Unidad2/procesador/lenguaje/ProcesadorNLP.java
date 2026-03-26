package com.mx.ux.Unidad2.procesador.lenguaje;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcesadorNLP {

    protected String textoCrudo;
    public void cargarTexto(String texto){
        this.textoCrudo = texto;

    }

    public abstract List<String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarParaModelo();
}


