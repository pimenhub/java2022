package com.jpimentel.edc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Estructura de Control
        //Switch

        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("Dias de la Semana");
        System.out.println("Ingresar un numero para saber que dia de la Semana es");
        dia = sc.nextInt();

        //Declaracion del switch
        switch (dia){//5
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case  5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("DIA NO ENCONTRADO");
                break;
        }



    }
}
