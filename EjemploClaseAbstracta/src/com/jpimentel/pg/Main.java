package com.jpimentel.pg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Guitarra g = new Guitarra();
        System.out.println(g.instrumento());
        g.holaG();
        System.out.println("Material "+(g.material = "Madera"));
        System.out.println("Tipo "+(g.tipo = "Cuerdas"));
        g.sonido();
        g.utilizacion();

        System.out.println("---------------------------------------------------");

        Instrumentos f = new Flauta();
        System.out.println(f.instrumento());
        System.out.println(f.material = "Madera");
        System.out.println(f.tipo = "Viento");
        f.sonido();
        f.utilizacion();

        System.out.println("---------------------------------------------------");

        Trompeta t = new Trompeta();
        System.out.println(t.instrumento());
        t.holaTr();
        t.sonido();
        t.utilizacion();


        System.out.println("---------------------------------------------------");

        Violin v = new Violin();
        v.holaV();
        System.out.println(v.s(2,3));

        Tambor tt = new Tambor();
        tt.holaT();
        System.out.println(tt.s(5,55));



    }
}
