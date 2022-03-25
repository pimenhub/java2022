package com.jpimentel.pg;

public class Flauta extends Instrumentos{

    public void holaF(){
        System.out.println("Hola, soy el instrumento Flauta");
    }

    public Flauta() {
    }

    @Override
    public void sonido() {
        System.out.println("Sonido suave");
    }

    @Override
    public void utilizacion() {
        System.out.println("Esta se debe utilizar soplando y tapando los difirentes agujeros por nota");
    }
}
