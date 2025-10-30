

import java.util.Scanner;
/**
 *
 * @author imac28
 */


public class ManejoVentasSucursales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de años (M): ");
        int M = scanner.nextInt();

        System.out.print("Ingrese el número de sucursales (N): ");
        int N = scanner.nextInt();

        double[][] MONTO = new double[M][N];

        // Leer los montos de ventas por año y sucursal
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el monto de ventas del año " + (i + 1) + " en la sucursal " + (j + 1) + ": ");
                MONTO[i][j] = scanner.nextDouble();
            }
        }

        // Obtener la sucursal que más ha vendido en los M años
        int sucursalMasVendida = obtenerSucursalMasVendida(MONTO);

        // Obtener el promedio de ventas por año
        double[] promediosAnuales = calcularPromedioVentasAnuales(MONTO);

        // Obtener el año con mayor promedio de ventas
        int añoMayorPromedioVentas = obtenerAñoMayorPromedioVentas(promediosAnuales);

        System.out.println("\nInformación de ventas:");
        System.out.println("Sucursal que más ha vendido en los M años: Sucursal " + sucursalMasVendida);
        System.out.println("Promedio de ventas por año:");
        for (int i = 0; i < M; i++) {
            System.out.println("Año " + (i + 1) + ": " + promediosAnuales[i]);
        }
        System.out.println("Año con mayor promedio de ventas: Año " + añoMayorPromedioVentas);
    }

    // Método para obtener la sucursal que más ha vendido en los M años
    static int obtenerSucursalMasVendida(double[][] montos) {
        int sucursalMasVendida = 0;
        double maxVentas = 0;

        for (int j = 0; j < montos[0].length; j++) {
            double totalVentas = 0;
            for (int i = 0; i < montos.length; i++) {
                totalVentas += montos[i][j];
            }
            if (totalVentas > maxVentas) {
                maxVentas = totalVentas;
                sucursalMasVendida = j + 1;
            }
        }

        return sucursalMasVendida;
    }

    // Método para calcular el promedio de ventas por año
    static double[] calcularPromedioVentasAnuales(double[][] montos) {
        double[] promediosAnuales = new double[montos.length];

        for (int i = 0; i < montos.length; i++) {
            double totalVentas = 0;
            for (int j = 0; j < montos[i].length; j++) {
                totalVentas += montos[i][j];
            }
            promediosAnuales[i] = totalVentas / montos[i].length;
        }

        return promediosAnuales;
    }

    // Método para obtener el año con mayor promedio de ventas
    static int obtenerAñoMayorPromedioVentas(double[] promediosAnuales) {
        int añoMayorPromedioVentas = 0;
        double maxPromedioVentas = 0;

        for (int i = 0; i < promediosAnuales.length; i++) {
            if (promediosAnuales[i] > maxPromedioVentas) {
                maxPromedioVentas = promediosAnuales[i];
                añoMayorPromedioVentas = i + 1;
            }
        }

        return añoMayorPromedioVentas;
    }
}
