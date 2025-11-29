package com.ejercicios.noresueltos;
import java.util.*;

public class esqueletops4_21 {

    // Clase para almacenar todos los resultados del problema
    public static class Res {
        public double max;       // temperatura máxima registrada en el año
        public int diaMax;       // día en que ocurrió la máxima
        public int mesMax;       // mes en que ocurrió la máxima
        public double[] promMes; // promedio de temperatura por mes (1..12)
        public int mesPromMax;   // mes con mayor promedio
        public double valPromMax; // valor del mayor promedio
    }

    public static Res resolver(double[][] TEMP, boolean bisiesto) {

        // int[] DIAS = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        // if (bisiesto) {
        //     DIAS[2] = 29;
        // }

        // Res r = new Res();
        // r.max = -1e18;
        // r.promMes = new double[13]; // usamos índices 1..12

        // for (int m = 1; m <= 12; m++) {
        //     double s = 0; // suma para promedio del mes
        //     for (int d = 1; d <= DIAS[m]; d++) {
        //         double t = TEMP[m][d];

        //         // Actualizar máxima del año
        //         if (t > r.max) {
        //             r.max = t;
        //             r.diaMax = d;
        //             r.mesMax = m;
        //         }

        //         s += t;
        //     }
        //     r.promMes[m] = s / DIAS[m];
        // }

        // r.mesPromMax = 1;
        // r.valPromMax = r.promMes[1];
        // for (int m = 2; m <= 12; m++) {
        //     if (r.promMes[m] > r.valPromMax) {
        //         r.mesPromMax = m;
        //         r.valPromMax = r.promMes[m];
        //     }
        // }

        return null; // temporal
    }

    public static void main(String[] args) {
        // Aquí pueden agregar pruebas si quieren
    }
}
