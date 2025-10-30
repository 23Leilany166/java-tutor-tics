
import java.util.Scanner;

/**
 *
 * @author imac22
 */
public class PS_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();

        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();

        System.out.println("Ingrese el valor de C:");
        int C = scanner.nextInt();

        System.out.println("Ingrese el valor de D:");
        int D = scanner.nextInt();

        if (D == 0) {
            System.out.println("Error: D no puede ser igual a 0. No se puede calcular la expresión.");
        } else {
            int resultado1 = (A - C) * (A - C) / D;
            int resultado2 = (A - B) * (A - B) * (A - B) / D;

            System.out.println("El resultado de la expresión (A - C)^2 / D es: " + resultado1);
            System.out.println("El resultado de la expresión (A - B)^3 / D es: " + resultado2);
        }
    }
}


