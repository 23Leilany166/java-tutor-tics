/*
INSERTA_ORDEHADO
El programa, si es posible, Inserta un elemento X en un arreglo ordenado A de h
elementos
*/
package c.Ejemplo_4_4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejemplo_4_4_Inserta_Ordenado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];

        System.out.println("Ingrese el tamaño del arreglo (N):");
        int N = sc.nextInt();

        if (N < 100) {
            System.out.println("Ingrese los elementos del arreglo (ordenados):");

            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            System.out.println("Ingrese el elemento a insertar (X):");
            int X = sc.nextInt();

            int I = 1;

            while (I <= N && A[I] < X) {
                I++;
            }

            int POS;

            if (I > N || A[I] > X) {
                POS = -1;
            } else {
                POS = I;
            }

            if (POS > 0) {
                System.out.println("El elemento ya existe en el arreglo.");
            } else {
                int H = N + 1;
                POS = -POS;

                for (int i = N; i >= POS + 1; i--) {
                    A[i] = A[i - 1];
                }

                A[POS] = X;

                System.out.println("Elemento insertado en la posición " + POS);
                System.out.println("Arreglo resultante:");

                for (int i = 1; i <= H; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No hay espacio en el arreglo para nuevas inserciones.");
        }
    }
    
}
