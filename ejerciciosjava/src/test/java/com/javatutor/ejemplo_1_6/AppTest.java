package com.javatutor.ejemplo_1_6;

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
        // Redirigimos la salida estándar (System.out) a nuestro captor para poder leerla después
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        // Restauramos System.in y System.out a su estado original para no afectar otros tests
        System.setIn(standardIn);
        System.setOut(standardOut);
    }

    @Test
    public void testMainInvertirOrden() {
        // Test 1: Orden inverso básico
        String input = "1\n2\n3\n4"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("4 3 2 1"), 
            "La consola debería mostrar los números en orden inverso: 4 3 2 1");
    }

    @Test
    public void testMainConNumerosNegativos() {
        // Test 2: Con números negativos
        outputStreamCaptor.reset();
        String input = "-5\n0\n10\n20"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("20 10 0 -5"), 
            "La consola debería mostrar los números invertidos incluyendo negativos");
    }

    @Test
    public void testMainConNumerosIguales() {
        // Test 3: Con números iguales
        outputStreamCaptor.reset();
        String input = "5\n5\n5\n5"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("5 5 5 5"), 
            "La consola debería mostrar todos los números iguales en orden inverso");
    }
}