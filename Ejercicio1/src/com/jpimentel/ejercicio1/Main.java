package com.jpimentel.ejercicio1;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Ejercicio 1
        //Variables de tipo int
        /* int edad = 1512311123;
        String nombre = "Luis";
        //Mostrar datos de variables
        System.out.println(edad);
        System.out.println(nombre);
        //Rango de datos
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        double d = 12.5;

        //Ejercicio2
        float f = 1.5f;
        float f2 = 15;
        double d1 = 1.75;
        long l = 2147483647;
        char c1 = 125;
        char c2 = '@';
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2); */
        //Ejercicio 3
        //Suma
        /*int n1 = 5;//Declaracion de Variable
        int n2 = 9;
        int suma;//Declaracion de Variable
        //int suma = n1 + n2;
        //llamando o utilizando las variables
        suma = n1 + n2;//funcionalidad que tendran las variables
        System.out.println("Primer Numero");
        System.out.println(n1);
        System.out.println("Segundo Numero");
        System.out.println(n2);
        System.out.println("La suma es");
        System.out.println(suma);

        //Resto
        int n3 = 2;
        int n4 = 3;
        int resto;
        resto = n3 % n4;
        System.out.println("El Resto es");
        System.out.println(resto);

        //Division
        double n5 = 5;
        double n6 = 6;
        double division;
       division = n5 / n6;
        System.out.println("La Division es");
        System.out.println(division);*/

        //Ejemplo con String
        String cadena1 = "Hola ";
        String cadena2 = "como estas ";
        String cadena3 = "espero te encuentres de buena forma ";
        String cadena4 = "y tu dia haya sido excelente";
        String cadena5 = "espero te encuentres de buena forma ";
        String cadena6 = "ESTA ES UNA CADENA EN MAYUSCULAS";
        int anio = 2022;
        int mes = 2;
        //concatenacion
        System.out.println(cadena1 + cadena2 + cadena3 + cadena4
                + " " + "en este" + " mes " + mes + " del anio "+ anio);
        //contar el tamanio
        System.out.println(cadena1.length());
        System.out.println(cadena3.length());
        //remplazar
        System.out.println(cadena4.replace("excelente","super"));
        System.out.println(cadena2.replace("estas","te va"));
        //extraer porsion de cadena
        System.out.println(cadena1.substring(2));
        System.out.println(cadena3.substring(0,6));
        //comparar
        System.out.println(cadena3.equals(cadena5));
        System.out.println(cadena3.equals(cadena1));
        //minuscula
        System.out.println(cadena6.toLowerCase());
        //mayusculas
        System.out.println(cadena4.toUpperCase());

    }
}
