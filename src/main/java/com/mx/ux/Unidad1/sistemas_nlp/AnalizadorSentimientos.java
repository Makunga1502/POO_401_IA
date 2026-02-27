package com.mx.ux.Unidad1.sistemas_nlp;

class AnalizadorSentimientos extends MotorIA {

    public AnalizadorSentimientos(){
        super("Sentimient-BERT-Lite", 0.89);
    }

    public void analizar(String texto){
        System.out.println("--- Ejecutando Modelo: " + "---");
        System.out.println("[INFO] Tokenizando texto...");
        System.out.println("[INFO] Extrayendo embeddings semánticos");

        if (texto.toLowerCase().contains("fliz") || texto.toLowerCase().contains("bueno")){
            System.out.println("RESULTADO: Sentimiento Positivo (Score: " + Math.random() + ")");
        } else {
            System.out.println("RESULTADO: Sentimiento Negativo o Neutro.");
        }
    }
}
