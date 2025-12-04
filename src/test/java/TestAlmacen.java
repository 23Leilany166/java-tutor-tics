import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestAlmacen {

    @Test
    public void testAlmacenOperations() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Almacen.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // Al final debe quedar [30, 10] después de eliminar el primer 10 y el 20
        assertTrue(salida.contains("[30, 10]"), "El almacén debe contener [30, 10] después de las operaciones");
    }
}
