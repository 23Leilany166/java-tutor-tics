package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para Ejemplo 2.2 — Aumento de sueldo.
 * Programación estructurada — Java 21.
 */
public class AumentoSueldoTest {

    public double calcularNuevoSueldo(double sue) {
        if (sue < 1000) {
            return sue * 1.15;
        } else {
            return sue;
        }
    }

    @Test
    public void pruebaAumento() {
        assertEquals(1006.25, calcularNuevoSueldo(875.0), 0.01);
        assertEquals(902.75, calcularNuevoSueldo(785.0), 0.01);
        assertEquals(1078.75, calcularNuevoSueldo(937.80), 0.01);
    }

    @Test
    public void pruebaSinAumento() {
        assertEquals(1300.0, calcularNuevoSueldo(1300.0), 0.01);
        assertEquals(2150.0, calcularNuevoSueldo(2150.0), 0.01);
    }
}
