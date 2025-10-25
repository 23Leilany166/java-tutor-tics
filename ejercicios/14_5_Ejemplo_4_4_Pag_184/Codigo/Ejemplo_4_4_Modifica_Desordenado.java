/*
MODIFICA DESORDENADO
{El programa modifica un elemento X por un elemento Y en un arreglo 
desordenado}
*/
package c.Ejemplo_4_4;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejemplo_4_4_Modifica_Desordenado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];

        System.out.println("Ingrese el tamaño del arreglo (N):");
        int N = sc.nextInt();

        if (N >= 1) {
            System.out.println("Ingrese los elementos del arreglo:");

            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            System.out.println("Ingrese el elemento a modificar (X):");
            int X = sc.nextInt();
            int I = 1;
            boolean BAND = false;

            while (I <= N && !BAND) {
                if (A[I] == X) {
                    System.out.println("Ingrese el nuevo valor (Y):");
                    int Y = sc.nextInt();
                    A[I] = Y;
                    BAND = true;
                } else {
                    I++;
                }
            }

            if (!BAND) {
                System.out.println("El elemento " + X + " no está en el arreglo.");
            } else {
                System.out.println("Arreglo modificado:");
                for (int i = 1; i <= N; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("El arreglo está vacío.");
        }
    }
}
