package com.ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ejemplo3_5Test {

    @Test
    void cuboIndividual() {
        assertEquals(8, Ejemplo3_5.cubo(2));
        assertEquals(27, Ejemplo3_5.cubo(3));
        assertEquals(0, Ejemplo3_5.cubo(0));
        assertEquals(-27, Ejemplo3_5.cubo(-3));
    }
}
