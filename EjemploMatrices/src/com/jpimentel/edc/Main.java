package com.jpimentel.edc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Matrices
        //Primero Filas, Segundo Columnas
        //primera forma de llenar una matriz
        int[][] edad = {{2,3,8,5},{3,4,9,0}};//2x4

        //segunda forma de llenar una matriz
                                    // f  c
        String[][] frutas = new String[3][2];
        frutas[0][0] = "Uva";
        frutas[0][1] = "Naranja";
        frutas[1][0] = "Limon";
        frutas[1][1] = "Fresa";
        frutas[2][0] = "Pera";
        frutas[2][1] = "Piña";

        System.out.println(frutas[2][1]);


    }
}
