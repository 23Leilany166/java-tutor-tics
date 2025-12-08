package com.javatutor.ps_3_26;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int N;
        int MAT, SEXO, SEM;
        double PRO;

        int totalMujeres = 0, totalHombres = 0;
        double acumPromMujeres = 0, acumPromHombres = 0, acumGeneral = 0;

        System.out.print("Ingrese el número de alumnos: ");
        N = leer.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("\nAlumno " + i);

            System.out.print("Matrícula: ");
            MAT = leer.nextInt();

            System.out.print("Sexo (0 = mujer, 1 = hombre): ");
            SEXO = leer.nextInt();

            System.out.print("Semestre: ");
            SEM = leer.nextInt();

            System.out.print("Promedio: ");
            PRO = leer.nextDouble();

            // Acumular promedios
            acumGeneral += PRO;

            if (SEXO == 0) {         // Mujer
                totalMujeres++;
                acumPromMujeres += PRO;
            } else if (SEXO == 1) {  // Hombre
                totalHombres++;
                acumPromHombres += PRO;
            }
        }

        // Cálculos finales
        double porcMujeres = (double) totalMujeres / N * 100;
        double porcHombres = (double) totalHombres / N * 100;

        double promMujeres = (totalMujeres > 0) ? acumPromMujeres / totalMujeres : 0;
        double promHombres = (totalHombres > 0) ? acumPromHombres / totalHombres : 0;
        double promGeneral = acumGeneral / N;

        // Resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Porcentaje mujeres: " + porcMujeres + "%");
        System.out.println("Promedio mujeres: " + promMujeres);

        System.out.println("Porcentaje hombres: " + porcHombres + "%");
        System.out.println("Promedio hombres: " + promHombres);

        System.out.println("Promedio general: " + promGeneral);
    }
}
