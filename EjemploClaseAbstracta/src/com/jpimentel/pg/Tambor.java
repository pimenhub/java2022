package com.jpimentel.pg;

public class Tambor extends Instrumentos{

    String a = "Casa";
    int b = 5;
    String nombre;
    public void holaT(){
        System.out.println("Hola, soy el instrumento Tambor");
    }

    public Tambor() {
    }

    @Override
    public void sonido() {
        
    }

    @Override
    public void utilizacion() {

    }

    public int s(int a, int b){
        return a + b;
    }
    void mensaje(){
        System.out.println("Hola soy Tambor, como estas");
    }
}
