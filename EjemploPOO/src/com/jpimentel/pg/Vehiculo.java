package com.jpimentel.pg;

public class Vehiculo {
    //Variables
    public String color;
    public String marca;
    public String modelo;
    public int anio;

    public static final String IP = "192.168.1.1";

    public Vehiculo(){
    }


    //Metodos
    //MA  Retorno nombre
    public void arrancar(){
        System.out.println("Rrrrm, Arranque");
    }

    protected double velocidad(){
        double vel;
        vel = 175 * 1.6;
        return vel;
    }


}
