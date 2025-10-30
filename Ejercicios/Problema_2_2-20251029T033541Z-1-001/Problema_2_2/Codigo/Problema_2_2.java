/*
EXPRESION
{El programa dado como datos dos valores enteros, determina si los mismos satisfacen una expresión}
*/



/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Problema_2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        
        while (repetir) {
        System.out.println("Ingrese el valor de P:");
        int p = sc.nextInt();

        System.out.println("Ingrese el valor de Q:");
        int q = sc.nextInt();

        double exp = Math.pow(p, 3) + Math.pow(q, 4) - 2 * Math.pow(p, 2);

        if (exp < 680) {
            double result = 3.5 / exp;
            if (result < 680) {
                System.out.println("La expresión se satisface.");
                System.out.println("P = " + p + ", Q = " + q);
            } else {
                System.out.println("La expresión no se satisface.");
            }
        } else {
            System.out.println("La expresión no se satisface.");
        }
        
        System.out.println("¿Desea realizar otro cálculo? (S/N)");
        String respuesta = sc.next();
        repetir = respuesta.equalsIgnoreCase("S");
        }
    }
}
