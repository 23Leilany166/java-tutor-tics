package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Pruebas para el método de inserción directa */
public class InsercionDirectaTest {

    @Test
    public void testArregloOrdenadoAscendente() {
        int[] datos = {5, 2, 4, 6, 1, 3};
        InsercionDirecta.insertarOrdenado(datos);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, datos);
    }

    @Test
    public void testArregloYaOrdenado() {
        int[] datos = {1, 2, 3, 4};
        InsercionDirecta.insertarOrdenado(datos);
        assertArrayEquals(new int[]{1, 2, 3, 4}, datos);
    }

    @Test
    public void testArregloConNegativos() {
        int[] datos = {3, -1, 0, -5, 2};
        InsercionDirecta.insertarOrdenado(datos);
        assertArrayEquals(new int[]{-5, -1, 0, 2, 3}, datos);
    }
}
