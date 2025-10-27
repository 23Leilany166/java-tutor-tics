/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;
/**
 *
 * @author imac22
 */
public class PS_3_23 {

    public static void main(String[] args) {
        int cantidadAlumnos = 35;
        int cantidadCalificaciones = 5;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.println("Alumno " + i);
            System.out.print("Ingrese la matrícula: ");
            int matricula = scanner.nextInt();

            double sumaCalificaciones = 0;
            for (int j = 1; j <= cantidadCalificaciones; j++) {
                System.out.print("Ingrese la calificación " + j + ": ");
                double calificacion = scanner.nextDouble();
                sumaCalificaciones += calificacion;
            }

            double promedio = sumaCalificaciones / cantidadCalificaciones;

            System.out.println("Matrícula: " + matricula);
            System.out.println("Promedio: " + promedio);
            System.out.println();
        }

        scanner.close();
    }
}


