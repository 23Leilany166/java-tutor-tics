import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestTriangulo {

    @Test
    public void testTrianguloEscaleno() {
        // Simular entrada: triángulo 3-4-5 (triángulo rectángulo)
        String input = "3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Triangulo.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // Debe ser Escaleno y área 6.0
        assertTrue(salida.contains("Escaleno"), "El tipo de triángulo debe ser Escaleno");
        assertTrue(salida.contains("6.0") || salida.contains("6.00"), "El área debe ser 6.0");
    }
}
