package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays; // Necesario para assertArrayEquals

/**
 * Pruebas para la clase Problema_4_4R.
 */
public class Problema_4_4RTest { // El nombre del archivo debe ser Problema_4_4RTest.java

    @Test
    void testGenerar30Primos() {
        Problema_4_4R ejercicio = new Problema_4_4R();
        
        // 1. Ejecución
        int[] resultado = ejercicio.generarPrimerosPrimos(30);
        
        // 2. Verificación
        assertEquals(30, resultado.length, "El arreglo debe contener 30 elementos");
        assertEquals(2, resultado[0], "El primer primo debe ser 2");
        assertEquals(3, resultado[1], "El segundo primo debe ser 3");
        assertEquals(113, resultado[29], "El 30º primo debe ser 113");
    }

    @Test
    void testGenerar5Primos() {
        Problema_4_4R ejercicio = new Problema_4_4R();
        int[] resultado = ejercicio.generarPrimerosPrimos(5);
        
        // Usamos assertArrayEquals para comparar el contenido completo del arreglo
        int[] esperados = {2, 3, 5, 7, 11};
        
        assertArrayEquals(esperados, resultado, "La lista de los primeros 5 primos es incorrecta");
    }

    @Test
    void testGenerarUnPrimo() {
        Problema_4_4R ejercicio = new Problema_4_4R();
        int[] resultado = ejercicio.generarPrimerosPrimos(1);
        
        int[] esperados = {2};
        
        assertArrayEquals(esperados, resultado, "La lista con 1 primo solo debe contener el 2");
    }

    @Test
    void testGenerarCeroPrimos() {
        Problema_4_4R ejercicio = new Problema_4_4R();
        int[] resultado = ejercicio.generarPrimerosPrimos(0);
        
        assertEquals(0, resultado.length, "El arreglo debe estar vacío si se piden 0 primos");
    }
}