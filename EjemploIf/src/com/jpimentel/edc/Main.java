package com.jpimentel.edc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        //Estructura de Control -- if --
        //Ejemplo1
        /*int n1;
        int n2;
        System.out.println("Validar numeros iguales");
        System.out.println("Ingrese el primer numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        if(n1 == n2){
            System.out.println("Los numeros ingresados son IGUALES");
        }
        else{
            System.out.println("Los numeros ingresados NO son IGUALES");
        }*/
        //Ejemplo2
        /*int n3;
        System.out.println("Validar si un numero es Positivo o Negativo");
        System.out.println("Ingrese un numero");
        n3 = sc.nextInt();
        if(n3 > 0){
            System.out.println(n3+" es POSITIVO");
        }
        else if(n3 == 0){
            System.out.println(n3+ " es NEUTRO");
        }
        else{
            System.out.println(n3+" es NEGATIVO");
        }*/
        //Ejemplo3
        /*int n4;
        int n5;
        System.out.println("Validar cual de los dos numeros es mayor");
        System.out.println("Ingrese el primer numero");
        n4 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n5 = sc.nextInt();

        if(n4 > n5){
            System.out.println("El PRIMER numero es MAYOR al SEGUNDO");
        }
        else if(n4 == n5){
            System.out.println("Ambos numero son IGUALES");
        }
        else{
            System.out.println("El SEGUNDO numero es MAYOR al PRIMERO");
        }*/
        //Ejemplo4
        int n6;
        System.out.println("Numero a letra");
        System.out.println("Ingrese un numero del 0 al 10");
        n6 = sc.nextInt();
        if(n6 == 0){
            System.out.println("CERO");
        }
        else if(n6 == 1){
            System.out.println("UNO");
        }
        else if(n6 == 2){
            System.out.println("DOS");
        }
        else if(n6 == 3){
            System.out.println("TRES");
        }
        else if(n6 == 4){
            System.out.println("CUATRO");
        }
        else if(n6 == 5){
            System.out.println("CINCO");
        }
        else if(n6 == 6){
            System.out.println("SEIS");
        }
        else if(n6 == 7){
            System.out.println("SIETE");
        }
        else if(n6 == 8){
            System.out.println("OCHO");
        }
        else if(n6 == 9){
            System.out.println("NUEVE");
        }
        else if(n6 == 10){
            System.out.println("DIEZ");
        }
        else{
            System.out.println("NUMERO FUERA DE RANGO");
        }
    }
}
