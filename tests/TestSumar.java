import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSumar {
    @Test
    public void sumaPositivos() {
        Sumar s = new Sumar();
        assertEquals(5, s.sumar(2,3));
    }
}
