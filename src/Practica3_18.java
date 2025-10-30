import java.util.Scanner;

public class Practica3_18 {

    /**
     * Eleva base^exp sin usar Math.pow
     * (exp >= 0). Si exp == 0 devuelve 1.
     */
    public static double powNoPow(double base, int exp) {
        if (exp == 0) return 1.0;
        double r = 1.0;
        for (int i = 1; i <= exp; i++) r *= base;
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente (entero >= 0): ");
        int exp = sc.nextInt();
        System.out.println("Resultado: " + powNoPow(base, exp));
        sc.close();
    }
}
