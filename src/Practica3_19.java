import java.util.Scanner;

public class Practica3_19 {

    /**
     * Calcula base^exponente sin usar Math.pow ni multiplicación directa.
     * Usa sumas repetidas.
     */
    public static int powNoMul(int base, int exp) {
        if (exp == 0) return 1;
        int resultado = base;
        for (int i = 1; i < exp; i++) {
            int suma = 0;
            for (int j = 0; j < base; j++) {
                suma += resultado;
            }
            resultado = suma;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base entera: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente (entero >= 0): ");
        int exp = sc.nextInt();
        System.out.println("Resultado: " + powNoMul(base, exp));
        sc.close();
    }
}
