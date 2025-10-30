package com.tutor; // O tu paquete específico

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * REFRACTORIZADO
 * Este código calcula correctamente los números primos menores que M.
 * La lógica está separada en métodos para poder ser probada.
 */
public class Problema_3_17R { // El nombre del archivo debe ser Problema_3_17R.java

    /**
     * Clase interna estática para almacenar los resultados del cálculo.
     */
    public static class ResultadosPrimos {
        public final List<Integer> primos; // Lista de primos encontrados
        public final int conteo;           // Conteo total

        public ResultadosPrimos(List<Integer> primos, int conteo) {
            this.primos = primos;
            this.conteo = conteo;
        }
    }

    /**
     * Método auxiliar (helper) para verificar si un número es primo.
     * Esta es una implementación optimizada y correcta.
     * @param n El número a verificar.
     * @return true si n es primo, false en caso contrario.
     */
    public boolean esPrimo(int n) {
        if (n <= 1) return false; // 1 y números negativos no son primos
        if (n <= 3) return true;  // 2 y 3 son primos
        if (n % 2 == 0) return false; // Pares mayores que 2 no son primos

        // Solo probamos divisores impares hasta la raíz cuadrada de n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Se encontró un divisor
            }
        }
        return true; // No se encontraron divisores, es primo
    }

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Encuentra y cuenta todos los números primos menores que M.
     *
     * @param m El número límite (exclusivo, no se incluye el 'm').
     * @return Un objeto ResultadosPrimos con la lista y el conteo.
     */
    public ResultadosPrimos encontrarPrimos(int m) {
        List<Integer> listaPrimos = new ArrayList<>();
        int conteoPrimos = 0;

        // Iteramos desde 2 (el primer primo) hasta m-1
        for (int i = 2; i < m; i++) {
            if (esPrimo(i)) {
                listaPrimos.add(i);
                conteoPrimos++;
            }
        }
        
        return new ResultadosPrimos(listaPrimos, conteoPrimos);
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema_3_17R ejercicio = new Problema_3_17R(); // Instancia de la clase

        System.out.print("Ingrese un número entero positivo (M): ");
        int m = sc.nextInt();

        // Llamamos al método lógico
        ResultadosPrimos resultados = ejercicio.encontrarPrimos(m);

        // Imprimimos los resultados
        System.out.println("Números primos menores que " + m + ":");
        if (resultados.primos.isEmpty()) {
            System.out.println("(Ninguno)");
        } else {
            for (int primo : resultados.primos) {
                System.out.println("Número Primo: " + primo);
            }
        }

        System.out.println("\nEntre 1 y " + m + " hay " + resultados.conteo + " números primos.");
        
        sc.close();
    }
}