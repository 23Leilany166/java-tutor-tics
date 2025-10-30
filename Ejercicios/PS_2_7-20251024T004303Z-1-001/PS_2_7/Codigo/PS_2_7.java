
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class PS_2_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = sc.nextDouble();
        double nuevoSueldo;

        if (sueldo < 10000) {
            nuevoSueldo = sueldo * 1.15; // Aumento del 15%
        } else if (sueldo < 15000) {
            nuevoSueldo = sueldo * 1.11; // Aumento del 11%
        } else {
            nuevoSueldo = sueldo * 1.08; // Aumento del 8%
        }

        System.out.println("El nuevo sueldo del trabajador es: $" + nuevoSueldo);
    }
}
