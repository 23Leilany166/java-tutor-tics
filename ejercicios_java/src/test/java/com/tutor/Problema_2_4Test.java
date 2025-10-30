package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase Problema_2_4.
 */
public class Problema_2_4Test { // El nombre del archivo debe ser Problema_2_4Test.java

    // --- Pruebas para calcularPromedio ---

    @Test
    void testCalcularPromedioAprobado() {
        Problema_2_4R ejercicio = new Problema_2_4R(); // Usa la clase de la plantilla
        double promedio = ejercicio.calcularPromedio(7.0, 8.0, 5.0, 6.0, 9.0); // Esperado: 7.0
        assertEquals(7.0, promedio, 0.001, "El promedio de (7,8,5,6,9) debe ser 7.0");
    }

    @Test
    void testCalcularPromedioNoAprobado() {
        Problema_2_4R ejercicio = new Problema_2_4R(); // Usa la clase de la plantilla
        double promedio = ejercicio.calcularPromedio(5.0, 4.0, 6.0, 5.5, 6.0); // Esperado: 5.3
        assertEquals(5.3, promedio, 0.001, "El promedio de (5,4,6,5.5,6) debe ser 5.3");
    }
    
    @Test
    void testCalcularPromedioLimiteAprobado() {
        Problema_2_4R ejercicio = new Problema_2_4R(); // Usa la clase de la plantilla
        double promedio = ejercicio.calcularPromedio(6.0, 6.0, 6.0, 6.0, 6.0); // Esperado: 6.0
        assertEquals(6.0, promedio, 0.001, "El promedio de (6,6,6,6,6) debe ser 6.0");
    }

    // --- Pruebas para determinarStatus ---

    @Test
    void testDeterminarStatusAprobado() {
        Problema_2_4R ejercicio = new Problema_2_4R(); // Usa la clase de la plantilla
        assertEquals("Aprobado", ejercicio.determinarStatus(7.0), "Un promedio de 7.0 debe ser Aprobado");
        assertEquals("Aprobado", ejercicio.determinarStatus(10.0), "Un promedio de 10.0 debe ser Aprobado");
    }

    @Test
    void testDeterminarStatusNoAprobado() {
        Problema_2_4R ejercicio = new Problema_2_4R(); // Usa la clase de la plantilla
        assertEquals("No Aprobado", ejercicio.determinarStatus(5.3), "Un promedio de 5.3 debe ser No Aprobado");
        assertEquals("No Aprobado", ejercicio.determinarStatus(0.0), "Un promedio de 0.0 debe ser No Aprobado");
    }

    @Test
    void testDeterminarStatusLimite() {
        Problema_2_4R ejercicio = new Problema_2_4R(); // Usa la clase de la plantilla
        assertEquals("Aprobado", ejercicio.determinarStatus(6.0), "Un promedio de 6.0 exacto debe ser Aprobado");
        assertEquals("No Aprobado", ejercicio.determinarStatus(5.999), "Un promedio justo por debajo de 6.0 debe ser No Aprobado");
    }

    // --- Prueba combinando ambos métodos ---
    @Test
    void testCalculoYStatusIntegrado() {
        Problema_2_4R ejercicio = new Problema_2_4R(); // Usa la clase de la plantilla
        // Caso 1: Debe aprobar
        double prom1 = ejercicio.calcularPromedio(7, 8, 9, 10, 6); // Prom = 8.0
        String stat1 = ejercicio.determinarStatus(prom1);
        assertEquals("Aprobado", stat1, "Promedio 8.0 debe resultar en Aprobado");

        // Caso 2: Debe reprobar
        double prom2 = ejercicio.calcularPromedio(5, 5, 6, 5, 7); // Prom = 5.6
        String stat2 = ejercicio.determinarStatus(prom2);
        assertEquals("No Aprobado", stat2, "Promedio 5.6 debe resultar en No Aprobado");

        // Caso 3: Límite aprobatorio
         double prom3 = ejercicio.calcularPromedio(6, 6, 6, 6, 6); // Prom = 6.0
        String stat3 = ejercicio.determinarStatus(prom3);
        assertEquals("Aprobado", stat3, "Promedio 6.0 debe resultar en Aprobado");
    }
}