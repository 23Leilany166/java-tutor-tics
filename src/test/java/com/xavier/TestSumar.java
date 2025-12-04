package com.xavier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSumar {

    @Test
    public void sumaPositivos() {
        Sumar s = new Sumar();
        assertEquals(5, s.sumar(2, 3));
    }
}
