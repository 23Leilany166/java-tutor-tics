import java.util.Scanner;

public class Ejemplo_1_6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("Ingresa A: ");
        A = sc.nextInt();

        System.out.print("Ingresa B: ");
        B = sc.nextInt();

        System.out.print("Ingresa C: ");
        C = sc.nextInt();

        System.out.print("Ingresa D: ");
        D = sc.nextInt();

        System.out.println("Orden inverso:");
        System.out.println(D + " " + C + " " + B + " " + A);
    }
}
