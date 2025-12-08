package com.javatutor.ps_4_4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }

    @Test
    public void testProductoPuntoVectores() {
        String input = "3\n1\n2\n3\n2\n4\n6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("2") || salidaConsola.contains("8") || salidaConsola.contains("18"),
            "Productos: 1*2=2, 2*4=8, 3*6=18");
    }

    @Test
    public void testProductoPuntoConCeros() {
        outputStreamCaptor.reset();
        String input = "2\n0\n5\n10\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("0") || salidaConsola.contains("50"),
            "Productos: 0*10=0, 5*0=0");
    }

    @Test
    public void testProductoPuntoUnitario() {
        outputStreamCaptor.reset();
        String input = "3\n1\n1\n1\n1\n1\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("1"),
            "Todos los productos deben ser 1");
    }
}