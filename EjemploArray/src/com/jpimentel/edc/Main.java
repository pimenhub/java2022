package com.jpimentel.edc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Declaracion de un array forma 1
        //Array tipo int
        int[] num = new int[4];
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
        String[] apellidos = {"Perez","Ruiz","Lopez"};


    }
}
