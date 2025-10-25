/*
El programa dada la Información sobre las ventas que hizo un vendedor, obtiene
cuantas ventas fueron chicas, medianas y grandes}
 */
package problema_3_7;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class Problema_3_7 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int CHI = 0; // Ventas chicas
        int MED = 0; // Ventas medianas
        int GRA = 0; // Ventas grandes

        System.out.print("Ingrese la cantidad de ventas: ");
        int N = scanner.nextInt();

        for (int I = 1; I <= N; I++) {
            System.out.print("Ingrese el monto de la venta #" + I + ": ");
            double V = scanner.nextDouble();

            if (V <= 200.0) {
                CHI++;
            } else if (V < 400.0) {
                MED++;
            } else {
                GRA++;
            }
        }
     System.out.println("Ventas chicas: " + CHI);
        System.out.println("Ventas medianas: " + MED);
        System.out.println("Ventas grandes: " + GRA);
    }
}
