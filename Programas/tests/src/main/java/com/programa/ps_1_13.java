package com.programa;

import java.util.Scanner;

/**
 * ps_1_13 - Plantilla para operaciones de un prisma (áreas y volumen)
 *
 * OBJETIVO:
 * Implementar métodos que calculen el área de la base, área lateral, área total
 * y volumen de un prisma, usando las fórmulas provistas.
 *
 * INSTRUCCIONES:
 * - Mantén las firmas de los métodos.
 * - Maneja valores inválidos (por ejemplo radios o alturas negativas) si aplica.
 */
public class ps_1_13 {

    // Lógica separada
    public double calcularAreaBase(double per, double apo) {
        // TODO: Implementa la fórmula del área de la base: (per * apo) / 2
        return 0.0; // Reemplaza con la implementación correcta
    }

    public double calcularAreaLateral(double per, double alt) {
        // TODO: Implementa la fórmula del área lateral: per * alt
        return 0.0; // Reemplaza con la implementación correcta
    }

    public double calcularAreaTotal(double areaBase, double areaLateral) {
        // TODO: Implementa la fórmula del área total: 2*areaBase + areaLateral
        return 0.0; // Reemplaza con la implementación correcta
    }

    public double calcularVolumen(double areaBase, double alt) {
        // TODO: Implementa la fórmula del volumen: areaBase * alt
        return 0.0; // Reemplaza con la implementación correcta
    }
    
    // El main solo maneja I/O
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ps_1_13 p = new ps_1_13();

        System.out.print("Ingrese el perímetro de la base (PER): ");
        double per = scanner.nextDouble();
        System.out.print("Ingrese el apotema (APO): ");
        double apo = scanner.nextDouble();
        System.out.print("Ingrese la altura (ALT): ");
        double alt = scanner.nextDouble();

        double areaBase = p.calcularAreaBase(per, apo);
        double areaLateral = p.calcularAreaLateral(per, alt);
        double areaTotal = p.calcularAreaTotal(areaBase, areaLateral);
        double volumen = p.calcularVolumen(areaBase, alt);

        System.out.println("\n--- Resultados del Prisma ---");
        System.out.printf("Área de la Base: %.2f\n", areaBase);
        System.out.printf("Área Lateral: %.2f\n", areaLateral);
        System.out.printf("Área Total: %.2f\n", areaTotal);
        System.out.printf("Volumen: %.2f\n", volumen);
        
        scanner.close();
    }
}