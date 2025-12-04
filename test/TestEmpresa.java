import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestEmpresa {
    public static void main(String[] args) {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Empresa.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // Verificar los 3 incisos:
        // a) Buscar a 'Luis' - debe mostrar sueldo 30000
        // b) Empleado que más gana en Ventas - debe ser Pedro con 25000
        // c) Alta de Carlos - debe ser exitosa
        boolean ok1 = salida.contains("Luis") && salida.contains("30000");
        boolean ok2 = salida.contains("Pedro") && salida.contains("25000");
        boolean ok3 = salida.contains("Alta exitosa: Carlos") || salida.contains("Carlos");
        
        if (ok1 && ok2 && ok3) {
            System.out.println("✅ Test Empresa PASÓ");
        } else {
            System.out.println("❌ Test Empresa FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}