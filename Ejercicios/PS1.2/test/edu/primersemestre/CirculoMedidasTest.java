package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoMedidasTest {

    @Test
    public void testAreaYcircunferencia() {
        double radio = 3.0;
        double area = Math.PI * Math.pow(radio, 2);
        double circ = 2 * Math.PI * radio;
        assertEquals(28.2743, area, 0.0001);
        assertEquals(18.8495, circ, 0.0001);
    }
}
