/*
El program a cuenta cuántos ceros hay en un grupo de N números enteros}
 */
package ejemplo_3_3;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class Ejemplo_3_3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();

        int CUECER = 0;
        int I = 1;

        while (I <= N) {
            System.out.print("Ingrese el número #" + I + ": ");
            int NUM = scanner.nextInt();

            if (NUM == 0) {
                CUECER++;
            }

            I++;
        }

        System.out.println("Cantidad de ceros encontrados: " + CUECER);
    }
}
