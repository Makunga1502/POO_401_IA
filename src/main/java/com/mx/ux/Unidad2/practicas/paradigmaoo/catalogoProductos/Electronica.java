package com.mx.ux.Unidad2.practicas.paradigmaoo.catalogoProductos;

class Electronica extends Producto {
    int garantia;

    Electronica(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" | Garantía: " + garantia + " meses");
    }
}
