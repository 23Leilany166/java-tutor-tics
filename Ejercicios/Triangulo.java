// Archivo: Triangulo.java
import java.util.Scanner;

public class Triangulo {

    private double a, b, c; // Lados

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Verifica si los lados pueden formar un triángulo.
     * La suma de dos lados debe ser mayor que el tercero.
     */
    public boolean esValido() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /**
     * Determina el tipo de triángulo (si es válido).
     */
    public String getTipo() {
        if (!esValido()) {
            return "Inválido (no es un triángulo)";
        }
        
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    /**
     * Calcula el área usando la Fórmula de Herón (si es válido).
     */
    public double getArea() {
        if (!esValido()) {
            return 0.0;
        }
        
        // 's' es el semiperímetro
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las longitudes de los 3 lados:");
        double l1 = scanner.nextDouble();
        double l2 = scanner.nextDouble();
        double l3 = scanner.nextDouble();

        Triangulo t = new Triangulo(l1, l2, l3);

        System.out.println("Tipo: " + t.getTipo());
        if (t.esValido()) {
            System.out.printf("Área: %.4f\n", t.getArea());
        }
        
        scanner.close();
    }
}