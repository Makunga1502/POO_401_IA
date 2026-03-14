package com.mx.ux.Unidad1.ordenamiento.de.agentes;

public class Main {
    public static void main(String[] args) {

        AgenteInteligente[] agentes = new AgenteInteligente[3];

        agentes[0] = new Explorador();
        agentes[1] = new Recolector();
        agentes[2] = new Defensor();

        for(AgenteInteligente a : agentes){
            a.tomarDecision();
        }

    }
}
