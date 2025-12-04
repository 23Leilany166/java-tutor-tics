
// Archivo: ConversorUnidades.java
import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        // Constantes de conversión
        final double METROS_CUADRADOS_POR_ACRE = 4047.0;
        final double METROS_CUADRADOS_POR_HECTAREA = 10000.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la extensión del campo en acres: ");
        double acres = scanner.nextDouble();

        // Convertir acres a hectáreas
        double metrosCuadrados = acres * METROS_CUADRADOS_POR_ACRE;
        double hectareas = metrosCuadrados / METROS_CUADRADOS_POR_HECTAREA;

        System.out.printf("%.2f acres equivalen a %.4f hectáreas.\n", acres, hectareas);

        scanner.close();
    }
}