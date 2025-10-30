package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConteoCalificacionesTest {

    // Guarda los flujos originales de entrada y salida
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    // Crea flujos falsos para capturar la salida
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUpStreams() {
        // Configura un 'falso' System.out para capturar la salida
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // JUnit puede usar un Locale diferente (ej. inglés) y fallar al leer
        // doubles con punto decimal. Forzamos el Locale a US.
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    void restoreStreams() {
        // Restaura los flujos originales
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testConteoCalificacionesMain() {
        // 1. Define las entradas del usuario simuladas (cada \n es un 'Enter')
        // Probamos un valor de cada rango
        String simulatedInput = "2.5\n" // Rango 1
                + "8.0\n" // Rango 4
                + "5.5\n" // Rango 2
                + "6.1\n" // Rango 3
                + "10.0\n" // Rango 4
                + "0.0\n" // Rango 1
                + "-1\n"; // Finalizar

        // 2. Configura un 'falso' System.in para que lea de nuestro string
        InputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // 3. Ejecuta el método main
        // (Ignoramos los 'prompts' de ingrese calificación que también se imprimirán)
        ConteoCalificaciones.main(null);

        // 4. Captura la salida de la consola
        String output = outContent.toString();

        // 5. Verifica que la salida final contenga los conteos correctos
        // Usamos assertTrue(output.contains(...)) porque la salida
        // también incluye los "Ingrese una calificación...".

        System.setOut(originalOut); // Restauramos la salida para ver el resultado
        System.out.println("--- Salida Capturada por el Test ---");
        System.out.println(output);
        System.out.println("-----------------------------------");

        // Verificamos los conteos esperados
        // Rango 1: 2.5 y 0.0 -> conteo1 = 2
        assertTrue(output.contains("Calificaciones en el rango 0...3.99: 2"));
        // Rango 2: 5.5 -> conteo2 = 1
        assertTrue(output.contains("Calificaciones en el rango 4...5.99: 1"));
        // Rango 3: 6.1 -> conteo3 = 1
        assertTrue(output.contains("Calificaciones en el rango 6...7.99: 1"));
        // Rango 4: 8.0 y 10.0 -> conteo4 = 2
        assertTrue(output.contains("Calificaciones en el rango 8...10: 2"));
    }
}