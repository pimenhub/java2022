package com.jpimentel.pg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int radio;
        System.out.println("Conocer el Area de un Circulo");
        System.out.println("Ingrese el el radio de un circulo");
        radio = sc.nextInt();
        double area;
        area = Math.PI * (radio * radio);
        System.out.println("El area segun el radio ingresado es: "+area);
    }
}
