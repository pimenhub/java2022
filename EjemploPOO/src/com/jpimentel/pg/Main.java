package com.jpimentel.pg;


import com.jpimentel.pg1.Mecanica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.size();
        Predio predio = new Predio("Pedro",10);
        System.out.println(predio.getNombre());
        System.out.println(predio.getEdad());

        Predio predio1 = new Predio();

        Predio predio2 = new Predio("Hola");

        Predio predio3 = new Predio(35);


        Vehiculo sedan = new Vehiculo();
        sedan.marca = "Mazda";
        sedan.modelo = "3";
        sedan.anio = 2010;
        sedan.color = "Rojo";
        System.out.println(sedan.marca +" "+ sedan.modelo +" "+ sedan.anio +" "+ sedan.color);
        sedan.arrancar();
        System.out.println("Velocidad en Millas "+sedan.velocidad());

        Vehiculo suv = new Vehiculo();
        suv.marca = "Ford";
        suv.modelo = "Explore";
        suv.anio = 2008;
        suv.color = "Gris";
        System.out.println(suv.marca +" "+ suv.modelo +" "+ suv.anio +" "+ suv.color);
        suv.arrancar();
        System.out.println("Velocidad en Millas "+suv.velocidad());

        Mecanica m = new Mecanica();
        m.metodo1();
    }
}
