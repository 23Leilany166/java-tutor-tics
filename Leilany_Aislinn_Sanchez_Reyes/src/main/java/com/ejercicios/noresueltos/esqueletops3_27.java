package com.ejercicios.noresueltos;
import java.util.*;

public class esqueletops3_27 {

    // Clase para guardar los resultados — debe ser PUBLIC
    public static class Res {
        public String matF, matM; // matrículas con mejor promedio
        public double maxF, maxM; // mejores promedios
        public double prom1, prom3, prom5, prom7; // promedios por semestre
    }

    public static Res resolver(int N,
                               List<String> MAT,
                               List<Integer> SEX,
                               List<Integer> SEM,
                               List<Double> PRO) {

        // Res r = new Res();
        // r.maxF = -1;
        // r.maxM = -1;

        // double s1=0, s3=0, s5=0, s7=0;
        // int c1=0, c3=0, c5=0, c7=0;

        // for (int i = 0; i < N; i++) {
        //     int sex = SEX.get(i);
        //     int sem = SEM.get(i);
        //     double p = PRO.get(i);

        //     if (sex == 0 && p > r.maxF) {
        //         r.maxF = p;
        //         r.matF = MAT.get(i);
        //     }

        //     if (sex == 1 && p > r.maxM) {
        //         r.maxM = p;
        //         r.matM = MAT.get(i);
        //     }

        //     if (sem == 1) { s1 += p; c1++; }
        //     else if (sem == 3) { s3 += p; c3++; }
        //     else if (sem == 5) { s5 += p; c5++; }
        //     else if (sem == 7) { s7 += p; c7++; }
        // }

        // r.prom1 = (c1 == 0 ? 0 : s1 / c1);
        // r.prom3 = (c3 == 0 ? 0 : s3 / c3);
        // r.prom5 = (c5 == 0 ? 0 : s5 / c5);
        // r.prom7 = (c7 == 0 ? 0 : s7 / c7);

        return null; // temporal
    }

    public static void main(String[] args) {}
}
