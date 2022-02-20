package com.jpimentel.edc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Estructura de Control
        //Bucle o Ciclo for

        //0 a 100
        /*for(int i = 0; i <= 100; i++){
            System.out.println("No. "+i);
        }*/
        //100 a 0
        /*for(int i = 100; i >= 0; i--){
            System.out.println("No. "+i);
        }*/

        Scanner sc = new Scanner(System.in);
        int dato;
        int suma = 0;
        for(int i = 1; i <= 15; i++){
            System.out.println("Ingrese un numero en la posicion "+i);
            dato = sc.nextInt();//1
            //contador//acumulador
            suma = suma + dato;//suma = 0 + 1 en la primera vuelta
                               //suma = 1 + 1 en la segunda vuelta
                               //suma = 2 + 1 en la tecera vuelta
            System.out.println(suma);
        }
        System.out.println("La suma es "+suma);


    }
}
