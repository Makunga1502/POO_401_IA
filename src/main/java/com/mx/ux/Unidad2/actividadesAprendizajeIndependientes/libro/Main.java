package com.mx.ux.Unidad2.actividadesAprendizajeIndependientes.libro;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.paginas = 471;

        Libro libro2 = new Libro();
        libro2.titulo = "1984";
        libro2.autor = "George Orwell";
        libro2.paginas = 328;

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}