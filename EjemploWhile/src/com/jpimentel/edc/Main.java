package com.jpimentel.edc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Estructura de Control While
        //Declaracion del while
        /*int w = 1;
        while (w < 5){
            System.out.println("Hola soy "+w);
            w++;
        }*/
        Scanner sc = new Scanner(System.in);
        //Ejemplo 1
        /*int num;
        int cuadrado;
        System.out.println("Conozca el cuadrado de diferentes numero");
        System.out.println("Si desea terminar el proceso ingrese un numero negativo");
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        while(num > -1){
            cuadrado = num * num;
            System.out.println("El cuadrado de "+num+" es: "+cuadrado);

            System.out.println("Ingrese un numero");
            num = sc.nextInt();
        }
        System.out.println("Bye");*/

        //Ejemplo 2
        int num2;
        System.out.println("Conozca si un numero es negativo o positivo");
        System.out.println("Si desea salir, ingrese un 0");
        System.out.println("Ingrese un numero");
        num2 = sc.nextInt();
        while (num2 != 0){
            if(num2 > 0){
                System.out.println(num2+" es POSITIVO");
            }
            else {
                System.out.println(num2+" es NEGATIVO");
            }
            System.out.println("Ingrese un numero");
            num2 = sc.nextInt();
        }
        System.out.println("Bye...");





    }
}
