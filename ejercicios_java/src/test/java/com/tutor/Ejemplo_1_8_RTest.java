package com.tutor; // Mismo paquete que el otro archivo

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
 * Esta clase prueba el método 'main' de la clase Ejemplo_1_8_R.
 * Simula diferentes entradas del usuario para verificar que el programa
 * funciona correctamente.
 */
public class Ejemplo_1_8_RTest {

    // Guardamos los flujos originales de la consola para restaurarlos después de
    // cada prueba.
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    // Este objeto capturará la salida que normalmente iría a la consola.
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        // Antes de cada prueba, redirigimos System.out a nuestro capturador.
        System.setOut(new PrintStream(outContent));
        // Aseguramos que el formato de número decimal use un punto.
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    public void restoreStreams() {
        // Después de cada prueba, restauramos los flujos originales.
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testPromedioNormal() {
        // Simulamos la entrada del usuario.
        String simulatedInput = "12345\n" + // Matrícula
                "10.0\n" + // Calificación 1
                "9.5\n" + // Calificación 2
                "8.0\n" + // Calificación 3
                "7.5\n" + // Calificación 4
                "9.0\n"; // Calificación 5

        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Ejecutamos el método main
        Ejemplo_1_8_R.main(new String[] {});

        // Verificamos la salida
        String output = outContent.toString();
        assertTrue(output.contains("Matrícula del alumno: 12345"),
                "La salida debe contener la matrícula correcta.");
        assertTrue(output.contains("Promedio de calificaciones: 8.8"),
                "El promedio debe ser 8.8");
    }

    @Test
    void testPromedioConCalificacionesPerfectas() {
        String simulatedInput = "99999\n10.0\n10.0\n10.0\n10.0\n10.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Ejemplo_1_8_R.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula del alumno: 99999"));
        assertTrue(output.contains("Promedio de calificaciones: 10.0"));
    }

    @Test
    void testPromedioConCalificacionesBajas() {
        String simulatedInput = "55555\n6.0\n7.0\n5.0\n4.0\n3.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Ejemplo_1_8_R.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula del alumno: 55555"));
        assertTrue(output.contains("Promedio de calificaciones: 5.0"));
    }

    @Test
    void testPromedioConCeros() {
        String simulatedInput = "11111\n0.0\n0.0\n0.0\n0.0\n0.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Ejemplo_1_8_R.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula del alumno: 11111"));
        assertTrue(output.contains("Promedio de calificaciones: 0.0"));
    }

    @Test
    void testPromedioConDecimales() {
        String simulatedInput = "22222\n8.5\n9.3\n7.8\n8.2\n9.7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Ejemplo_1_8_R.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula del alumno: 22222"));
        assertTrue(output.contains("Promedio de calificaciones: 8.7"));
    }
}