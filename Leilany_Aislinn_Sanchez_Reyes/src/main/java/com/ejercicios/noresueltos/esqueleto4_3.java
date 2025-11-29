package com.ejercicios.noresueltos;

import java.util.*;

public class esqueleto4_3 {

    // Método para contar votos por candidato (1..11)
    public static int[] contarVotos(List<Integer> votos) {

        // Crear arreglo V de tamaño 12 (usaremos índices 1..11)

        // Validar que la lista no sea nula

        // Recorrer la lista de votos

        // return V;

        return new int[12]; // temporal
    }

    // Método para obtener el candidato ganador
    public static int ganador(int[] V) {

        // Definir variables para guardar el ganador y el mayor número de votos


        // Recorrer desde el candidato 2 hasta el 11

        // return g;

        return 0; // temporal
    }

    // Método para calcular el porcentaje del ganador
    public static double porcentajeGanador(int[] V) {

        // Sumar votos válidos (1..11)


        // Si tot es 0 → regresar 0

        // Obtener ganador con ganador(V)
        // Calcular porcentaje: (V[g] * 100.0) / tot

        return 0.0; // temporal
    }

    // (Este método no se usa directamente para los ejercicios, pero queda igual)
    public static double cuentaYGanaYPorcentaje(int[] valores, int umbral) {

        // Validaciones de arreglo

        // Contar cuántos valores cumplen con el umbral

        // Regresar porcentaje

        return 0.0; // temporal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear lista para ir guardando votos
        // List<Integer> votos = new ArrayList<>();

        // Leer números hasta que se ingrese 0

        // Llamar contarVotos(votos)
        // int[] V = contarVotos(votos);

        // Imprimir el ganador
        // System.out.println(ganador(V));

        // Imprimir porcentaje con formato
        // System.out.printf(Locale.ROOT, "%.2f%n", porcentajeGanador(V));

        sc.close();
    }
}
