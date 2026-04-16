package com.mx.ux.Unidad2.ejercicios.base;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        var notaExamen = 80;

        if (notaExamen >= 60){
            System.out.println("Felicidades Aprobado");
            if (notaExamen >= 90){
                System.out.println("Excelente desenpeño");
            }
        }
        else {
            System.out.println("Reprobado");
        }

        // Sentencia switch
        char calificacionLiteral;
        switch (notaExamen){
            case 100:
            case 90:
                calificacionLiteral = 'A';
                break;
            case 80:
                calificacionLiteral = 'B';
                break;
            case 70:
                calificacionLiteral = 'C';
                break;
            case 60:
                calificacionLiteral = 'D';
                break;
            default:
                calificacionLiteral = 'F';
                break;


        }
        System.out.println("Tu calificación es  = " + calificacionLiteral);




    }
}
