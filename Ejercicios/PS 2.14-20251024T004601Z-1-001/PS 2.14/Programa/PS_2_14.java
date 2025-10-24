/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
   import java.util.Scanner;

/**
 *
 * @author imac22
 */
public class PS_2_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();
        
        double resultado = 0;
        
        switch (x % 4) {
            case 0:
                resultado = Math.pow(x, 2);
                break;
            case 1:
                resultado = x / 6.0;
                break;
            case 2:
                resultado = Math.sqrt(x);
                break;
            case 3:
                resultado = Math.pow(x, 3) + 5;
                break;
            default:
                System.out.println("Valor inválido de x.");
                System.exit(0);
        }
        
        System.out.println("El resultado de f(x) es: " + resultado);
        
        sc.close();
    }
}

