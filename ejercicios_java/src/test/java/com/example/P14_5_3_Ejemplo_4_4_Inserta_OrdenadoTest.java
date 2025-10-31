package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

/**
 * Clase de prueba para P14_5_3_Ejemplo_4_4_Inserta_Ordenado.
 */
public class P14_5_3_Ejemplo_4_4_Inserta_OrdenadoTest {

    private final P14_5_3_Ejemplo_4_4_Inserta_Ordenado insertador = new P14_5_3_Ejemplo_4_4_Inserta_Ordenado();

    @Test
    void testInsertarEnMedio() {
        int[] arreglo = new int[10];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 40;
        arreglo[3] = 50;
        
        int nuevoTamano = insertador.insertarElementoOrdenado(arreglo, 4, 30);
        
        assertEquals(5, nuevoTamano);
        assertArrayEquals(new int[]{10, 20, 30, 40, 50}, Arrays.copyOf(arreglo, nuevoTamano));
    }

    @Test
    void testInsertarAlPrincipio() {
        int[] arreglo = new int[10];
        arreglo[0] = 20;
        arreglo[1] = 30;
        
        int nuevoTamano = insertador.insertarElementoOrdenado(arreglo, 2, 10);
        
        assertEquals(3, nuevoTamano);
        assertArrayEquals(new int[]{10, 20, 30}, Arrays.copyOf(arreglo, nuevoTamano));
    }

    @Test
    void testInsertarAlFinal() {
        int[] arreglo = new int[10];
        arreglo[0] = 10;
        arreglo[1] = 20;
        
        int nuevoTamano = insertador.insertarElementoOrdenado(arreglo, 2, 30);
        
        assertEquals(3, nuevoTamano);
        assertArrayEquals(new int[]{10, 20, 30}, Arrays.copyOf(arreglo, nuevoTamano));
    }
    
    @Test
    void testElementoYaExiste() {
        int[] arreglo = new int[10];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        
        int[] arregloOriginal = Arrays.copyOf(arreglo, 10);
        int nuevoTamano = insertador.insertarElementoOrdenado(arreglo, 3, 20);
        
        assertEquals(3, nuevoTamano, "El tamaño no debe cambiar si el elemento ya existe");
        assertArrayEquals(arregloOriginal, arreglo, "El arreglo no debe cambiar si el elemento ya existe");
    }

    @Test
    void testArregloLleno() {
        int[] arreglo = {10, 20, 30}; // Arreglo de tamaño 3, lleno
        int nuevoTamano = insertador.insertarElementoOrdenado(arreglo, 3, 25);
        
        assertEquals(3, nuevoTamano, "El tamaño no debe cambiar si el arreglo está lleno");
    }
    
    @Test
    void testInsertarEnArregloVacio() {
        int[] arreglo = new int[10];
        int nuevoTamano = insertador.insertarElementoOrdenado(arreglo, 0, 100);
        
        assertEquals(1, nuevoTamano);
        assertEquals(100, arreglo[0]);
    }
}