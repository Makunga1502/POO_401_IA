package com.mx.ux.Unidad2.practicas.paradigmaoo.gestionEstudiante;

public class Main {
    public static void main(String[] args) {
        Clase miClase = new Clase("Programación POO");

        miClase.agregarEstudiante(new Estudiante("Ana García", 101));
        miClase.agregarEstudiante(new Estudiante("Luis Pérez", 102));
        miClase.agregarEstudiante(new Estudiante("Sofía López", 103));

        miClase.mostrarInscritos();
    }
}