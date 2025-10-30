import org.junit.Test;
import static org.junit.Assert.*;

public class TestProblema2_14 {
    @Test
    public void testCalcularCostoTotal() {
        Problema2_14 p = new Problema2_14();

        // Casos basados en la tabla 2.22
        assertEquals(80.0, p.calcularCostoTotal(3, 35, 4), 0.01);
        assertEquals(96.0, p.calcularCostoTotal(2, 20, 6), 0.01);
        assertEquals(100.0, p.calcularCostoTotal(3, 40, 5), 0.01);
        assertEquals(256.0, p.calcularCostoTotal(4, 16, 8) / 1.10, 0.01); // sin aumento
        assertEquals(281.6, p.calcularCostoTotal(4, 16, 8), 0.01);       // con aumento
    }
}
