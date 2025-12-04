// Archivo: CajaRegistradora.java
// Este archivo consolida toda la funcionalidad de Factura, ItemFactura y CajaRegistradora

public class CajaRegistradora {
    public static void main(String[] args) {
        // Variables para rastrear ventas por ramo (4 ramos: 1-4)
        double[] ventasPorRamo = new double[5]; // índice 0 no usado, 1-4 para los ramos
        ventasPorRamo[1] = 0.0; // Perecederos
        ventasPorRamo[2] = 0.0; // Aseo
        ventasPorRamo[3] = 0.0; // Perfumería
        ventasPorRamo[4] = 0.0; // Abarrotes

        // ===== FACTURA 1 =====
        System.out.println("\n--- TIENDA \"LA PROVIDENCIA\" ---");
        System.out.println("CLAVE - RAMO         CANTIDAD   PRECIO UNIT.   TOTAL");
        System.out.println("-----------------------------------------------------");

        // Item 1: Perecederos
        int clave1 = 1, cantidad1 = 5;
        double precio1 = 10.50;
        String ramo1 = "Perecederos";
        double total1 = cantidad1 * precio1;
        System.out.printf("%-5d - %-12s %-10d $%-13.2f $%-7.2f\n",
                clave1, ramo1, cantidad1, precio1, total1);
        ventasPorRamo[clave1] += total1;

        // Item 2: Perfumería
        int clave2 = 3, cantidad2 = 1;
        double precio2 = 150.00;
        String ramo2 = "Perfumería";
        double total2 = cantidad2 * precio2;
        System.out.printf("%-5d - %-12s %-10d $%-13.2f $%-7.2f\n",
                clave2, ramo2, cantidad2, precio2, total2);
        ventasPorRamo[clave2] += total2;

        double granTotal1 = total1 + total2;
        System.out.println("-----------------------------------------------------");
        System.out.printf("TOTAL A PAGAR: $ %.2f\n\n", granTotal1);

        // ===== FACTURA 2 =====
        System.out.println("\n--- TIENDA \"LA PROVIDENCIA\" ---");
        System.out.println("CLAVE - RAMO         CANTIDAD   PRECIO UNIT.   TOTAL");
        System.out.println("-----------------------------------------------------");

        // Item 1: Abarrotes
        int clave3 = 4, cantidad3 = 10;
        double precio3 = 20.00;
        String ramo3 = "Abarrotes";
        double total3 = cantidad3 * precio3;
        System.out.printf("%-5d - %-12s %-10d $%-13.2f $%-7.2f\n",
                clave3, ramo3, cantidad3, precio3, total3);
        ventasPorRamo[clave3] += total3;

        // Item 2: Perecederos
        int clave4 = 1, cantidad4 = 2;
        double precio4 = 5.00;
        String ramo4 = "Perecederos";
        double total4 = cantidad4 * precio4;
        System.out.printf("%-5d - %-12s %-10d $%-13.2f $%-7.2f\n",
                clave4, ramo4, cantidad4, precio4, total4);
        ventasPorRamo[clave4] += total4;

        double granTotal2 = total3 + total4;
        System.out.println("-----------------------------------------------------");
        System.out.printf("TOTAL A PAGAR: $ %.2f\n\n", granTotal2);

        // ===== REPORTE DIARIO =====
        System.out.println("--- REPORTE DIARIO DE VENTAS ---");

        double maxVenta = -1;
        String ramoMax = "";

        // Revisar cada ramo
        for (int i = 1; i <= 4; i++) {
            String nombreRamo = "";
            switch (i) {
                case 1:
                    nombreRamo = "Perecederos";
                    break;
                case 2:
                    nombreRamo = "Aseo";
                    break;
                case 3:
                    nombreRamo = "Perfumería";
                    break;
                case 4:
                    nombreRamo = "Abarrotes";
                    break;
            }

            System.out.printf("Total Ramo %d (%s): $%.2f\n", i, nombreRamo, ventasPorRamo[i]);

            if (ventasPorRamo[i] > maxVenta) {
                maxVenta = ventasPorRamo[i];
                ramoMax = nombreRamo;
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Ramo con mayor venta: " + ramoMax);
    }
}