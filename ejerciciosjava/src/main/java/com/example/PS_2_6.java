package com.example;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class PS_2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia del viaje de ida (en km): ");
        int distanciaIda = scanner.nextInt();
        
        System.out.print("Ingrese el tiempo de estancia (en días): ");
        int tiempoEstancia = scanner.nextInt();
        
        int distanciaVuelta = distanciaIda; // La distancia de vuelta es igual a la distancia de ida
        
        int distanciaTotal = distanciaIda + distanciaVuelta;
        double precioPorKm = 0.23;
        
        double precioBillete = distanciaTotal * precioPorKm;
        
        if (tiempoEstancia > 7 && distanciaTotal > 800) {
            // Aplicar descuento del 30% si el tiempo de estancia es superior a 7 días y la distancia total es superior a 800 km
            double descuento = precioBillete * 0.3;
            precioBillete -= descuento;
        }
        
        System.out.println("El precio del billete de ida y vuelta es: $" + precioBillete);
    }
}
