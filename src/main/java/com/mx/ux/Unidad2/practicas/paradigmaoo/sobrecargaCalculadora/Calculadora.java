package com.mx.ux.Unidad2.practicas.paradigmaoo.sobrecargaCalculadora;

public class Calculadora {
    int sumar(int a, int b) { return a + b; }
    int sumar(int a, int b, int c) { return a + b + c; }
    double sumar(double a, double b) { return a + b; }
}
