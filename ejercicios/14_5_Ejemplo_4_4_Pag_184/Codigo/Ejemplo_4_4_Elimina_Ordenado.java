/*
ELIMIMA ORDENADO
{El programa, si es posible, elimina un elemento X de un arreglo ordenado A de H elementos}
*/
package c.Ejemplo_4_4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejemplo_4_4_Elimina_Ordenado{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];

        System.out.println("Ingrese el tamaño del arreglo (M):");
        int M = sc.nextInt();

        if (M > 0) {
            System.out.println("Ingrese los elementos del arreglo (ordenados):");

            for (int i = 1; i <= M; i++) {
                A[i] = sc.nextInt();
            }

            System.out.println("Ingrese el elemento a eliminar (X):");
            int X = sc.nextInt();

            int I = 1;

            while (I <= M && A[I] < X) {
                I++;
            }

            int POS;

            if (I > M || A[I] > X) {
                POS = 1;
            } else {
                POS = I;
            }

            if (POS > M || A[POS] != X) {
                System.out.println("El elemento no existe en el arreglo.");
            } else {
                int H = M - 1;
                I = POS;

                while (I <= H) {
                    A[I] = A[I + 1];
                    I++;
                }

                System.out.println("Elemento eliminado del arreglo.");
                System.out.println("Arreglo resultante:");

                for (int i = 1; i <= H; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("El arreglo está vacío.");
        }
    }
}
