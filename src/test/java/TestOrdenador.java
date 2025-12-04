import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestOrdenador {

    @Test
    public void testOrdenador() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Ordenador.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // El arreglo {32, 84, 25, 33, 61, 44, 29, 52}
        // Ordenado debe ser: [25, 29, 32, 33, 44, 52, 61, 84]
        assertTrue(salida.contains("[25, 29, 32, 33, 44, 52, 61, 84]"), "El arreglo debe estar ordenado correctamente");
    }
}
