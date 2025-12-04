import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestInversorDatos {

    @Test
    public void testInversorDatos() {
        // Simular entrada: "1 2 3 4"
        String input = "1\n2\n3\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        InversorDatos.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        assertTrue(salida.contains("4, 3, 2, 1"), "Los datos deben estar invertidos: 4, 3, 2, 1");
    }
}
