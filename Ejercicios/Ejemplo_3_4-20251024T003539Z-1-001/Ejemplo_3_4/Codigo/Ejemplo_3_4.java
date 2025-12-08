
import java.util.Scanner;

public class Ejemplo_3_4 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        double GASTO;
        double SUMGAS = 0;

        // Primera lectura (antes del ciclo)
        System.out.print("Ingresa un gasto (-1 para terminar): ");
        GASTO = sc.nextDouble();

        // Ciclo mientras el gasto sea distinto de -1
        while (GASTO != -1) {
            SUMGAS += GASTO;

            // Nueva lectura antes de terminar el ciclo
            System.out.print("Ingresa otro gasto (-1 para terminar): ");
            GASTO = sc.nextDouble();
        }

        System.out.println("La suma total de los gastos es: " + SUMGAS);
    }
}
