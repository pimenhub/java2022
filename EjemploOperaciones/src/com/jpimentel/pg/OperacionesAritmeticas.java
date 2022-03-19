package com.jpimentel.pg;

import java.util.Scanner;

public class OperacionesAritmeticas {
    //Variables globales o de Clase
    private Scanner sc;

    public double d1;
    public double d2;

    //Constructor Vacío
    public OperacionesAritmeticas() {
        //Vacío
    }

    //Metodos de las diferentes operaciones aritmeticas

    //Suma
    public int suma() {
        int resultado;
        resultado = (int) (this.d1 + this.d2);
        return resultado;
    }

    //Resta
    public int resta(int a, int b) {
        int resultado;
        resultado = a - b;
        return resultado;
    }

    //Multiplicacion
    public void multi() {
        this.sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        d1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        d2 = sc.nextInt();
        int resultado;
        resultado = (int) (d1 * d2);
        System.out.println("El resulta de la Multiplicacion es " + resultado);
    }

    //Potencia
    public void potencia() {
        this.sc = new Scanner(System.in);
        System.out.println("Ingrese la base");
        d1 = sc.nextInt();
        System.out.println("Ingrese la potencia");
        d2 = sc.nextInt();
        int resultado;
        resultado = (int) (Math.pow(d1, d2));
        System.out.println("El resulta de la Multiplicacion es " + resultado);
    }

    //Division
    public double division() {
        double resultado;
        resultado = this.d1 / this.d2;
        return resultado;
    }

}
