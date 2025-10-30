package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

/**
 * Pruebas para la clase Problema_3_17R.
 */
public class Problema_3_17RTest { // El nombre del archivo debe ser Problema_3_17RTest.java

    @Test
    void testPrimosHastaVeinte() {
        Problema_3_17R ejercicio = new Problema_3_17R();
        
        // 1. Ejecución: Primos menores que 20
        Problema_3_17R.ResultadosPrimos resultados = ejercicio.encontrarPrimos(20);
        
        // 2. Verificación
        int conteoEsperado = 8;
        List<Integer> primosEsperados = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);

        assertEquals(conteoEsperado, resultados.conteo, "Debe haber 8 primos menores que 20");
        assertEquals(primosEsperados, resultados.primos, "La lista de primos no coincide");
    }

    @Test
    void testPrimosLimiteBajo() {
        Problema_3_17R ejercicio = new Problema_3_17R();
        
        // Prueba con 1 (no debe encontrar primos)
        Problema_3_17R.ResultadosPrimos res1 = ejercicio.encontrarPrimos(1);
        assertEquals(0, res1.conteo, "No debe haber primos menores que 1");

        // Prueba con 2 (no debe encontrar primos, el límite es exclusivo)
        Problema_3_17R.ResultadosPrimos res2 = ejercicio.encontrarPrimos(2);
        assertEquals(0, res2.conteo, "No debe haber primos menores que 2");
    }

    @Test
    void testPrimosLimiteTres() {
        Problema_3_17R ejercicio = new Problema_3_17R();
        
        // Prueba con 3 (solo debe encontrar el 2)
        Problema_3_17R.ResultadosPrimos res3 = ejercicio.encontrarPrimos(3);
        assertEquals(1, res3.conteo, "Debe haber 1 primo menor que 3 (el 2)");
        assertEquals(Arrays.asList(2), res3.primos, "La lista solo debe contener el 2");
    }

    @Test
    void testPrimosLimiteExacto() {
        Problema_3_17R ejercicio = new Problema_3_17R();
        
        // Prueba con 17 (debe encontrar primos HASTA 13, sin incluir 17)
        Problema_3_17R.ResultadosPrimos res = ejercicio.encontrarPrimos(17);
        
        int conteoEsperado = 6;
        List<Integer> primosEsperados = Arrays.asList(2, 3, 5, 7, 11, 13);
        
        assertEquals(conteoEsperado, res.conteo, "Debe haber 6 primos menores que 17");
        assertEquals(primosEsperados, res.primos, "La lista de primos menores que 17 es incorrecta");
    }
}