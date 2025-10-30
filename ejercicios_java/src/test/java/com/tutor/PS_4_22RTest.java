package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

/**
 * Pruebas para la clase PS_4_22R.
 */
public class PS_4_22RTest { // El nombre del archivo debe ser PS_4_22RTest.java

    // Datos de prueba comunes para los tests
    private int[] claves = {101, 102, 103};
    private double[][] produccion = {
        // Fábrica 101 (Total Anual = 120000)
        {10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}, 
        // Fábrica 102 (Total Anual = 300000)
        {25000, 25000, 25000, 25000, 25000, 25000, 25000, 25000, 25000, 25000, 25000, 25000},
        // Fábrica 103 (Total Anual = 181000)
        {160000, 20000, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0} 
    };
    
    // Prueba para el inciso (a): Fábrica con mayor producción ANUAL
    @Test
    void testEncontrarMayorProduccionAnual() {
        PS_4_22R ejercicio = new PS_4_22R();
        
        // La Fábrica 102 tiene la mayor suma anual (300,000)
        PS_4_22R.ResultadoAnual resultado = ejercicio.encontrarMayorProduccion(claves, produccion);
        
        assertEquals(102, resultado.clave, "La clave de la fábrica con mayor producción anual debe ser 102");
        assertEquals(300000.0, resultado.produccionTotal, 0.001, "La producción total de la fábrica 102 debe ser 300000.0");
    }

    // Prueba para el inciso (b): Superiores a 150,000
    @Test
    void testEncontrarSuperioresA() {
        PS_4_22R ejercicio = new PS_4_22R();
        
        // Consultar el Mes 1
        List<Integer> resultadoMes1 = ejercicio.encontrarSuperioresA(claves, produccion, 1, 150000);
        // Fábrica 103 (160,000) es la única > 150,000 en el mes 1
        assertEquals(1, resultadoMes1.size(), "Solo 1 fábrica debe superar el límite en el mes 1");
        assertTrue(resultadoMes1.contains(103), "La lista debe contener la fábrica 103");

        // Consultar el Mes 2
        List<Integer> resultadoMes2 = ejercicio.encontrarSuperioresA(claves, produccion, 2, 150000);
        // Ninguna fábrica supera 150,000 en el mes 2
        assertEquals(0, resultadoMes2.size(), "Ninguna fábrica debe superar el límite en el mes 2");
    }
    
    @Test
    void testEncontrarSuperioresConLimiteExacto() {
        PS_4_22R ejercicio = new PS_4_22R();
        // Creamos datos donde una fábrica tiene exactamente 150,000
        double[][] prodLimite = {
            {150001, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // Fab 101
            {150000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // Fab 102
        };
        int[] clavesLimite = {101, 102};

        List<Integer> resultado = ejercicio.encontrarSuperioresA(clavesLimite, prodLimite, 1, 150000);
        
        // Solo 101 (150,001) debe estar, 102 (150,000) no, porque la condición es "superiores a" (>)
        assertEquals(1, resultado.size(), "Solo una fábrica debe superar 150,000");
        assertTrue(resultado.contains(101), "La fábrica 101 debe estar en la lista");
        assertFalse(resultado.contains(102), "La fábrica 102 (límite exacto) no debe estar en la lista");
    }

    @Test
    void testEncontrarSuperioresMesInvalido() {
        PS_4_22R ejercicio = new PS_4_22R();
        
        // Mes 0
        List<Integer> resultadoMes0 = ejercicio.encontrarSuperioresA(claves, produccion, 0, 150000);
        assertEquals(0, resultadoMes0.size(), "El mes 0 debe devolver una lista vacía");
        
        // Mes 13
        List<Integer> resultadoMes13 = ejercicio.encontrarSuperioresA(claves, produccion, 13, 150000);
        assertEquals(0, resultadoMes13.size(), "El mes 13 debe devolver una lista vacía");
    }
}