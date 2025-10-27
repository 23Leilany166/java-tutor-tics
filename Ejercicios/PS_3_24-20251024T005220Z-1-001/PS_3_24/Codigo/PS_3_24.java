/*
sólo imprima matrícula y promedio del mejor y del peor alumno.
 */
package ps_3_24;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class PS_3_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mejorPromedio = 0;
        double peorPromedio = 100;
        int mejorMatricula = 0;
        int peorMatricula = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Alumno " + i);
            System.out.print("Ingrese la matrícula: ");
            int matricula = scanner.nextInt();

            double sumaCalificaciones = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingrese la calificación " + j + ": ");
                double calificacion = scanner.nextDouble();
                sumaCalificaciones += calificacion;
            }

            double promedio = sumaCalificaciones / 5;

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorMatricula = matricula;
            }

            if (promedio < peorPromedio) {
                peorPromedio = promedio;
                peorMatricula = matricula;
            }
        }

        System.out.println("Mejor Alumno:");
        System.out.println("Matrícula: " + mejorMatricula);
        System.out.println("Promedio: " + mejorPromedio);

        System.out.println("Peor Alumno:");
        System.out.println("Matrícula: " + peorMatricula);
        System.out.println("Promedio: " + peorPromedio);
    }
}
