// Archivo: InversorDatos.java
import java.util.Scanner;

public class InversorDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 4 enteros, separados por espacio:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        // Imprime en orden inverso
        // Ejemplo de entrada: 7 28 150 35
        // Salida esperada: 35, 150, 28, 7
        System.out.println("Datos en orden inverso:");
        System.out.printf("%d, %d, %d, %d\n", d, c, b, a);
        
        scanner.close();
    }
}