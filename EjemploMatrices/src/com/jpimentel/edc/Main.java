package com.jpimentel.edc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Matrices
        //Primero Filas, Segundo Columnas
        //primera forma de llenar una matriz
        /*int[][] edad = {{2,3,8,5},{3,4,9,0}};//2x4

        //segunda forma de llenar una matriz
                                    // f  c
        String[][] frutas = new String[3][2];
        frutas[0][0] = "Uva";
        frutas[0][1] = "Naranja";

        frutas[1][0] = "Limon";
        frutas[1][1] = "Fresa";

        frutas[2][0] = "Pera";
        frutas[2][1] = "Piña";
        int f = frutas.length;
        int c = frutas[0].length;
        //System.out.println(frutas[1][1]);
        //For para recorrer las filas
        for (int i = 0; i < 3; i++){
            //For para recorrer las columnas
            for (int j = 0; j < 2; j++){
                System.out.print(frutas[i][j]+" ");
                //frutas[0][0]
                //frutas[0][1]

                //frutas[1][0]
                //frutas[1][1]

                //frutas[2][0]
                //frutas[2][1]
            }
            System.out.println("");
        }
        System.out.println(f);
        System.out.println(c);*/
        //num[0].3 = 3
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[4][3];
        //int[][] num = new int[6][6];
        //Object[][] num = new Object[2][2];
        for (int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.println("Ingrese dato en la posicion "+i+" "+j);
                /*if(j == 0){
                    num[i][j] = sc.next();
                }
                else {
                    num[i][j] = sc.nextInt();
                }*/
            }
        }
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }



    }
}
