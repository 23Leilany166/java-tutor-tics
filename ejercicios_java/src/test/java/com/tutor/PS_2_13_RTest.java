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
 * Pruebas para la clase PS_2_13_R.
 * Simula diferentes entradas del usuario para verificar que el programa
 * encuentra el mayor correctamente.
 */
public class PS_2_13_RTest {

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
    void testCuandoAEsElMayor() {
        String simulatedInput = "100.0\n50.0\n10.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 100.0"),
                "Debe identificar a 100.0 (A) como el mayor");
    }

    @Test
    void testCuandoBEsElMayor() {
        String simulatedInput = "10.0\n100.0\n50.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 100.0"),
                "Debe identificar a 100.0 (B) como el mayor");
    }

    @Test
    void testCuandoCEsElMayor() {
        String simulatedInput = "10.9\n50.1\n100.5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 100.5"),
                "Debe identificar a 100.5 (C) como el mayor");
    }

    @Test
    void testCuandoTodosIguales() {
        String simulatedInput = "50.0\n50.0\n50.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 50.0"),
                "Debe retornar 50.0 cuando todos son iguales");
    }

    @Test
    void testConNumerosNegativos() {
        String simulatedInput = "-10.0\n-5.0\n-20.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: -5.0"),
                "Debe identificar a -5.0 como el mayor de los números negativos");
    }

    @Test
    void testConMezclaPositivosYNegativos() {
        String simulatedInput = "-10.0\n5.0\n-3.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 5.0"),
                "Debe identificar a 5.0 como el mayor en mezcla de positivos y negativos");
    }

    @Test
    void testConCero() {
        String simulatedInput = "0.0\n-5.0\n-10.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 0.0"),
                "Debe identificar a 0.0 como el mayor");
    }

    @Test
    void testConDosNumerosIgualesMayores() {
        String simulatedInput = "100.0\n100.0\n50.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PS_2_13.main(new String[] {});

        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 100.0"),
                "Debe retornar 100.0 cuando A y B son iguales y mayores");
    }
}