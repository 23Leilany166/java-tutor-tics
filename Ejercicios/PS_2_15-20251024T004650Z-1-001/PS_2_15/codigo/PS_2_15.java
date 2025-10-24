/*
operaciones aritméticas elementales, según la clave ingresada.
 */
package ps_2_15;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class PS_2_15 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer operando: ");
        double oper1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo operando: ");
        double oper2 = scanner.nextDouble();

        System.out.print("Ingrese la clave de la operación (+, -, *, /): ");
        char clave = scanner.next().charAt(0);

        double resultado = 0;
    switch (clave) {
            case '+':
                resultado = oper1 + oper2;
                break;
            case '-':
                resultado = oper1 - oper2;
                break;
            case '*':
                resultado = oper1 * oper2;
                break;
            case '/':
                resultado = oper1 / oper2;
                break;
            default:
                System.out.println("Clave de operación inválida.");
                return;
        }

        System.out.println("Clave ingresada: " + clave);
        System.out.println("Resultado: " + resultado);
    }
}
