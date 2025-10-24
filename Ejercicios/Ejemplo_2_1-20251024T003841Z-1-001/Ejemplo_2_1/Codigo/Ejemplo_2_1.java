/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Libros;

import javax.swing.JOptionPane;

/**
 *
 * @author zenri
 */
public class Ejemplo_2_1 {

    public static void main(String[] args) {
        System.out.println("Ejemplo 2.1 ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));
        if (numero > 8) {
            System.out.println("Aprobado ");
        } else {
            System.out.println("Reprobado ");
        }

    }

}
