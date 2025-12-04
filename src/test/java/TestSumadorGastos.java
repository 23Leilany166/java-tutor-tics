import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestSumadorGastos {

    @Test
    public void testSumadorGastos() {
        // Entrada: 100, 50, -1
        String input = "100\n50\n-1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        SumadorGastos.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Esperamos que la suma sea 150.00
        // Buscamos "150,00" o "150.00" dependiendo del idioma del sistema
        String salida = outContent.toString();
        assertTrue(salida.contains("150"), "La suma debe ser 150");
    }
}
