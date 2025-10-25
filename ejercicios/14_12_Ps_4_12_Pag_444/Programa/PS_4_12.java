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
public class PS_4_12 {

    public static void main(String[] args) {
        // Precios de los modelos
        double[] precios = { 10.0, 15.0, 12.5, 8.75, 9.5, 11.25, 14.0, 13.5 };

        // Ventas realizadas en los últimos 30 días
        int[][] ventas = new int[30][3];

        // Leer las ventas
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            ventas[i][0] = scanner.nextInt(); // Día
            ventas[i][1] = scanner.nextInt(); // Modelo
            ventas[i][2] = scanner.nextInt(); // Cantidad
        }
        scanner.close();

        // Calcular el total recaudado por modelo en los 30 días
        double[] recaudadoPorModelo = new double[8];
        for (int i = 0; i < 30; i++) {
            int modelo = ventas[i][1] - 1; // Restar 1 para ajustar al índice del arreglo
            int cantidad = ventas[i][2];
            double precio = precios[modelo];
            recaudadoPorModelo[modelo] += cantidad * precio;
        }

        // Calcular el total recaudado por día
        double[] recaudadoPorDia = new double[30];
        for (int i = 0; i < 30; i++) {
            int modelo = ventas[i][1] - 1;
            int cantidad = ventas[i][2];
            double precio = precios[modelo];
            recaudadoPorDia[i] += cantidad * precio;
        }

        // Encontrar el modelo que generó más dinero en los 30 días
        int modeloMasRecaudado = 0;
        double maxRecaudado = recaudadoPorModelo[0];
        for (int i = 1; i < 8; i++) {
            if (recaudadoPorModelo[i] > maxRecaudado) {
                modeloMasRecaudado = i;
                maxRecaudado = recaudadoPorModelo[i];
            }
        }

        // Imprimir los resultados
        System.out.println("\nTotal recaudado por modelo en los 30 días:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Modelo " + (i + 1) + ": $" + recaudadoPorModelo[i]);
        }

        System.out.println("\nTotal recaudado por día:");
        for (int i = 0; i < 30; i++) {
            System.out.println("Día " + (i + 1) + ": $" + recaudadoPorDia[i]);
        }

        System.out.println("\nEl modelo que más dinero produjo en los 30 días fue el modelo " + (modeloMasRecaudado + 1));
    }
}

