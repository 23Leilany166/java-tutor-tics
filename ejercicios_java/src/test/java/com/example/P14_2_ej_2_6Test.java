package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para P14_2_ej_2_6.
 */
public class P14_2_ej_2_6Test {

    private final P14_2_ej_2_6 programa = new P14_2_ej_2_6();

    @Test
    void testAccion1ParaSelectores1y2() {
        // Probamos que tanto el 1 como el 2 devuelvan "Acción 1"
        assertEquals("Realizando acción 1", programa.seleccionarAccion(1), "El selector 1 debería retornar 'Acción 1'");
        assertEquals("Realizando acción 1", programa.seleccionarAccion(2), "El selector 2 debería retornar 'Acción 1'");
    }

    @Test
    void testAccion2ParaSelectores3a5() {
        // Probamos los casos que deben devolver "Acción 2"
        assertEquals("Realizando acción 2", programa.seleccionarAccion(3), "El selector 3 debería retornar 'Acción 2'");
        assertEquals("Realizando acción 2", programa.seleccionarAccion(4), "El selector 4 debería retornar 'Acción 2'");
        assertEquals("Realizando acción 2", programa.seleccionarAccion(5), "El selector 5 debería retornar 'Acción 2'");
    }

    @Test
    void testAccion3ParaCasoDefault() {
        // Probamos un valor que no está en los casos, como 0
        assertEquals("Realizando acción 3", programa.seleccionarAccion(0), "Un selector no definido (0) debería retornar 'Acción 3'");
        
        // Probamos otro valor, como un número más alto
        assertEquals("Realizando acción 3", programa.seleccionarAccion(10), "Un selector no definido (10) debería retornar 'Acción 3'");
    }
}