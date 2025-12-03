import java.io.*;

public class TestSumadorGastos {
    public static void main(String[] args) {
        // Entrada: 100, 50, -1
        String input = "100\n50\n-1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SumadorGastos.main(new String[]{});

        // Esperamos que la suma sea 150.00
        // Buscamos "150,00" o "150.00" dependiendo del idioma del sistema
        if (outContent.toString().contains("150")) {
             System.err.println("✅ Test SumadorGastos PASÓ");
        } else {
             System.err.println("❌ Test SumadorGastos FALLÓ. Salida: " + outContent.toString());
        }
    }
}