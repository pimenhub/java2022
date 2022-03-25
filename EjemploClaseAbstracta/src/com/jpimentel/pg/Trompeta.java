package com.jpimentel.pg;

public class Trompeta extends Instrumentos{

    public void holaTr(){
        System.out.println("Hola, soy el instrumento Trompeta");
    }

    public Trompeta() {
    }

    @Override
    public void sonido() {
        System.out.println("Sonido fuerte");
    }

    @Override
    public void utilizacion() {
        System.out.println("Se debe utilizar soplando por la boquia y asi mismo precionar los botones por nota");
    }
}
