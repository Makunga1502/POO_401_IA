package com.mx.ux.Unidad2.actividadesAprendizajeIndependientes.bancoEncapsulamiento;

class CuentaBancaria {
    private double saldo; // Atributo oculto

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } else {
            System.out.println("Error: Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}