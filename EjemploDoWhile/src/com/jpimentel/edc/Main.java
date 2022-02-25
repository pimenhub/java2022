package com.jpimentel.edc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Estructura de Control
        //Declarar Do While

        /*int dw = 7;
        do{
            System.out.println("Hola soy "+ dw);
            dw++;
        }
        while (dw < 10);*/
        //Se declara la clase Scanner
        Scanner sc = new Scanner(System.in);
        int dw;
        System.out.println("Introducir un numero");
        dw = sc.nextInt();
        do {
            if (dw >= 0 && dw <= 5) {
                System.out.println("Numero ingresado" + dw);
                System.out.println("Multiplicacion * 100 " + (dw * 100));
                System.out.println("Multiplicacion * 1000 " + (dw * 1000));
                System.out.println("Introducir un numero");
                dw = sc.nextInt();

            } else {
                System.out.println("Fuera de rango");

                System.out.println("Introducir un numero");
                dw = sc.nextInt();
            }

        } while (dw >= 0 && dw <= 5);
        System.out.flush();
    }
}
