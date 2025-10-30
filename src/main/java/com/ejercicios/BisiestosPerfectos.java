package com.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class BisiestosPerfectos {

    // Función para verificar si un año es bisiesto
    public static boolean esBisiesto(int anio) { //
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // Función para verificar si un número es perfecto
    public static boolean esPerfecto(int numero) { //
        if (numero <= 1)
            return false;
        int sumaDivisores = 1; // 1 siempre es divisor
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }

    public static void main(String[] args) {
        List bisiestosPerfectos = new ArrayList<>(); // Usar ArrayList
        int limiteSuperior = 2020;

        for (int anio = 1; anio <= limiteSuperior; anio++) {
            if (esBisiesto(anio) && esPerfecto(anio)) { // Verificar ambas condiciones
                bisiestosPerfectos.add(anio); // Agregar al ArrayList
            }
        }

        System.out.println("Años bisiestos y perfectos entre 1 y " + limiteSuperior + ":");
        if (bisiestosPerfectos.isEmpty()) {
            System.out.println("No se encontraron años que cumplan ambas condiciones.");
        } else {
            System.out.println(bisiestosPerfectos); // Imprimir lista
        }
    }
}