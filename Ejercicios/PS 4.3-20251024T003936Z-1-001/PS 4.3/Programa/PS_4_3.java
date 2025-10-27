/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
    import java.util.Scanner;

/**
 *
 * @author Arantza
 */
public class PS_4_3 {

    public static void main(String[] args) {
        int[] ARRE = new int[300];
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        // Lee los elementos del arreglo desde la entrada estándar
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ARRE.length; i++) {
            System.out.print("Ingrese el número en la posición " + (i + 1) + ": ");
            ARRE[i] = scanner.nextInt();
        }

        // Clasifica los números
        for (int i = 0; i < ARRE.length; i++) {
            if (ARRE[i] > 0) {
                positivos++;
            } else if (ARRE[i] < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }

        // Muestra los resultados
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números nulos: " + nulos);
    }
}


