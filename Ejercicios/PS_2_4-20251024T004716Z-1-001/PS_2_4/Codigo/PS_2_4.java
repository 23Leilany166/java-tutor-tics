
import java.util.Scanner;

public class PS_2_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double SUE, aumento, nuevoSueldo;

        System.out.print("Ingrese el sueldo del trabajador: ");
        SUE = leer.nextDouble();

        if (SUE < 1000) {
            aumento = SUE * 0.15;
        } else {
            aumento = SUE * 0.12;
        }

        nuevoSueldo = SUE + aumento;

        System.out.println("El sueldo con aumento es: $" + nuevoSueldo);
    }
}
