package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase PS_3_30R.
 */
public class PS_3_30RTest { // El nombre del archivo debe ser PS_3_30RTest.java

    @Test
    void testSenoDeUno() {
        PS_3_30R ejercicio = new PS_3_30R();
        // X = 1
        // Term 1 = 1. (Suma=1, Count=1). |Term2| = |-1/6| = 0.166... > 0.01
        // Term 2 = -0.166... (Suma=0.833..., Count=2). |Term3| = |1/120| = 0.0083... <= 0.01
        // Bucle para.
        
        PS_3_30R.ResultadosSeno res = ejercicio.calcularSeno(1);
        
        assertEquals(2, res.conteoTerminos, "Para X=1, se deben sumar 2 términos");
        assertEquals(1.0 - (1.0/6.0), res.valorSeno, 0.0001, "El valor de Sen(1) con 2 términos es 0.833...");
    }

    @Test
    void testSenoDeDos() {
        PS_3_30R ejercicio = new PS_3_30R();
        // X = 2
        // Term 1 = 2. (Suma=2, Count=1). |Term2| = |-8/6| = 1.333... > 0.01
        // Term 2 = -1.333... (Suma=0.666..., Count=2). |Term3| = |32/120| = 0.266... > 0.01
        // Term 3 = 0.266... (Suma=0.933..., Count=3). |Term4| = |-128/5040| = 0.025... > 0.01
        // Term 4 = -0.0253... (Suma=0.907..., Count=4). |Term5| = |512/362880| = 0.0014... <= 0.01
        // Bucle para.
        
        PS_3_30R.ResultadosSeno res = ejercicio.calcularSeno(2);
        
        double esperado = 2.0 - (Math.pow(2, 3) / 6.0) + (Math.pow(2, 5) / 120.0) - (Math.pow(2, 7) / 5040.0);
        
        assertEquals(4, res.conteoTerminos, "Para X=2, se deben sumar 4 términos");
        assertEquals(esperado, res.valorSeno, 0.0001, "El valor de Sen(2) con 4 términos es aprox 0.9079");
    }

    @Test
    void testSenoDeCero() {
        PS_3_30R ejercicio = new PS_3_30R();
        // X = 0
        // Term 1 = 0. (Suma=0, Count=1). |Term2| = 0 <= 0.01
        // Bucle para.
        
        PS_3_30R.ResultadosSeno res = ejercicio.calcularSeno(0);
        
        assertEquals(1, res.conteoTerminos, "Para X=0, se debe sumar 1 término (el 0)");
        assertEquals(0.0, res.valorSeno, 0.0001, "El valor de Sen(0) debe ser 0.0");
    }
    
    @Test
    void testSenoDeMenosUno() {
        PS_3_30R ejercicio = new PS_3_30R();
        // X = -1
        // Term 1 = -1. (Suma=-1, Count=1). |Term2| = |-(-1)/6| = 0.166... > 0.01
        // Term 2 = +0.166... (Suma=-0.833..., Count=2). |Term3| = |+(-1)/120| = 0.0083... <= 0.01
        // Bucle para.
        
        PS_3_30R.ResultadosSeno res = ejercicio.calcularSeno(-1);
        
        assertEquals(2, res.conteoTerminos, "Para X=-1, se deben sumar 2 términos");
        assertEquals(-1.0 + (1.0/6.0), res.valorSeno, 0.0001, "El valor de Sen(-1) con 2 términos es -0.833...");
    }
}