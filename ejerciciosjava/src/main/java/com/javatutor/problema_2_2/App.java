package com.javatutor.problema_2_2;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int P, Q;
        double EXP;

        System.out.print("Ingresa P: ");
        P = sc.nextInt();

        System.out.print("Ingresa Q: ");
        Q = sc.nextInt();

        // Calcular la expresión P^5 + Q^4 - 2*P^2
        EXP = Math.pow(P, 5) + Math.pow(Q, 4) - 2 * Math.pow(P, 2);

        // Verificar condición
        if (EXP < 680) {
            System.out.println("La expresión se cumple. Valores:");
            System.out.println("P = " + P);
            System.out.println("Q = " + Q);
        } else {
            System.out.println("La expresión NO se cumple.");
        }
    }
}
