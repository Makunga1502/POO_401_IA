package com.mx.ux.Unidad2.practicas.paradigmaoo.gestionEstudiante;

import java.util.ArrayList;

class Clase {
    String nombreDeClase;
    ArrayList<Estudiante> listaEstudiantes;

    Clase(String nombreDeClase) {
        this.nombreDeClase = nombreDeClase;
        this.listaEstudiantes = new ArrayList<>();
    }

    void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }

    void mostrarInscritos() {
        System.out.println("Estudiantes en " + nombreDeClase + ":");
        for (Estudiante e : listaEstudiantes) {
            System.out.println("- " + e.nombre + " (ID: " + e.id + ")");
        }
    }
}