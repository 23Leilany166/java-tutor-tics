/*
ELIMINA DESORDENADO
{El programa elimina un elem ento en un arreglo desordenado}
*/
package c.Ejemplo_4_4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejemplo_4_4_Elimina_Desordenado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int N = sc.nextInt();
        int[] A = new int[N];

        System.out.println("Ingrese los elementos del arreglo:");

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Ingrese el elemento a eliminar (X): ");
        int X = sc.nextInt();

        boolean BAND = false;
        int I = 0;

        while (I < N && !BAND) {
            if (A[I] == X) {
                BAND = true;
                N = N - 1;
                for (int K = I; K < N; K++) {
                    A[K] = A[K + 1];
                }
            } else {
                I = I + 1;
            }
        }

        if (BAND) {
            System.out.println("Elemento " + X + " eliminado del arreglo.");
        } else {
            System.out.println("El elemento " + X + " no está en el arreglo.");
        }
    }
    
}
