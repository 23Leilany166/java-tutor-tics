package com.javatutor.problema_1_7;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        double L1, L2, L3;
        double s, area;

        System.out.print("Ingresa Lado 1: ");
        L1 = sc.nextDouble();

        System.out.print("Ingresa Lado 2: ");
        L2 = sc.nextDouble();

        System.out.print("Ingresa Lado 3: ");
        L3 = sc.nextDouble();

        // Semiperímetro
        s = (L1 + L2 + L3) / 2;

        // Fórmula de Herón
        area = Math.sqrt(s * (s - L1) * (s - L2) * (s - L3));

        System.out.println("El área del triángulo es: " + area);
    }
}
