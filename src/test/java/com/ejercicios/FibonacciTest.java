package com.ejercicios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Asumiendo que Fibonacci está en el package correcto
// import com.ITSOEH.programasjava.PS_4_6.Fibonacci;

public class FibonacciTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testFibonacciOutput() {
        Fibonacci.main(null);

        String output = outContent.toString().replace("\r\n", "\n");

        assertTrue(output.startsWith("Arreglo de los primeros 100 números Fibonacci:"));
        assertTrue(output.contains("0 1 1 2 3 5 8 13 21 34"));
    }
}