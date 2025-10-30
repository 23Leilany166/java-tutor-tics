package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;
import java.util.Arrays; // Necesario para assertArrayEquals

/**
 * Pruebas para la clase PS_4_6R.
 */
public class PS_4_6RTest { // El nombre del archivo debe ser PS_4_6RTest.java

    @Test
    void testPrimerosDiezFibonacci() {
        PS_4_6R ejercicio = new PS_4_6R();
        
        // 1. Ejecución
        BigInteger[] resultado = ejercicio.generarFibonacci(10);
        
        // 2. Verificación
        BigInteger[] esperados = {
            new BigInteger("0"), new BigInteger("1"), new BigInteger("1"),
            new BigInteger("2"), new BigInteger("3"), new BigInteger("5"),
            new BigInteger("8"), new BigInteger("13"), new BigInteger("21"),
            new BigInteger("34")
        };
        
        // Compara que los arreglos sean idénticos
        assertArrayEquals(esperados, resultado, "Los primeros 10 números Fibonacci no coinciden.");
    }

    @Test
    void testGenerarUnElemento() {
        PS_4_6R ejercicio = new PS_4_6R();
        BigInteger[] resultado = ejercicio.generarFibonacci(1);
        BigInteger[] esperados = { BigInteger.ZERO };
        assertArrayEquals(esperados, resultado, "Para n=1, el arreglo debe ser [0]");
    }
    
    @Test
    void testGenerarDosElementos() {
        PS_4_6R ejercicio = new PS_4_6R();
        BigInteger[] resultado = ejercicio.generarFibonacci(2);
        BigInteger[] esperados = { BigInteger.ZERO, BigInteger.ONE };
        assertArrayEquals(esperados, resultado, "Para n=2, el arreglo debe ser [0, 1]");
    }

    @Test
    void testGenerarCeroElementos() {
        PS_4_6R ejercicio = new PS_4_6R();
        BigInteger[] resultado = ejercicio.generarFibonacci(0);
        assertEquals(0, resultado.length, "Para n=0, el arreglo debe estar vacío");
    }
    
    @Test
    void testNumeroGrandeFibonacci() {
        // Prueba un número más alto para verificar el uso de BigInteger
        // F(46) = 1836311903 (índice 46)
        PS_4_6R ejercicio = new PS_4_6R();
        BigInteger[] resultado = ejercicio.generarFibonacci(47); // n=47 para obtener 47 elementos (índice 0 a 46)
        
        assertEquals(47, resultado.length, "El arreglo debe tener 47 elementos");
        assertEquals(new BigInteger("1836311903"), resultado[46], "El elemento F(46) (índice 46) es incorrecto");
    }
}