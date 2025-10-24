/*
PRIMOS
{El programa, dado un entero positivo M, obtiene e imprime la cantidad de núme-
ros primos comprendidos entre 1 y M}
*/
package c.Problema_3_17;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Problema_3_17 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 3;
        int sp = 0;

        System.out.print("Ingrese un número entero positivo: ");
        int m = sc.nextInt();

        if (m > 1) {
            sp++;
            System.out.println("Número Primo: 1");

            if (m > 2) {
                sp++;
                System.out.println("Número Primo: 2");
            }
        }

        while (i < m) {
            char band = 'V';
            int j = 3;

            while (j <= (i / 2) && band == 'V') {
                if (i % j == 0) {
                    band = 'F';
                }
                j += 2;
            }

            if (band == 'V') {
                System.out.println("Número Primo: " + i);
                sp++;
            }

            i += 2;
        }

        System.out.println("Entre 1 y " + m + " hay " + sp + " números primos.");
    }
    
}
