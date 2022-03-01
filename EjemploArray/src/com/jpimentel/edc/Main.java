package com.jpimentel.edc;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Declaracion de un array forma 1
        //Array tipo int
        /*int[] num = new int[4];
        num[0] = 32;
        num[1] = 45;
        num[2] = 75;
        num[3] = 89;
        System.out.println(num[2]);
        for(int i = 0; i < 4; i++){
            System.out.println(num[i]);//0 - //1 - //2
        }
        System.out.println("------------------------------");
        //Declaracion de un arreglo forma 2
        int[] n = {2,6,8,8,6,7,1,3,2,6,4,8,6,9};
        System.out.println(n[6]);
        System.out.println(n.length);
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
        String[] nombres = new String[4];
        nombres[0] = "Pedro";
        nombres[1] = "Karla";
        nombres[2] = "Juan";
        nombres[3] = "Luis";
        String[] apellidos = {"Perez","Ruiz","Lopez"};*/

        /*int[] s = new int[5];
        s[0] = 1;
        s[1] = 1;
        s[2] = 1;
        s[3] = 1;
        s[4] = 1;

        int suma = 0;

        for (int i = 0; i < 5; i++){
            suma = suma + s[i];//suma = 0 + 1 = 1 -- suma
                               //suma = 1 + 1 = 2 -- suma
                               //suma = 2 + 1 = 3 -- suma
                               //suma = 3 + 1 = 4 -- suma
                               //suma = 4 + 1 = 5 -- suma
        }
        System.out.println(suma);*/

        //Arreglo donde se debe ingresar su dimension y luego sus datos por medio del teclado
        /*int dimension;
        dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension que tendra el arreglo"));
        int[] arr = new int[dimension];
        //int[] arr = new int[3];
        *//*
        for(int i = 0; i < 3; i++)
        *//*
        Scanner sc = new Scanner(System.in);
        System.out.println("Es hora de ingresar los datos al Arreglo");
        System.out.println("Arreglo de Dimension "+dimension);

        for (int i = 0; i < dimension; i++){
            System.out.println("Ingrese el dato en la posicion ["+i+"]");
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("Datos ingresados al Arreglo");
        for(int i = 0; i < dimension; i++){
            System.out.print(arr[i]+" ");
        }*/

        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = sc.next();
        int dimension = palabra.length();

        String[] p = new String[dimension];
        //p[1] = "o";
        //HOLA
        //palabra.substring(0,1)
        //palabra.substring(1,2)
        for(int i = 0; i < dimension; i++){
            //p[i] = String.valueOf(palabra.charAt(i));
            p[i] = palabra.substring(i, (i+1));
        }
        for(int i = 0; i < dimension; i++){
            System.out.println(p[i]);
        }
        System.out.println("Cantidad de Letras = "+dimension);

        //Ciclo For Each
        /*String[] n = new String[6];
        n[0] = "Karla";
        n[1] = "Pedro";
        n[2] = "Luis";
        n[3] = "Allan";
        n[4] = "Helen";
        n[5] = "Juan";

        for(String nom: n){
            System.out.println(nom);
        }*/


    }
}
