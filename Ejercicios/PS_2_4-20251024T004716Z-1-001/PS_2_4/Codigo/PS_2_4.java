

import java.util.Scanner;

/**
 *
 * @author Chema
 */
public class PS_2_4 {
     public static void main(String[] args) {
        // Leer el sueldo del trabajador
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador: $");
        double sueldo = scanner.nextDouble();
        
        // Calcular el aumento y el nuevo sueldo
        double aumento;
        if (sueldo < 1000) {
            aumento = sueldo * 0.15;
        } else {
            aumento = sueldo * 0.12;
        }
        double nuevoSueldo = sueldo + aumento;
        
        // Imprimir el sueldo con el aumento incorporado
        System.out.println("El sueldo con el aumento incorporado es: $" + nuevoSueldo);
    }
}
