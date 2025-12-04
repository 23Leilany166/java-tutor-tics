import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestInversorDatos {
    public static void main(String[] args) {
        // 1. Simular entrada: "1 2 3 4"
        String input = "1\n2\n3\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // 2. Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // 3. Ejecutar el main del ejercicio
        InversorDatos.main(new String[]{});

        // 4. Verificar resultado
        String salida = outContent.toString();
        if (salida.contains("4, 3, 2, 1")) {
            System.err.println("✅ Test InversorDatos PASÓ");
        } else {
            System.err.println("❌ Test InversorDatos FALLÓ. Salida: " + salida);
        }
    }
}