package com.jpimentel.pg;

public class Guitarra extends Instrumentos {

    public void holaG(){
        System.out.println("Hola, soy el instrumento Guitarra");
    }

    //Constructor
    public Guitarra() {
    }

    @Override
    public void sonido() {
        System.out.println("Sonido acustico");
    }

    @Override
    public void utilizacion() {
        System.out.println("Se debe utilizar con las dos manos rosando las cuerdas");
    }
}
