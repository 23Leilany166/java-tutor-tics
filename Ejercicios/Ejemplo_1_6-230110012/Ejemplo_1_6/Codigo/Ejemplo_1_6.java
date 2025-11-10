import java.util.Scanner;

public class Ejemplo_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Lectura de 4 números enteros ---");
        
        System.out.print("Ingrese el valor A: ");
        int A = sc.nextInt();
        
        System.out.print("Ingrese el valor B: ");
        int B = sc.nextInt();
        
        System.out.print("Ingrese el valor C: ");
        int C = sc.nextInt();
        
        System.out.print("Ingrese el valor D: ");
        int D = sc.nextInt();

        System.out.println("\n--- Números en orden inverso ---");
        System.out.println("Valor D: " + D);
        System.out.println("Valor C: " + C);
        System.out.println("Valor B: " + B);
        System.out.println("Valor A: " + A);
    }
}