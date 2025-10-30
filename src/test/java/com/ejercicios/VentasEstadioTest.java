// Archivo: src/test/java/com/ejercicios/VentasEstadioTest.java
package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class VentasEstadioTest extends BaseConsoleTest {

        @Test
        @DisplayName("Prueba la recaudación total y conteo con datos de la Tabla 3.16")
        public void testRecaudacionTotalConTabla316() {
                Locale.setDefault(Locale.US);

                // P1=7.25, P2=15.80, P3=25.00, P4=50.00, P5=75.00
                final String PRECIOS = "7.25\n15.80\n25.00\n50.00\n75.00\n";

                // Secuencia de Ventas (CLAVE CANT)
                final String VENTAS = "2 3\n" +
                                "2 4\n" +
                                "1 6\n" +
                                "4 1\n" +
                                "1 12\n" +
                                "2 8\n" +
                                "5 3\n" +
                                "2 7\n" +
                                "3 14\n" +
                                "4 1\n" +
                                "2 11\n" +
                                "4 9\n" +
                                "5 7\n" +
                                "1 25\n" +
                                "3 4\n" +
                                "-1 -1\n";

                final String input = PRECIOS + VENTAS;
                provideInput(input);

                // --- EJECUCIÓN Y VERIFICACIÓN ---

                VentasEstadio.main(new String[0]);
                String output = getOutput();

                // 1. Verificación de la Recaudación Total (RECAU = 3099.15)
                // Buscamos solo el valor formateado
                assertTrue(output.contains("$3099.15"),
                                "La Recaudación Total final debe ser $3099.15.");

                // 2. Verificación de la Cantidad de Boletos Acumulados por Tipo (APx)
                // Valores finales de la tabla: AP1=43, AP2=33, AP3=18, AP4=11, AP5=10
                // Buscamos el valor de conteo en la salida.
                assertTrue(output.contains("TIPO 1: 43"), "Error en AP1 (Esperado: 43).");
                assertTrue(output.contains("TIPO 2: 33"), "Error en AP2 (Esperado: 33).");
                assertTrue(output.contains("TIPO 3: 18"), "Error en AP3 (Esperado: 18).");
                assertTrue(output.contains("TIPO 4: 11"), "Error en AP4 (Esperado: 11).");
                assertTrue(output.contains("TIPO 5: 10"), "Error en AP5 (Esperado: 10).");

                // 3. Verificación de manejo de errores
                assertFalse(output.contains("Clave de Localidad inválida"),
                                "No debería reportar claves inválidas en este test.");
        }
}