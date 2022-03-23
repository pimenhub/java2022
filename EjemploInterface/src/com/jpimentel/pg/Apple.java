package com.jpimentel.pg;

public class Apple implements Smartphone{
    public Apple(){
    }

    @Override
    public void sistema() {
        System.out.println("IOS");
    }

    @Override
    public String marca() {
        String m = "Iphone 12 Pro MAX";
        return m;
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
    public void faceid(){
        System.out.println("Debes identificarte con tu rostro");
    }
}
