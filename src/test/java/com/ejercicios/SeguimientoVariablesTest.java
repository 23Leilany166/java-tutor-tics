package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeguimientoVariablesTest extends BaseConsoleTest {

    @Test
    @DisplayName("Verifica la traza completa de las variables")
    public void testSeguimientoCompleto() {
        // No se necesita provideInput(), el programa no lee datos.
        SeguimientoVariables.main(new String[0]);
        String output = getOutput();

        // Verificamos los valores clave en cada paso
        assertTrue(output.contains("Paso 1: i = 0"), "Fallo en Paso 1");
        assertTrue(output.contains("Paso 2: i = 1"), "Fallo en Paso 2");
        assertTrue(output.contains("Paso 3: acum = 0"), "Fallo en Paso 3");
        // j = 25 / 3 (división entera) = 8
        assertTrue(output.contains("Paso 4: j = 8"), "Fallo en Paso 4");
        assertTrue(output.contains("Paso 5: car = a"), "Fallo en Paso 5");
        // acum = j / i = 8 / 1 = 8
        assertTrue(output.contains("Paso 6: acum = 8"), "Fallo en Paso 6");
        // rea = acum / 3.0 = 8 / 3.0 = 2.666...
        assertTrue(output.contains("Paso 7: rea = 2.66"), "Fallo en Paso 7"); // Contiene el inicio
        // band = (true) && (15 < 8.0) = true && false = false
        assertTrue(output.contains("Paso 8: band = false"), "Fallo en Paso 8");
        // sum = acum * 5.0 / (j*j) = 8 * 5.0 / (8*8) = 40.0 / 64.0 = 0.625
        assertTrue(output.contains("Paso 9: sum = 0.625"), "Fallo en Paso 9");
        // i = i * 3 = 1 * 3 = 3
        assertTrue(output.contains("Paso 10: i = 3"), "Fallo en Paso 10");
        // rea = rea / 5.0 = 2.666... / 5.0 = 0.5333...
        assertTrue(output.contains("Paso 11: rea = 0.53"), "Fallo en Paso 11"); // Contiene el inicio
        // band = band || (i == j) = false || (3 == 8) = false
        assertTrue(output.contains("Paso 12: band = false"), "Fallo en Paso 12");

        // Verificar los mensajes de error de compilación simulados
        assertTrue(output.contains("Paso 13: Causa error de compilación"), "Fallo en Paso 13");
        assertTrue(output.contains("Paso 14: Causa error de compilación"), "Fallo en Paso 14");

        // Verificar el bloque de valores finales
        assertTrue(output.contains("--- Valores finales ---"));
        assertTrue(output.contains("i: 3"));
        assertTrue(output.contains("acum: 8"));
        assertTrue(output.contains("j: 8"));
        assertTrue(output.contains("sum: 0.625"));
        assertTrue(output.contains("car: a"));
        assertTrue(output.contains("band: false"));
    }
}