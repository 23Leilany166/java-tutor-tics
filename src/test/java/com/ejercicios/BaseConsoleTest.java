package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Clase base abstracta para tests que necesitan simular
 * la entrada (System.in) y capturar la salida (System.out) de la consola.
 */
public abstract class BaseConsoleTest {

    protected final InputStream systemIn = System.in;
    protected final PrintStream systemOut = System.out;
    protected ByteArrayInputStream testIn;
    protected ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    /**
     * Proporciona un string como entrada simulada para System.in.
     * 
     * @param data El string que simula la entrada del usuario.
     */
    protected void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    /**
     * Obtiene la salida capturada de System.out como un String.
     * Normaliza los saltos de línea.
     * 
     * @return La salida capturada.
     */
    protected String getOutput() {
        return testOut.toString().replace("\r\n", "\n");
    }
}