package com.tutor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejemplo_2_1RTest {

    @Test
    void testVerificarStatusAprobado() {
        Ejemplo_2_1R ejercicio = new Ejemplo_2_1R();
        String resultado = ejercicio.verificarStatus(9); // Test with a number > 8
        assertEquals("Aprobado", resultado, "Un número mayor que 8 debe resultar en 'Aprobado'");
        
        resultado = ejercicio.verificarStatus(10); // Test with another number > 8
         assertEquals("Aprobado", resultado, "Un número mayor que 8 debe resultar en 'Aprobado'");
    }

    @Test
    void testVerificarStatusReprobado() {
        Ejemplo_2_1R ejercicio = new Ejemplo_2_1R();
        String resultado = ejercicio.verificarStatus(7); // Test with a number < 8
        assertEquals("Reprobado", resultado, "Un número menor que 8 debe resultar en 'Reprobado'");

        resultado = ejercicio.verificarStatus(0); // Test with zero
        assertEquals("Reprobado", resultado, "Cero debe resultar en 'Reprobado'");
    }

    @Test
    void testVerificarStatusLimite() {
        Ejemplo_2_1R ejercicio = new Ejemplo_2_1R();
        String resultado = ejercicio.verificarStatus(8); // Test with the boundary number 8
        assertEquals("Reprobado", resultado, "El número 8 exacto debe resultar en 'Reprobado'");
    }
}