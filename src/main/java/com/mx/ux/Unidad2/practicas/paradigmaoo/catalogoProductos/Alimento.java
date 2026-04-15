package com.mx.ux.Unidad2.practicas.paradigmaoo.catalogoProductos;

class Alimento extends Producto {
    String fechaCaducidad;

    Alimento(String nombre, double precio, String fecha) {
        super(nombre, precio);
        this.fechaCaducidad = fecha;
    }

    @Override
    void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" | Caduca el: " + fechaCaducidad);
    }
}
