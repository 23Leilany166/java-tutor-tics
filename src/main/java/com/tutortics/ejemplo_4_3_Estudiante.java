package com.tutortics;
// src/ejemplo_4_3_Estudiante.java
// ESQUELETO DEL EJERCICIO - Para que el estudiante complete

import java.util.Arrays;

public class ejemplo_4_3_Estudiante {

    /**
     * Crea y popula un arreglo de enteros.
     *
     * Declaración de arreglo en Java:
     * ARRE = ARREGLO [1..70] DE enteros
     * En Java: int[] arre = new int[70];
     *
     * Nota importante sobre índices:
     * - En el libro: ARRE[1] a ARRE[70] (índices 1 a 70)
     * - En Java: arre[0] a arre[69] (índices 0 a 69)
     *
     * TODO: Implementa la creación y llenado del arreglo
     *
     * @param tamano El número de elementos que tendrá el arreglo.
     * @return El arreglo populado.
     */
    public int[] crearArreglo(int tamano) {
        // TODO: Declara un arreglo de enteros con el tamaño especificado
        // Pista: int[] arre = new int[tamano];

        // TODO: Llena el arreglo con valores
        // Pista: Usa un ciclo for desde i=0 hasta i<tamano
        // Puedes asignar cualquier valor, por ejemplo: arre[i] = (i + 1) * 10;

        // TODO: Retorna el arreglo
        return null;
    }

    /**
     * Método principal para demostrar el uso del arreglo.
     */
    public static void main(String[] args) {
        ejemplo_4_3_Estudiante ejemplo = new ejemplo_4_3_Estudiante();

        // Creamos un arreglo de 70 elementos como en la Figura 4.3
        final int N_ELEMENTOS = 70;

        // TODO: Llama al método crearArreglo
        int[] miArreglo = null;

        System.out.println("Demostración del Ejemplo 4.3 - Arreglos");
        System.out.println("=========================================");

        // TODO: Accede y muestra elementos específicos del arreglo
        // Ejemplos:
        // - Primera posición (índice 0)
        // - Segunda posición (índice 1)
        // - Última posición (índice 69)

        System.out.println("-----------------------------------------");
        System.out.println("Contenido completo del arreglo:");
        // TODO: Imprime el contenido completo del arreglo
        // Pista: System.out.println(Arrays.toString(miArreglo));
        System.out.println("=========================================");
    }
}
