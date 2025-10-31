package com.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para P14_10_ps_3_7.
 */
public class P14_10_ps_3_7Test {

    private final P14_10_ps_3_7 programa = new P14_10_ps_3_7();
    private final double DELTA = 0.01; // Margen de error para comparar doubles

    // Pruebas anidadas para organizar los tests por método
    @Nested
    class PruebasParaCalcularNuevoSueldo {

        @Test
        void testSueldoBajo10000() {
            // Sueldo < 10000, aumento del 10%
            double nuevoSueldo = programa.calcularNuevoSueldo(5000);
            assertEquals(5500.0, nuevoSueldo, DELTA);
        }

        @Test
        void testSueldoLimiteInferior() {
            // Sueldo = 10000, aumento del 7%
            double nuevoSueldo = programa.calcularNuevoSueldo(10000);
            assertEquals(10700.0, nuevoSueldo, DELTA);
        }

        @Test
        void testSueldoEntre10000y25000() {
            // Sueldo en el rango medio, aumento del 7%
            double nuevoSueldo = programa.calcularNuevoSueldo(20000);
            assertEquals(21400.0, nuevoSueldo, DELTA);
        }

        @Test
        void testSueldoLimiteSuperior() {
            // Sueldo = 25000, aumento del 7%
            double nuevoSueldo = programa.calcularNuevoSueldo(25000);
            assertEquals(26750.0, nuevoSueldo, DELTA);
        }

        @Test
        void testSueldoMayorA25000() {
            // Sueldo > 25000, aumento del 8%
            double nuevoSueldo = programa.calcularNuevoSueldo(30000);
            assertEquals(32400.0, nuevoSueldo, DELTA);
        }
    }
    
    @Nested
    class PruebasParaCalcularNominaTotal {
        
        @Test
        void testNominaConSueldosMixtos() {
            // Un sueldo de cada categoría: 5000, 20000, 30000
            double[] sueldos = {5000, 20000, 30000};
            // Nuevos sueldos: 5500 + 21400 + 32400 = 59300
            double nominaTotal = programa.calcularNominaTotal(sueldos);
            assertEquals(59300.0, nominaTotal, DELTA);
        }

        @Test
        void testNominaConArregloVacio() {
            double[] sueldos = {};
            double nominaTotal = programa.calcularNominaTotal(sueldos);
            assertEquals(0.0, nominaTotal, DELTA, "La nómina de un arreglo vacío debe ser 0");
        }
    }
}