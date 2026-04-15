package com.mx.ux.Unidad2.practicas.paradigmaoo.gestionEmpleados;

class Empleado {
    private int id;
    private double salario;

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public double getSalario() {
        return this.salario;
    }
}