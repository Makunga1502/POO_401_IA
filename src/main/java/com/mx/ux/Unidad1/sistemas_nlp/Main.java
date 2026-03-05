package com.mx.ux.Unidad1.sistemas_nlp;

public class Main {
    public static void main(String[] args) {
        // TODO: Instanciar un objeto de tipo AnalizadorSentimientos usando la referencia de la clase abstracta.
        // Ejemplo: MotorIA miModelo = new ...

        MotorIA agente = new AnalizadorSentimientos();
        agente.analizar("Analizando Sentimientos");

        System.out.println("Sistema de IA Iniciado...");

        agente.analizar("Hoy es un día muy bueno y estoy feliz");
        agente.analizar("El servicio fue terrible");
        agente.analizar("Me corrieron de la chamba y estoy enojado");
        agente.analizar("Me regañaron y estoy triste");
        agente.analizar("Me llegó el recibo de luz y estoy espantado");

        // TODO: Llamar al método analizar con los siguientes textos:
        // 1. "Hoy es un día muy bueno y estoy feliz"
        // 2. "El servicio fue terrible"

        /* REFLEXIÓN PARA EL ALUMNO:
           ¿Puedes cambiar la precisión del modelo directamente con miModelo.precision = 5.0?
           ¿Por qué es importante que el método analizar() oculte los pasos de tokenización?
        */
    }
}

