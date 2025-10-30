import org.junit.Test;
import static org.junit.Assert.*;

public class TestPractica3_44 {

    @Test
    public void testCasoValido() {
        // No verifica impresión, solo que no ocurra error con N positivo
        Practica3_44.ejecutar(5);
    }

    @Test
    public void testCasoInvalido() {
        Practica3_44.ejecutar(-2); // Debe mostrar mensaje de error
    }
}
