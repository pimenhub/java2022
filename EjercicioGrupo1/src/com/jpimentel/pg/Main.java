package com.jpimentel.pg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a = -2.56;
        double b = 3.23;
        int c = 5;
        int d = 6;

        System.out.println("Valor absoluto "+Math.abs(a));
        System.out.println("Valor Maximo "+Math.max(c,d));
        System.out.println("Valor Minimo "+Math.min(c,d));
        System.out.printf("Valor e^1 "+Math.pow(Math.E,1) + " Logaritmo Natural de 2 "+"%.3f %n",Math.log(2));
        System.out.printf("Raiz Cuadrada "+"%.2f %n",Math.sqrt(b));
        System.out.println("Tercera Potencia "+Math.pow(b,3));
        System.out.println("Redondeo 1 - "+Math.round(b));
        System.out.println("Redondeo 2 - "+Math.floor(b));
        System.out.println("Redondeo 3 - "+Math.ceil(b));
        System.out.printf("Numero Aleatorio "+"%.2f",Math.random()*4);

    }
}
