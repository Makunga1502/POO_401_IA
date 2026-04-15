package com.mx.ux.Unidad2.practicas.paradigmaoo.catalogoProductos;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarDetalles() {
        System.out.print("Producto: " + nombre + " | Precio: $" + precio);
    }
}