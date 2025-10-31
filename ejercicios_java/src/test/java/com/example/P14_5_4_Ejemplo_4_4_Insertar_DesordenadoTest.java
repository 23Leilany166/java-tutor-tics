package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

/**
 * Clase de prueba para P14_5_4_Ejemplo_4_4_Insertar_Desordenado.
 */
public class P14_5_4_Ejemplo_4_4_Insertar_DesordenadoTest {

    private final P14_5_4_Ejemplo_4_4_Insertar_Desordenado insertador = new P14_5_4_Ejemplo_4_4_Insertar_Desordenado();

    @Test
    void testInsertarEnArregloConEspacio() {
        int[] arreglo = new int[5];
        arreglo[0] = 10;
        arreglo[1] = 20;
        
        int nuevoTamano = insertador.insertarElementoDesordenado(arreglo, 2, 30);
        
        assertEquals(3, nuevoTamano, "El nuevo tamaño debería ser 3");
        assertEquals(30, arreglo[2], "El nuevo elemento debería estar en la posición 2");
    }

    @Test
    void testInsertarEnArregloVacio() {
        int[] arreglo = new int[5];
        int nuevoTamano = insertador.insertarElementoDesordenado(arreglo, 0, 99);
        
        assertEquals(1, nuevoTamano);
        assertEquals(99, arreglo[0]);
    }
    
    @Test
    void testInsertarEnArregloLleno() {
        int[] arreglo = {1, 2, 3}; // Arreglo de tamaño 3, completamente lleno
        int[] arregloOriginal = Arrays.copyOf(arreglo, 3);
        
        int nuevoTamano = insertador.insertarElementoDesordenado(arreglo, 3, 4);
        
        assertEquals(3, nuevoTamano, "El tamaño no debe cambiar si el arreglo está lleno");
        assertArrayEquals(arregloOriginal, arreglo, "El arreglo no debe cambiar si está lleno");
    }
}