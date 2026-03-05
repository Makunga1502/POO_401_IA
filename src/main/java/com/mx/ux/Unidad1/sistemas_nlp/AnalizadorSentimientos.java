package com.mx.ux.Unidad1.sistemas_nlp;

public class AnalizadorSentimientos extends MotorIA {

    public AnalizadorSentimientos(){
        super("Sentimient-BERT-Lite", 0.89);
    }

    public void analizar(String texto){
        System.out.println("--- Ejecutando Modelo: " + "---");
        System.out.println("[INFO] Tokenizando texto...");
        System.out.println("[INFO] Extrayendo embeddings semánticos");

        if (texto.toLowerCase().contains("feliz") || texto.toLowerCase().contains("bueno") || texto.toLowerCase().contains("terrible")|| texto.toLowerCase().contains("enojado")|| texto.toLowerCase().contains("triste")|| texto.toLowerCase().contains("espantado")){
            System.out.println("RESULTADO: Sentimiento Positivo (Score: " + Math.random() + ")");
        } else {
            System.out.println("RESULTADO: Sentimiento Negativo o Neutro.");
        }
    }
}
