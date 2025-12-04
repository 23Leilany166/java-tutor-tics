import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestCalculadoraAumento {
    public static void main(String[] args) {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        CalculadoraAumento.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // Verificar que contenga los valores esperados
        // Sueldo 840.50 -> 966.57 (15% aumento)
        // Sueldo 1200.00 -> 1344.00 (12% aumento)
        // Sueldo 1000.00 -> 1120.00 (12% aumento)
        boolean ok1 = salida.contains("966.57") || salida.contains("966.58");
        boolean ok2 = salida.contains("1344.00");
        boolean ok3 = salida.contains("1120.00");
        
        if (ok1 && ok2 && ok3) {
            System.out.println("✅ Test CalculadoraAumento PASÓ");
        } else {
            System.out.println("❌ Test CalculadoraAumento FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}