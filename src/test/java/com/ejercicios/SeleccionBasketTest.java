// Archivo: src/test/java/com/ejercicios/SeleccionBasketTest.java
package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// Asumo que heredas de BaseConsoleTest
public class SeleccionBasketTest extends BaseConsoleTest {

    @Test
    @DisplayName("Prueba un escenario mixto con aptos y no aptos")
    public void testEscenarioMixto() {
        // 1. Ana F 20 60 1.75 -> Apta
        // 2. Bea F 20 60 1.70 -> No Apta
        // 3. Fabi F 20 70 1.80 -> Apta
        // 4. Carlos M 20 80 1.85 -> Apto
        // 5. David M 20 70 1.85 -> No Apto
        // 6. Gus K 20 70 1.80 -> Sexo inválido
        // 7. X -> Terminar

        final String input = "Ana F 20 60 1.75\n" +
                "Bea F 20 60 1.70\n" +
                "Fabi F 20 70 1.80\n" +
                "Carlos M 20 80 1.85\n" +
                "David M 20 70 1.85\n" +
                "Gus K 20 70 1.80\n" +
                "X\n"; // Terminador

        provideInput(input);
        SeleccionBasket.main(new String[0]);
        String output = getOutput();

        // System.out.println(output); // Descomentar para depurar

        // Verificar Nombres Aptas (Ana y Fabi)
        assertTrue(output.contains("Ana"), "Ana debería estar en la lista de aptas");
        assertTrue(output.contains("Fabi"), "Fabi debería estar en la lista de aptas");
        assertFalse(output.contains("Bea"), "Bea NO debería estar en la lista de aptas");

        // Verificar Porcentaje Femenino
        assertTrue(output.contains("66.67%"), "Error en % Aptas (debería ser 66.67%)");

        // Verificar Nombres Aptos (Carlos)
        assertTrue(output.contains("Carlos"), "Carlos debería estar en la lista de aptos");
        assertFalse(output.contains("David"), "David NO debería estar en la lista de aptos");

        // Verificar Porcentaje Masculino
        assertTrue(output.contains("50.00%"), "Error en % Aptos (debería ser 50.00%)");

        // Verificar Sexo inválido
        assertTrue(output.contains("Sexo inválido para: Gus"), "Debería reportar sexo inválido");
    }

    @Test
    @DisplayName("Prueba sin ingresar datos (solo terminador)")
    public void testSinDatos() {
        // <<< CORRECCIÓN: La entrada solo necesita ser "X\n"
        // porque el 'main' ahora comprueba 'X' primero.
        final String input = "X\n";

        provideInput(input);
        SeleccionBasket.main(new String[0]);
        String output = getOutput();

        // System.out.println(output); // Descomentar para depurar

        // Debe mostrar N/A para ambos porcentajes
        assertTrue(output.contains("N/A (No hubo alumnas)"), "Error en % Aptas sin datos");
        assertTrue(output.contains("N/A (No hubo alumnos)"), "Error en % Aptos sin datos");
    }
}