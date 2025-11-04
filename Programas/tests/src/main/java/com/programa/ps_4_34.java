package com.programa;

import java.util.Random;

/**
 * ps_4_34 - Plantilla para alumnos
 *
 * OBJETIVO:
 * Implementar funciones que analicen la producción de una fábrica representada
 * por un arreglo tridimensional fabrica[mes][anio][depto].
 *
 * INSTRUCCIONES:
 * - Mantén las firmas públicas de los métodos.
 * - Implementa la lógica indicada en cada método usando bucles y comparaciones.
 * - Retorna los valores en el formato esperado por los tests:
 *   a) String con el nombre del departamento
 *   b) int con el número de mes (1..12)
 *   c) int con el año (1..4)
 *   d) String con detalle formateado
 */
public class ps_4_34 {

    private String[] deptos = {"Dulces", "Conservas", "Bebidas"};

    // a) Departamento con mayor producción en 4 años
    public String getDeptoMayorProduccion(double[][][] fabrica) {
        // TODO: Implementa la suma por departamento a lo largo de meses y años
        // Sugerencia: acumula en un arreglo totalDepto[3] y luego encuentra el índice max
        return deptos[0]; // Reemplaza con el departamento correcto
    }

    // b) Mes del 2do año (índice 1) con mayor producción
    public int getMesMayorProdAnio2(double[][][] fabrica) {
        // TODO: Recorre los 12 meses, suma producción por mes en el año índice 1
        // Devuelve el mes en formato 1..12
        return 1; // Reemplaza con el mes calculado
    }

    // c) Año con mayor producción
    public int getAnioMayorProduccion(double[][][] fabrica) {
        // TODO: Calcula el total por año y devuelve el año (1..4) con mayor producción
        return 1; // Reemplaza con el año calculado
    }

    // d) Depto, mes y año de la mayor producción individual
    // Devolvemos un string para simplificar
    public String getDetalleMaxIndividual(double[][][] fabrica) {
        // TODO: Recorre todos los elementos y trackea el máximo junto con sus índices
        return "Mes: 1, Año: 1, Depto: " + deptos[0]; // Reemplaza con detalle calculado
    }

    // Main para simulación (no requiere modificación por parte del alumno)
    public static void main(String[] args) {
        ps_4_34 pf = new ps_4_34();
        double[][][] fabrica = new double[12][4][3];
        Random rand = new Random();
        for (int m = 0; m < 12; m++) {
            for (int a = 0; a < 4; a++) {
                for (int d = 0; d < 3; d++) {
                    fabrica[m][a][d] = rand.nextDouble() * 1000;
                }
            }
        }

        System.out.println("a) Depto. con mayor producción: " + pf.getDeptoMayorProduccion(fabrica));
        System.out.println("b) Mes de mayor producción (2do año): Mes " + pf.getMesMayorProdAnio2(fabrica));
        System.out.println("c) Año con mayor producción: " + pf.getAnioMayorProduccion(fabrica));
        System.out.println("d) Mayor producción individual: " + pf.getDetalleMaxIndividual(fabrica));
    }
}