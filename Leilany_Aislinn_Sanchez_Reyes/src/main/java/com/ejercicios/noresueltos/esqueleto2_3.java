// Problema2_3.java
package com.ejercicios.noresueltos;
import java.util.*;

public class esqueleto2_3 {

    // Método para calcular las raíces de la ecuación cuadrática
    public static Optional<double[]> raices(double a, double b, double c) {

        // Validar que 'a' no sea cero
        // if (a == 0) return Optional.empty();

        // Calcular discriminante
        // double dis = ...

        // Si el discriminante es negativo, no hay raíces reales
        // if (dis < 0) return Optional.empty();

        // Sacar raíz del discriminante
        // double r = Math.sqrt(dis);

        // Regresar las dos raíces en un arreglo
        // return Optional.of(new double[]{ ... , ... });

        return Optional.empty(); // temporal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar a, b, c
        // Leer valores desde teclado

        // Llamar a raices(a, b, c)
        // var op = raices(a, b, c);

        // Si op.isEmpty() → imprimir que no hay raíces reales
        // Si no → imprimir las dos raíces del arreglo

        sc.close();
    }
}
