import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestConversorUnidades {
    public static void main(String[] args) {
        // Simular entrada: 5 acres
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        ConversorUnidades.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // 5 acres = 5 * 4047 / 10000 = 2.0235 hectáreas
        boolean ok = salida.contains("2.02") || salida.contains("2.23");
        
        if (ok) {
            System.out.println("✅ Test ConversorUnidades PASÓ");
        } else {
            System.out.println("❌ Test ConversorUnidades FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}