// Archivo: src/test/java/com/ejercicios/BisiestosPerfectosTest.java
package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Asumo que heredas de BaseConsoleTest
public class BisiestosPerfectosTest extends BaseConsoleTest {

    // --- Pruebas Unitarias (Enfoque preferido) ---
    // (Estas pruebas ya estaban bien)
    @Test
    @DisplayName("Prueba de años bisiestos")
    public void testEsBisiesto() {
        assertTrue(BisiestosPerfectos.esBisiesto(2000), "Año 2000 es divisible por 400");
        assertTrue(BisiestosPerfectos.esBisiesto(2004), "Año 2004 es divisible por 4, no por 100");
        assertFalse(BisiestosPerfectos.esBisiesto(1900), "Año 1900 es divisible por 100, no por 400");
        assertFalse(BisiestosPerfectos.esBisiesto(2001), "Año 2001 no es divisible por 4");
    }

    @Test
    @DisplayName("Prueba de números perfectos")
    public void testEsPerfecto() {
        assertTrue(BisiestosPerfectos.esPerfecto(6), "6 es perfecto (1+2+3)");
        assertTrue(BisiestosPerfectos.esPerfecto(28), "28 es perfecto (1+2+4+7+14)");
        assertFalse(BisiestosPerfectos.esPerfecto(1), "1 no es perfecto por definición");
        assertFalse(BisiestosPerfectos.esPerfecto(10), "10 no es perfecto (1+2+5 = 8)");
    }

    // --- Prueba del método main (CORREGIDA) ---
    @Test
    @DisplayName("Prueba la salida del main (debe encontrar 28 y 496)")
    public void testMainOutput() {
        BisiestosPerfectos.main(new String[0]);
        String output = getOutput();

        // ** LA CORRECCIÓN ESTÁ AQUÍ **
        // El test ahora comprueba que la salida SÍ contenga la lista [28, 496]
        assertTrue(output.contains("[28, 496]"),
                "La salida debe contener la lista [28, 496]");

        // Y nos aseguramos de que NO contenga el mensaje de "No se encontraron"
        assertFalse(output.contains("No se encontraron años que cumplan ambas condiciones"),
                "La salida NO debe decir que la lista está vacía");
    }
}