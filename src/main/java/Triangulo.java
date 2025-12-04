
// Archivo: Triangulo.java
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las longitudes de los 3 lados:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Verificar si los lados pueden formar un triángulo
        // La suma de dos lados debe ser mayor que el tercero
        boolean esValido = (a + b > c) && (a + c > b) && (b + c > a);

        // Determinar el tipo de triángulo
        String tipo;
        if (!esValido) {
            tipo = "Inválido (no es un triángulo)";
        } else if (a == b && b == c) {
            tipo = "Equilátero";
        } else if (a == b || b == c || a == c) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }

        System.out.println("Tipo: " + tipo);

        // Calcular el área usando la Fórmula de Herón (si es válido)
        if (esValido) {
            // 's' es el semiperímetro
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Área: %.4f\n", area);
        }

        scanner.close();
    }
}