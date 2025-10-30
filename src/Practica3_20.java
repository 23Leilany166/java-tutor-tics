import java.util.Scanner;

public class Practica3_20 {

    /**
     * Calcula el costo según consumo (en KVH).
     * 140 KVH o menos → $35
     * Siguientes 170 KVH → $0.98 por KVH
     * Exceso sobre 310 KVH → $0.67 por KVH
     */
    public static double calcularCosto(double consumo) {
        double costo;
        if (consumo <= 140) {
            costo = 35;
        } else if (consumo <= 310) {
            costo = 35 + (consumo - 140) * 0.98;
        } else {
            costo = 35 + 170 * 0.98 + (consumo - 310) * 0.67;
        }
        return costo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCobros = 0;
        String continuar;

        System.out.println("Compañía de Luz del Centro");
        System.out.println("============================");

        do {
            System.out.print("Nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.print("Dirección: ");
            String direccion = sc.nextLine();

            System.out.print("Registro inicial (KVH): ");
            double regIni = sc.nextDouble();

            System.out.print("Registro final (KVH): ");
            double regFin = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            double consumo = regFin - regIni;
            double costo = calcularCosto(consumo);
            totalCobros += costo;

            System.out.println("\n------------------------------");
            System.out.println("Compañía de Luz del Centro");
            System.out.println(nombre);
            System.out.println(direccion);
            System.out.printf("%.0f KVH\n", consumo);
            System.out.printf("Costo: $%.2f\n", costo);
            System.out.println("------------------------------\n");

            System.out.print("¿Desea ingresar otro cliente? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.printf("\nTotal de cobros del periodo: $%.2f\n", totalCobros);
        sc.close();
    }
}
