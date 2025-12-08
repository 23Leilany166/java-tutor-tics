package com.javatutor.ps_2_5;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int A, B, C, D;
        double resultado;

        System.out.print("Ingrese el valor de A: ");
        A = leer.nextInt();

        System.out.print("Ingrese el valor de B: ");
        B = leer.nextInt();

        System.out.print("Ingrese el valor de C: ");
        C = leer.nextInt();

        System.out.print("Ingrese el valor de D: ");
        D = leer.nextInt();

        if (D == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
        } else {
            resultado = (double) (A - C) / D;
            System.out.println("El resultado de (A - C) / D es: " + resultado);
        }
    }
}
