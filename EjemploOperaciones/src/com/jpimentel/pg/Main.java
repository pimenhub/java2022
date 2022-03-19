package com.jpimentel.pg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OperacionesAritmeticas operaciones = new OperacionesAritmeticas();
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("*** Menu ***");
        System.out.println("Operaciones Aritmeticas");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Codiciones");
        System.out.println("5. Estructura IF");
        System.out.println("6. Switch Case");
        System.out.println("Ciclos");
        System.out.println("7. For");
        System.out.println("Otros");
        System.out.println("8. While");
        System.out.println("9. Arreglos");
        System.out.println("10. Matrices");

        System.out.println("Elige una opcion:");
        op = sc.nextInt();

        while (op > 0 && op <= 10) {
            switch (op) {
                case 1:
                    System.out.println("Sumar");
                    System.out.println("Ingrese el primer numero");
                    operaciones.d1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    operaciones.d2 = sc.nextInt();
                    System.out.println("El resultado de la suma es: " +
                            operaciones.suma() +
                            "Resultado de la Suma Multiplicada " + operaciones.suma() * 2);
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println("Ingrese el primer numero");
                    int a = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    int b = sc.nextInt();
                    System.out.println("El resultado de la resta es: " +
                            operaciones.resta(a, b));
                    break;
                case 3:
                    try {
                        System.out.println("Multiplicacion");
                        operaciones.multi();
                        System.out.println("Potencia");
                        operaciones.potencia();
                    } catch (Exception e) {
                        e.getMessage();
                        System.err.println("Solo debe de ingresar numeros Enteros");
                    }
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println("Ingrese el primer numero");
                    operaciones.d1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    operaciones.d2 = sc.nextDouble();
                    System.out.println("El resultado de la Division es: " +
                            operaciones.division());
                    break;
            }
            System.out.println("Elige una opcion:");
            op = sc.nextInt();
        }
    }
}
