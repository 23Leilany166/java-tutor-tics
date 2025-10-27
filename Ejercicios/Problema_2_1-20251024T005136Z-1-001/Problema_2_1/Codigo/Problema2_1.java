/*
 * {El programa, dado como dato el número de sonidos emitidos por un grillo
en un minuto, calcula la temperatura en grados Fahrenhelt
 */
package problema_2_1;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class Problema2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de sonidos emitidos por minuto: ");
        int N = scanner.nextInt();

        double T;
        if (N > 0) {
            T = N / 4.0 + 40;
            System.out.println("Temperatura: " + T);
        }
    }

}
