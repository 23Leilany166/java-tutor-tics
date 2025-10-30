package com.tutor; // O tu paquete específico

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Problema_3_17 { // El nombre del archivo debe ser Problema_3_17.java

    /**
     * Clase interna estática para almacenar los resultados.
     * No modificar esta clase.
     */
    public static class ResultadosPrimos {
        public final List<Integer> primos;
        public final int conteo;

        public ResultadosPrimos(List<Integer> primos, int conteo) {
            this.primos = primos;
            this.conteo = conteo;
        }
    }

    /**
     * MÉTODO AUXILIAR: Puedes usar este método para saber si un número es primo.
     * No necesitas modificarlo.
     */
    public boolean esPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe encontrar todos los números primos
     * que sean ESTRICTAMENTE MENORES que 'm'.
     * Debes devolver un objeto ResultadosPrimos que contenga:
     * 1. Una List<Integer> con los primos encontrados.
     * 2. Un int con el conteo total de esos primos.
     *
     * @param m El número límite (exclusivo).
     * @return Un objeto ResultadosPrimos con la lista y el conteo.
     */
    public ResultadosPrimos encontrarPrimos(int m) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        List<Integer> listaPrimos = new ArrayList<>();
        int conteoPrimos = 0;

        // Escribe aquí tu bucle (de 2 hasta m-1)
        // Dentro del bucle, usa el método esPrimo(numero)
        // Si es primo, agrégalo a la listaPrimos e incrementa el conteoPrimos
        for (int i = 2; i < m; i++) {
            if (esPrimo(i)) {
                // Aquí va la lógica
            }
        }
        
        // Devuelve el objeto con tus resultados
        return new ResultadosPrimos(listaPrimos, conteoPrimos); 

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema_3_17 ejercicio = new Problema_3_17(); // Llama a la plantilla

        System.out.print("Ingrese un número entero positivo (M): ");
        int m = sc.nextInt();

        ResultadosPrimos resultados = ejercicio.encontrarPrimos(m);

        System.out.println("Números primos menores que " + m + ":");
        if (resultados.primos.isEmpty()) {
            System.out.println("(Ninguno)");
        } else {
            for (int primo : resultados.primos) {
                System.out.println("Número Primo: " + primo);
            }
        }
        System.out.println("\nTotal de números primos encontrados: " + resultados.conteo);
        
        sc.close();
    }
}