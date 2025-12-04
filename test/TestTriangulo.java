import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestTriangulo {
    public static void main(String[] args) {
        // Simular entrada: triángulo 3-4-5 (triángulo rectángulo)
        String input = "3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Triangulo.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // Debe ser Escaleno y área 6.0
        boolean ok1 = salida.contains("Escaleno");
        boolean ok2 = salida.contains("6.0") || salida.contains("6.00");
        
        if (ok1 && ok2) {
            System.out.println("✅ Test Triangulo PASÓ");
        } else {
            System.out.println("❌ Test Triangulo FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}