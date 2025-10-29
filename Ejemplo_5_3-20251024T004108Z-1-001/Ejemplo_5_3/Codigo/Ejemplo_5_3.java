/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Libros;

import java.util.Scanner;

/**
 *
 * @author zenri
 */
public class Ejemplo_5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ingrese el número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese el país: ");
        String pais = scanner.nextLine();

        Domicilio domicilio = new Domicilio(calle, numero, ciudad, pais);

        System.out.println("Calle: " + domicilio.calle);
        System.out.println("Número: " + domicilio.numero);
        System.out.println("Ciudad: " + domicilio.ciudad);
        System.out.println("País: " + domicilio.pais);
    }
}

class Domicilio {

    String calle;
    int numero;
    String ciudad;
    String pais;

    public Domicilio(String calle, int numero, String ciudad, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
    }
}
