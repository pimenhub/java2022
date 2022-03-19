package com.jpimentel.pg;

public class Predio {
    private String nombre;
    private int edad;
    public String apellido;

    public Predio() {
    }

    public Predio(String n){
        nombre = n;
    }

    public Predio(int edad) {
        this.edad = edad;
    }

    public Predio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void m(){
        String nombre;
        nombre = "HOLA";
        this.nombre = "Como estas";
        this.edad = 33;
        int n = 2;
        this.m2();
    }

    public void m2(){
        String nombre;
        nombre = "HOLA";
        this.nombre = "Como estas";
        this.edad = 33;
        this.m();
    }
    public void m3(){
        this.m();//result m
        this.m2();//result m2
        String a = Vehiculo.IP;

    }


}
