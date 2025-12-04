package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

/**
 * Pruebas para la clase Problema_2_4_R.
 * Simula diferentes entradas del usuario para verificar que el programa calcula
 * el promedio
 * y determina correctamente si el alumno aprueba o no.
 */
public class Problema_2_4_RTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testCasoAprobado() {
        // Promedio de (7, 8, 5, 6, 9) es 7.0, que es >= 6
        String simulatedInput = "123\n7.0\n8.0\n5.0\n6.0\n9.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 123"), "Debe imprimir la matrícula correcta.");
        assertTrue(output.contains("Promedio: 7.0"), "Debe imprimir el promedio correcto.");
        assertTrue(output.contains("Estado: Aprobado"),
                "Para un promedio de 7.0, el estado debe ser 'Aprobado'.");
    }

    @Test
    void testCasoNoAprobado() {
        // Promedio de (5, 4, 6, 5.5, 6) es 5.3, que es < 6
        String simulatedInput = "456\n5.0\n4.0\n6.0\n5.5\n6.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 456"), "Debe imprimir la matrícula correcta.");
        assertTrue(output.contains("5.3"), "Debe imprimir el promedio correcto (5.3).");
        assertTrue(output.contains("Estado: No Aprobado"),
                "Para un promedio de 5.3, el estado debe ser 'No Aprobado'.");
    }

    @Test
    void testCasoLimitePromedio6Exacto() {
        // Promedio de (6, 6, 6, 6, 6) es 6.0, que es >= 6 (caso límite)
        String simulatedInput = "789\n6.0\n6.0\n6.0\n6.0\n6.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 789"), "Debe imprimir la matrícula correcta.");
        assertTrue(output.contains("Promedio: 6.0"), "Debe imprimir promedio 6.0 exacto.");
        assertTrue(output.contains("Estado: Aprobado"),
                "Para un promedio de 6.0 exacto, el estado debe ser 'Aprobado' (caso límite).");
    }

    @Test
    void testCasoCalificacionesPerfectas() {
        // Promedio de (10, 10, 10, 10, 10) es 10.0
        String simulatedInput = "999\n10.0\n10.0\n10.0\n10.0\n10.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 999"));
        assertTrue(output.contains("Promedio: 10.0"));
        assertTrue(output.contains("Estado: Aprobado"));
    }

    @Test
    void testCasoPromedioBajo() {
        // Promedio de (3, 4, 2, 3.5, 2.5) es 3.0, muy por debajo de 6
        String simulatedInput = "111\n3.0\n4.0\n2.0\n3.5\n2.5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 111"));
        assertTrue(output.contains("Promedio: 3.0"));
        assertTrue(output.contains("Estado: No Aprobado"));
    }

    @Test
    void testCasoCasiAprueba() {
        // Promedio de (5.8, 5.9, 6.0, 5.7, 5.6) es 5.8, justo por debajo de 6
        String simulatedInput = "222\n5.8\n5.9\n6.0\n5.7\n5.6\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 222"));
        assertTrue(output.contains("Promedio: 5.8"));
        assertTrue(output.contains("Estado: No Aprobado"));
    }

    @Test
    void testCasoConCeros() {
        // Promedio de (0, 0, 0, 0, 0) es 0.0
        String simulatedInput = "333\n0.0\n0.0\n0.0\n0.0\n0.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 333"));
        assertTrue(output.contains("Promedio: 0.0"));
        assertTrue(output.contains("Estado: No Aprobado"));
    }
}