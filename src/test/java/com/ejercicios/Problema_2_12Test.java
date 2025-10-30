package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Asumiendo que has movido Problema_2_12 al package correcto
// import c.Problema_2_12.Problema_2_12; 

public class Problema_2_12Test {

    private final InputStream originalIn = System.in;
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
        System.setIn(originalIn);
    }

    private String normalize(String s) {
        return s.replace("\r\n", "\n").replace("\r", "\n");
    }

    @Test
    public void testSueldoHorasExtras() {
        // Sueldo: 1000, Cate: 3 (phe=50), Horas: 20, Repetir: N
        // Cálculo: 1000 + (20 * 50) = 2000
        String input = "1000\n3\n20\nN\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Problema_2_12.main(null);

        String output = normalize(outContent.toString());

        assertTrue(output.contains("Monto a pagar al trabajador: 2000.0"));
        assertTrue(output.contains("Costo de la hora: 50.0"));
    }
}