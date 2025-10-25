/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
    import java.util.Scanner;

/**
 *
 * @author imac22
 */
public class Problema_2_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        if (A > B) {
            if (A > C) {
                System.out.println("A es el mayor.");
            } else if (A == C) {
                System.out.println("A y C son los mayores.");
            } else {
                System.out.println("C es el mayor.");
            }
        } else if (A == B) {
            if (A > C) {
                System.out.println("A y B son los mayores.");
            } else if (A == C) {
                System.out.println("A, B y C son los mayores.");
            } else {
                System.out.println("C es el mayor.");
            }
        } else {
            if (B > C) {
                System.out.println("B es el mayor.");
            } else if (B == C) {
                System.out.println("B y C son los mayores.");
            } else {
                System.out.println("C es el mayor.");
            }
        }
    }
}

