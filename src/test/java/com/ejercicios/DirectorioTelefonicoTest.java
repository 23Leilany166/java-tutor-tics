package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DirectorioTelefonicoTest extends BaseConsoleTest {

    /**
     * IMPORTANTE: Resetea los campos estáticos de la clase DirectorioTelefonico
     * después de cada test. Sin esto, los tests fallarían porque el
     * contador y los arrays mantendrían datos de pruebas anteriores.
     */
    @AfterEach
    public void resetDirectorio() {
        DirectorioTelefonico.contador = 0;
        // Limpiar los arrays para evitar datos residuales
        Arrays.fill(DirectorioTelefonico.nombres, null);
        Arrays.fill(DirectorioTelefonico.telefonos, null);
    }

    @Test
    @DisplayName("Prueba agregar y buscar contactos (verificando orden)")
    public void testAgregarYBuscar() {
        // 1. Agregar "Bruno"
        // 2. Agregar "Ana" (debe insertarse antes)
        // 3. Agregar "Carlos" (debe insertarse después)
        // 4. Buscar "Ana" (debe encontrarla)
        // 5. Buscar "David" (no debe encontrarlo)
        // 6. Salir
        final String input = "Bruno\n" + // 1. Buscar "Bruno" (no encontrado)
                "222-222\n" + // Agregar "Bruno"
                "Ana\n" + // 2. Buscar "Ana" (no encontrado)
                "111-111\n" + // Agregar "Ana"
                "Carlos\n" + // 3. Buscar "Carlos" (no encontrado)
                "333-333\n" + // Agregar "Carlos"
                "Ana\n" + // 4. Buscar "Ana" (encontrado)
                "David\n" + // 5. Buscar "David" (no encontrado)
                "999-999\n" + // Agregar "David"
                "salir\n"; // 6. Salir

        provideInput(input);
        DirectorioTelefonico.main(new String[0]);
        String output = getOutput();

        // Verificar inserciones
        assertTrue(output.contains("Bruno agregado al directorio."), "Fallo al agregar Bruno");
        assertTrue(output.contains("Ana agregado al directorio."), "Fallo al agregar Ana");
        assertTrue(output.contains("Carlos agregado al directorio."), "Fallo al agregar Carlos");

        // Verificar búsqueda exitosa
        assertTrue(output.contains("Teléfono de Ana: 111-111"),
                "No se encontró a Ana después de agregarla.");

        // Verificar búsqueda fallida y posterior inserción
        assertTrue(output.contains("David no encontrado."), "Debería no encontrar a David la primera vez.");
        assertTrue(output.contains("David agregado al directorio."), "Fallo al agregar David");

        // Verificar salida
        assertTrue(output.contains("Saliendo del directorio."));
    }
}