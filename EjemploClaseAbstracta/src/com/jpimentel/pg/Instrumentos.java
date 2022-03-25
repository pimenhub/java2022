package com.jpimentel.pg;

public abstract class Instrumentos {
    public String material;
    public String tipo;

    public Instrumentos(){
    }

    public String instrumento(){
        String mensaje = "La buena musica toca el alma";
        return mensaje;
    }

    public abstract void sonido();
    public abstract void utilizacion();
}
