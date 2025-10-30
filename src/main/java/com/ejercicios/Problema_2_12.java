/*
SUELDO _HORAS_EXTRAS
{El program a calcula lo que hay que pagarle a un trabajador teniendo en cuenta su
sueldo, horas extras y su categoría}
 */

package com.ejercicios;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Problema_2_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("Ingrese el sueldo base del trabajador:");
            double sue = sc.nextDouble();

            System.out.println("Ingrese la categoría del trabajador: ");
            int cate = sc.nextInt();

            System.out.println("Ingrese las horas extras trabajadas:");
            int he = sc.nextInt();

            double phe;

            if (cate == 1) {
                phe = 30;
            } else if (cate == 2) {
                phe = 38;
            } else if (cate == 3) {
                phe = 50;
            } else if (cate == 4) {
                phe = 70;
            } else {
                phe = 0;
            }

            double msue = 5;

            double mSue;

            if (he > 30) {
                mSue = sue + 30 * phe;
            } else {
                mSue = sue + he * phe;
            }

            System.out.println("Monto a pagar al trabajador: " + mSue);
            System.out.println("Costo de la hora: " + phe);

            System.out.println("¿Desea realizar otro cálculo? (S/N)");
            String respuesta = sc.next();
            repetir = respuesta.equalsIgnoreCase("S");
        }
    }
}