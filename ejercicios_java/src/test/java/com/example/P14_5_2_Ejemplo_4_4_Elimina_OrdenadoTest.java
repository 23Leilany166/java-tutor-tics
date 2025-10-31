package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

/**
 * Clase de prueba para P14_5_2_Ejemplo_4_4_Elimina_Ordenado.
 */
public class P14_5_2_Ejemplo_4_4_Elimina_OrdenadoTest {

    private final P14_5_2_Ejemplo_4_4_Elimina_Ordenado eliminador = new P14_5_2_Ejemplo_4_4_Elimina_Ordenado();

    @Test
    void testEliminarElementoEnMedio() {
        int[] arreglo = {10, 20, 30, 40, 50};
        int nuevoTamano = eliminador.eliminarElementoOrdenado(arreglo, 5, 30);

        assertEquals(4, nuevoTamano, "El nuevo tamaño debería ser 4");
        assertArrayEquals(new int[]{10, 20, 40, 50}, Arrays.copyOf(arreglo, nuevoTamano), "El elemento 30 no fue eliminado correctamente");
    }

    @Test
    void testEliminarPrimerElemento() {
        int[] arreglo = {5, 15, 25};
        int nuevoTamano = eliminador.eliminarElementoOrdenado(arreglo, 3, 5);
        
        assertEquals(2, nuevoTamano);
        assertArrayEquals(new int[]{15, 25}, Arrays.copyOf(arreglo, nuevoTamano));
    }

    @Test
    void testEliminarUltimoElemento() {
        int[] arreglo = {5, 15, 25};
        int nuevoTamano = eliminador.eliminarElementoOrdenado(arreglo, 3, 25);
        
        assertEquals(2, nuevoTamano);
        assertArrayEquals(new int[]{5, 15}, Arrays.copyOf(arreglo, nuevoTamano));
    }

    @Test
    void testElementoNoEncontrado_EnMedio() {
        int[] arreglo = {10, 20, 40, 50};
        int[] arregloOriginal = Arrays.copyOf(arreglo, 4);
        int nuevoTamano = eliminador.eliminarElementoOrdenado(arreglo, 4, 30);
        
        assertEquals(4, nuevoTamano, "El tamaño no debe cambiar si el elemento no existe");
        assertArrayEquals(arregloOriginal, Arrays.copyOf(arreglo, nuevoTamano), "El arreglo no debe cambiar si el elemento no existe");
    }
    
    @Test
    void testElementoNoEncontrado_MasGrande() {
        int[] arreglo = {10, 20, 30};
        int nuevoTamano = eliminador.eliminarElementoOrdenado(arreglo, 3, 100);
        assertEquals(3, nuevoTamano);
    }

    @Test
    void testElementoNoEncontrado_MasPequeno() {
        int[] arreglo = {10, 20, 30};
        int nuevoTamano = eliminador.eliminarElementoOrdenado(arreglo, 3, 5);
        assertEquals(3, nuevoTamano);
    }
    
    @Test
    void testArregloVacio() {
        int[] arreglo = {};
        int nuevoTamano = eliminador.eliminarElementoOrdenado(arreglo, 0, 5);
        assertEquals(0, nuevoTamano);
    }
}
