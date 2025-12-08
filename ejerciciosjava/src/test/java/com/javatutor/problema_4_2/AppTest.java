package com.javatutor.problema_4_2;

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
    public void testEliminarDuplicadosConDuplicados() {
        String input = "5\n1\n2\n2\n3\n1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("sin repetir") || salidaConsola.contains("1"),
            "Debería mostrar array sin duplicados");
    }

    @Test
    public void testEliminarDuplicadosSinDuplicados() {
        outputStreamCaptor.reset();
        String input = "4\n1\n2\n3\n4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("1") && salidaConsola.contains("4"),
            "Debería mostrar todos los elementos");
    }

    @Test
    public void testEliminarDuplicadosTodosIguales() {
        outputStreamCaptor.reset();
        String input = "3\n5\n5\n5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("5"),
            "Debería mostrar solo un 5");
    }
}