package com.jpimentel.pg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Samsung s = new Samsung();
        Apple a = new Apple();

        System.out.println("Smartphone Samsung");
        s.sistema();
        System.out.println(s.marca());
        s.material("AMOLED","Cristal y Aluminio");
        s.spen();
        System.out.println("---------------------------------------------------");
        System.out.println("Smartphone Apple");
        a.sistema();
        System.out.println(a.marca());
        a.material("IPS", "Cristal");
        a.faceid();






    }
}
