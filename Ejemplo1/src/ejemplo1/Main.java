package ejemplo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mi mundo");
        int n1;
        int n2;
        int r;

        Scanner sc = new Scanner(System.in);
        System.out.println("SUMA DE DOS NUMEROS");
        System.out.println("Ingrese el primer numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        r = n1 + n2;
        System.out.println("La suma de ambos numeros es "+r);
    }
}
