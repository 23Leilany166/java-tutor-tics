/*
INSERTA_DESORDENADO
{El programa inserta un elemento en un arreglo desordenado}. 
*/
package c.Ejemplo_4_4;
import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Ejemplo_4_4_Insertar_Desordenado{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];

        System.out.println("Ingrese el elemento a insertar:");
        int Y = sc.nextInt();

        int N = 0;

        if (N < 100) {
            A[N] = Y;
            N++;
            System.out.println("Elemento insertado correctamente.");
            System.out.println("Arreglo resultante:");

            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No hay espacio para insertar el elemento " + Y);
        }
        
        System.out.println("Elementos presentes en el arreglo:");

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
