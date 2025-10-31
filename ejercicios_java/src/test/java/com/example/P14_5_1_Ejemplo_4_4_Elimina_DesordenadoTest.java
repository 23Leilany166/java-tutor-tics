package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

/**
 * Clase de prueba para P14_5_1_Ejemplo_4_4_Elimina_Desordenado.
 */
public class P14_5_1_Ejemplo_4_4_Elimina_DesordenadoTest {

    private final P14_5_1_Ejemplo_4_4_Elimina_Desordenado eliminador = new P14_5_1_Ejemplo_4_4_Elimina_Desordenado();

    @Test
    void testEliminarElementoEnMedio() {
        int[] arreglo = {10, 25, 5, 40, 15};
        int tamanoOriginal = 5;
        int elementoAEliminar = 5;
        
        int nuevoTamano = eliminador.eliminarElemento(arreglo, tamanoOriginal, elementoAEliminar);
        
        assertEquals(4, nuevoTamano, "El nuevo tamaño debería ser 4");
        
        // Creamos un arreglo con el resultado esperado para comparar
        int[] arregloEsperado = {10, 25, 40, 15};
        // Copiamos solo los elementos válidos del arreglo modificado para la comparación
        int[] arregloResultado = Arrays.copyOf(arreglo, nuevoTamano);
        
        assertArrayEquals(arregloEsperado, arregloResultado, "El elemento 5 no fue eliminado correctamente");
    }
    
    @Test
    void testEliminarPrimerElemento() {
        int[] arreglo = {50, 20, 30, 40};
        int nuevoTamano = eliminador.eliminarElemento(arreglo, 4, 50);
        
        assertEquals(3, nuevoTamano);
        assertArrayEquals(new int[]{20, 30, 40}, Arrays.copyOf(arreglo, nuevoTamano));
    }
    
    @Test
    void testEliminarUltimoElemento() {
        int[] arreglo = {10, 20, 30, 60};
        int nuevoTamano = eliminador.eliminarElemento(arreglo, 4, 60);
        
        assertEquals(3, nuevoTamano);
        assertArrayEquals(new int[]{10, 20, 30}, Arrays.copyOf(arreglo, nuevoTamano));
    }

    @Test
    void testElementoNoEncontrado() {
        int[] arreglo = {10, 20, 30, 40, 50};
        int[] arregloOriginal = Arrays.copyOf(arreglo, arreglo.length);
        int tamanoOriginal = 5;
        
        int nuevoTamano = eliminador.eliminarElemento(arreglo, tamanoOriginal, 99);
        
        assertEquals(tamanoOriginal, nuevoTamano, "El tamaño no debería cambiar si el elemento no existe");
        assertArrayEquals(arregloOriginal, arreglo, "El arreglo no debería cambiar si el elemento no existe");
    }
    
    @Test
    void testEliminarElementoDuplicado() {
        // Tu algoritmo solo elimina la primera ocurrencia, lo cual es correcto de probar.
        int[] arreglo = {10, 5, 20, 5, 30};
        int nuevoTamano = eliminador.eliminarElemento(arreglo, 5, 5);
        
        assertEquals(4, nuevoTamano);
        assertArrayEquals(new int[]{10, 20, 5, 30}, Arrays.copyOf(arreglo, nuevoTamano));
    }
}