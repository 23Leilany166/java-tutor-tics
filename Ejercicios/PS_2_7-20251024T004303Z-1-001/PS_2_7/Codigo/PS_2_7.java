import java.util.Scanner;

public class PS_2_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double SUELDO, nuevoSueldo;

        System.out.print("Ingrese el sueldo del trabajador: ");
        SUELDO = leer.nextDouble();

        if (SUELDO < 10000) {
            nuevoSueldo = SUELDO * 1.15;  // Aumento del 15%
        } else if (SUELDO >= 10000 && SUELDO < 15000) {
            nuevoSueldo = SUELDO * 1.11;  // Aumento del 11%
        } else {
            nuevoSueldo = SUELDO * 1.08;  // Aumento del 8%
        }

        System.out.println("El nuevo sueldo del trabajador es: $" + nuevoSueldo);
    }
}
