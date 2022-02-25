package com.jpimentel.edc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Estructuras de Control
        Scanner sc = new Scanner(System.in);
        int op;//opcion principal
        int opSub;//opcion para los sub menu
        System.out.println("Bienvenido a la Actividad");
        System.out.println("Conociendo las Estructuras de Control");
        System.out.println("Elije una de las siguientes Opciones");
        System.out.println("1. Estructura IF");
        System.out.println("2. Ciclo FOR");
        System.out.println("3. Estructura Else IF");
        System.out.println("0. Salir");
        System.out.println("...");
        op = sc.nextInt();
    while (op!=0 && op<4) {
        switch (op) {
            case 1:
                System.out.println("Bienvenido a la Estructura IF");
                System.out.println("1. Conocer si 2 numeros son IGUALES");
                System.out.println("0. Salir al menu principal");
                System.out.println("...");
                opSub = sc.nextInt();
                if (opSub == 1) {
                    int n1If;
                    int n2If;
                    System.out.println("Conocer si 2 numeros son IGUALES");
                    System.out.println("Ingrese un el primer numero");
                    n1If = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2If = sc.nextInt();
                    System.out.println("Resultado...");
                    if (n1If == n2If) {
                        System.out.println(n1If + " y " + n2If + " SON IGUALES");
                    } else {
                        System.out.println(n1If + " y " + n2If + " NO SON IGUALES");
                    }
                    System.out.println("-----------------------------");
                } else {
                    System.out.println("Elije una de las siguientes Opciones");
                    System.out.println("1. Estructura IF");
                    System.out.println("2. Ciclo FOR");
                    System.out.println("3. Estructura Else IF");
                    System.out.println("0. Salir");
                    System.out.println("...");
                    op = sc.nextInt();
                }
                break;
            case 2:
                System.out.println("Bienvenido al Ciclo FOR");
                System.out.println("1. Mostrar un recorrido del 0 al 100");
                System.out.println("0. Salir al menu principal");
                System.out.println("...");
                opSub = sc.nextInt();
                if (opSub == 1) {
                    System.out.println("Recorrido del 0 al 100 con FOR");
                    System.out.println("Resultado...");
                    for (int i = 0; i <= 100; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    System.out.println("-----------------------------");
                } else {
                    System.out.println("Elije una de las siguientes Opciones");
                    System.out.println("1. Estructura IF");
                    System.out.println("2. Ciclo FOR");
                    System.out.println("3. Estructura Else IF");
                    System.out.println("0. Salir");
                    System.out.println("...");
                    op = sc.nextInt();
                }
                break;
            case 3:
                System.out.println("Bienvenido a la Estructura ELSE IF");
                System.out.println("1. Saber el nombre de un numero ingresado del 1 al 3");
                System.out.println("0. Salir al menu principal");
                System.out.println("...");
                opSub = sc.nextInt();
                switch (opSub){
                    case 1:
                        int nombreNum;
                        System.out.println("Saber el nombre de un numero del 1 al 3");
                        System.out.println("Ingrese un numero del 1 al 3 para saber su nombre");
                        nombreNum = sc.nextInt();
                        System.out.println("Resultado...");
                        if(nombreNum == 1){
                            System.out.println("UNO");
                        }
                        else if(nombreNum == 2){
                            System.out.println("DOS");
                        }
                        else if(nombreNum == 3){
                            System.out.println("TRES");
                        }
                        else {
                            System.out.println("Numero ingresado fuera de rango");
                        }
                        System.out.println("-----------------------------");
                        break;
                    default:
                        System.out.println("Elije una de las siguientes Opciones");
                        System.out.println("1. Estructura IF");
                        System.out.println("2. Ciclo FOR");
                        System.out.println("3. Estructura Else IF");
                        System.out.println("0. Salir");
                        System.out.println("...");
                        op = sc.nextInt();
                        break;
                }
                break;

            }
        }
    }
}
