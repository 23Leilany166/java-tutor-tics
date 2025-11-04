package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuadradoMagicoTest {

    @Test
    public void testConstanteMagica3x3() {
        int[][] cm = CuadradoMagico.generar(3);
        int constante = 3 * (3 * 3 + 1) / 2;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) sumaFila += cm[i][j];
            assertEquals(constante, sumaFila);
        }
    }

    @Test
    public void testCentroEs5En3x3() {
        int[][] cm = CuadradoMagico.generar(3);
        assertEquals(5, cm[1][1]);
    }

    @Test
    public void testDimensionValida7x7() {
        int[][] cm = CuadradoMagico.generar(7);
        assertTrue(cm.length == 7 && cm[0].length == 7);
    }
}
