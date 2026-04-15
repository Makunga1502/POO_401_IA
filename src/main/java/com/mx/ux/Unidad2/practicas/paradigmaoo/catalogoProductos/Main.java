package com.mx.ux.Unidad2.practicas.paradigmaoo.catalogoProductos;

public class Main {
    public static void main(String[] args) {
        Producto[] catalogo = new Producto[2];
        catalogo[0] = new Electronica("Laptop", 1200.50, 12);
        catalogo[1] = new Alimento("Leche", 2.50, "20-10-2026");

        for (Producto p : catalogo) {
            p.mostrarDetalles();
        }
    }
}
