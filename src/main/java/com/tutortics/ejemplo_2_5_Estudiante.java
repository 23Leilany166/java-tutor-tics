package com.tutortics;
// src/ejemplo_2_5_Estudiante.java
// ESQUELETO DEL EJERCICIO - Para que el estudiante complete

import java.util.Scanner;

public class ejemplo_2_5_Estudiante {

    /**
     * Devuelve la secuencia de acciones según el valor del selector.
     * Basado en el Diagrama de Flujo 2.8.
     *
     * El selector múltiple funciona así:
     * - Si el selector es 1: ejecuta ACCION 1
     * - Si el selector es 2: ejecuta ACCION 2
     * - Si el selector es 3: ejecuta ACCION 3
     * - Si el selector es cualquier otro valor: ejecuta ACCION X
     * - Después de cualquier acción, SIEMPRE se ejecuta ACCION Y
     *
     * TODO: Implementa la lógica del selector múltiple
     *
     * @param selector El valor entero que determina qué acción tomar.
     * @return Una cadena de texto describiendo las acciones ejecutadas.
     */
    public String ejecutarFlujo(int selector) {
        String accionPrincipal = "";

        // TODO: Implementa la estructura switch-case para manejar los valores del selector
        // Pista 1: Usa switch(selector) { ... }
        // Pista 2: Define casos para 1, 2, 3, y un caso default para otros valores
        // Pista 3: No olvides el 'break;' después de cada caso

        // TODO: La ACCION Y siempre se ejecuta al final, sin importar qué acción principal se ejecutó
        String accionFinal = "";

        return accionPrincipal + " " + accionFinal;
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_2_5_Estudiante selectorAccion = new ejemplo_2_5_Estudiante();

        System.out.println("Introduce un valor para el SELECTOR (1, 2, 3, u otro):");
        int valorSelector = scanner.nextInt();

        // TODO: Llama al método ejecutarFlujo con el valor del selector
        String resultado = "";

        System.out.println("---------------------------------");
        System.out.println(resultado);
        System.out.println("---------------------------------");

        scanner.close();
    }
}
