package com.jpimentel.pg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Violin extends Tambor {

    private String fuerza;
    private String nombre;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String nom;

    public void holaV(){
        System.out.println("Hola, soy el instrumento Violin");
    }

    public Violin() {
    }

    //Ejemplo de palabra reservada "this"
    public void setFuerza(String fuerza){
        this.fuerza = fuerza;
    }
    public void mostrar(){
        this.holaV();
        this.a = "Hola";
        b = 55;
    }

    void mensaje(){
        System.out.println("Hola soy Violin y estoy muy bien");
    }
    //Ejemplo de palabra reservada "super"
    public void mostrarMetodos(){

        this.nombre = "Violin";
        super.nombre = "Tambor";
        System.out.println("Clase SuperClase/ClasePadre "+ super.nombre);
        System.out.println("Clase SubClase/ClaseActual "+ this.nombre);

        super.mensaje();
        this.mensaje();

    }


}
