package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CostoLlamadasTest extends BaseConsoleTest {

        @Test
        @DisplayName("Prueba un cálculo con varios tipos de llamadas")
        public void testCalculoMixto() {
                // 1. Internacional > 3 min (I 5): 7.59 + (2 * 3.03) = 7.59 + 6.06 = 13.65
                // 2. Nacional < 3 min (N 2): 1.20
                // 3. Local (primera) (L 10): 0.0 (cl = 1)
                // 4. Tipo inválido (K 5): 0.0 (imprime error)
                // 5. Salir (X -1)
                // TOTAL = 13.65 + 1.20 + 0.0 + 0.0 = 14.85

                final String input = "I 5\n" + // Llamada 1
                                "N 2\n" + // Llamada 2
                                "L 10\n" + // Llamada 3
                                "K 5\n" + // Llamada 4 (inválida)
                                "X -1\n"; // Terminar

                provideInput(input);
                CostoLlamadas.main(new String[0]);
                String output = getOutput();

                // Verificar el mensaje de error para el tipo inválido
                assertTrue(output.contains("Tipo de llamada inválido: K"),
                                "Debería notificar sobre el tipo inválido.");

                // Verificar el total final
                assertTrue(output.contains("Costo total de las llamadas: $14.85"),
                                "La suma total de las llamadas es incorrecta.");
        }

        @Test
        @DisplayName("Prueba ingresando solo el terminador")
        public void testSoloTerminador() {
                final String input = "X -1\n";
                provideInput(input);

                CostoLlamadas.main(new String[0]);
                String output = getOutput();

                // El total debe ser 0.00
                assertTrue(output.contains("Costo total de las llamadas: $0.00"),
                                "El costo total debería ser 0.00 si no se ingresan llamadas.");
        }
}