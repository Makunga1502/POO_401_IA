package com.mx.ux.unidad3.excepciones;

public class NullPointerException {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        NullPointerException cs = null;
        //cs.getNumero(0);

        try {
           // NullPointerException cs = null;
           // System.out.printf(cs.getNumero());
        } catch (Exception e){
            System.out.println("error = " + e.getMessage());
        }
        System.out.println(cs.getNumero());

    }
}
