package com.jpimentel.pg;

import java.awt.event.ActionEvent;

public class Samsung implements Smartphone{
    public Samsung(){
    }


    @Override
    public void sistema() {
        System.out.println("Android");
    }

    @Override
    public String marca() {
        String marca = "Samsung S22 Ultra";
        return marca;
    }

    @Override
    public void material(String pantalla, String carcasa) {
        System.out.println("Este tiene un tipo de pantalla "+ pantalla);
        System.out.println("Esta elaborado en "+ carcasa);
    }

    @Override
    public void extras() {
    }

    //Metodo que pertenece directamente a la clase
    public void spen(){
        System.out.println("Hola soy el SPen " + 2022);
    }

}
