package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

/**
 * Clase de prueba para P14_5_5_Ejemplo_4_4_Modifica_Desordenado.
 */
public class P14_5_5_Ejemplo_4_4_Modifica_DesordenadoTest {

    private final P14_5_5_Ejemplo_4_4_Modifica_Desordenado modificador = new P14_5_5_Ejemplo_4_4_Modifica_Desordenado();

    @Test
    void testModificarElementoExistente() {
        int[] arreglo = {10, 20, 30, 40};
        boolean resultado = modificador.modificarElemento(arreglo, 4, 30, 99);
        
        assertTrue(resultado, "Debería devolver true si la modificación fue exitosa");
        assertArrayEquals(new int[]{10, 20, 99, 40}, arreglo, "El elemento 30 debió ser cambiado por 99");
    }

    @Test
    void testModificarPrimerElemento() {
        int[] arreglo = {5, 15, 25};
        modificador.modificarElemento(arreglo, 3, 5, 1);
        assertArrayEquals(new int[]{1, 15, 25}, arreglo);
    }
    
    @Test
    void testModificarUltimoElemento() {
        int[] arreglo = {5, 15, 25};
        modificador.modificarElemento(arreglo, 3, 25, 99);
        assertArrayEquals(new int[]{5, 15, 99}, arreglo);
    }

    @Test
    void testModificarElementoInexistente() {
        int[] arreglo = {10, 20, 30};
        int[] arregloOriginal = Arrays.copyOf(arreglo, 3);
        boolean resultado = modificador.modificarElemento(arreglo, 3, 100, 99);
        
        assertFalse(resultado, "Debería devolver false si el elemento no se encuentra");
        assertArrayEquals(arregloOriginal, arreglo, "El arreglo no debería cambiar si el elemento no existe");
    }
    
    @Test
    void testModificarSoloPrimeraOcurrencia() {
        int[] arreglo = {10, 5, 20, 5, 30};
        modificador.modificarElemento(arreglo, 5, 5, 99);
        assertArrayEquals(new int[]{10, 99, 20, 5, 30}, arreglo, "Solo la primera ocurrencia de 5 debió cambiar");
    }
}