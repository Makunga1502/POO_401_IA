package com.mx.ux.Unidad2.procesador.lenguaje;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcesadorNLP {
    private String textoCrudo;
    protected List <String> tokens = new ArrayList<>();

    public String getTextoCrudo() {
        return textoCrudo;
    }

    public String setTextoCrudo(String textoLimpio){
        return textoCrudo;
    }


    public void cargarTexto(){};
    public abstract List <String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarModelo();
}
