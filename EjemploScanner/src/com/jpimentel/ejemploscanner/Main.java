package com.jpimentel.ejemploscanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       //Un objeto es la instancia de una clase
        //crear nuestro objeto de la clase scanner
       //1 - identificar la clase de la cual crearemos el objeto
       //2 - realizar la instacia (crear el objeto referente a la clase)

        int n1;
        int n2;
        int suma;//resultado
        int resta;//resultado

        Scanner teclado = new Scanner(System.in);
        System.out.println("Operaciones Basicas");
        System.out.println("Ingrese el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = teclado.nextInt();
        //Realizar operacion
        suma = n1 + n2;
        resta = n1 - n2;
        System.out.println("La suma de los dos numeros ingresados es "+suma);
        System.out.println("La resta de los dos numeros ingresados es "+resta);

    }
}
