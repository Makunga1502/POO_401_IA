package com.mx.ux.Unidad2.interfaces.practica01;

interface Serializable{
    public void a();
}

interface Tokenizable{
    public void b();

}

public interface Entrenable {
    public void c();
}

class modelo implements Serializable, Tokenizable, Entrenable{

    @Override
    public void c() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {
    }

}

