/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITSOEH.programasjava.Ejemplo_2_6;

/**
 *
 * @author imac28
 */
public class FlujoCondicional {
    public static void main(String[] args) {
        int selector = 3; // El valor del selector (puedes cambiarlo según tus necesidades)

        switch (selector) {
            case 1:
            case 2:
                // Acción 1
                System.out.println("Realizando acción 1");
                break;
            case 3:
            case 4:
            case 5:
                // Acción 2
                System.out.println("Realizando acción 2");
                break;
            default:
                // Acción 3
                System.out.println("Realizando acción 3");
                break;
        }

        // Acción X
        System.out.println("Realizando acción X");
    }
}
