package com.ejercicios.noresueltos;
import java.util.*;

public class esqueletops3_29 {

    // Método para saber si un estado pertenece a México / CDMX / Edo. Méx.
    static boolean esMexDf(String est) {

        // String s = (est == null ? "" : est.toUpperCase(Locale.ROOT).trim());

        // return s.equals("MEXICO") ||
        //        s.equals("MÉXICO") ||
        //        s.equals("ESTADO DE MÉXICO") ||
        //        s.equals("CIUDAD DE MÉXICO") ||
        //        s.equals("CDMX") ||
        //        s.equals("DF");

        return false; // temporal
    }

    // Clase para guardar los resultados — debe ser PUBLIC
    public static class Res {
        public double porcentaje;  // porcentaje de niños de México/CDMX/EdoMex
        public int g1, g2, g3, g4; // grupos de edad
        public String grupoMax;    // G1, G2, G3 o G4
    }

    public static Res resolver(int N, String[] EST, double[] EDAD) {

        // int tot = 0;
        // int mxdf = 0;
        // int g1 = 0, g2 = 0, g3 = 0, g4 = 0;
        
        // for (int i = 0; i < N; i++) {

            // tot++;

            // if (esMexDf(EST[i])) mxdf++;

            // double e = EDAD[i];

            // if (e < 1) g1++;
            // else if (e <= 3) g2++;
            // else if (e < 7) g3++;
            // else g4++;
        // }

        // int max = g1;
        // String gm = "G1";
        
        // if (g2 > max) { max = g2; gm = "G2"; }
        // if (g3 > max) { max = g3; gm = "G3"; }
        // if (g4 > max) { max = g4; gm = "G4"; }

        // Res r = new Res();
        // r.porcentaje = (tot == 0 ? 0 : (mxdf * 100.0 / tot));
        // r.g1 = g1;
        // r.g2 = g2;
        // r.g3 = g3;
        // r.g4 = g4;
        // r.grupoMax = gm;

        return null; // temporal
    }

    public static int unicef(double[] edades) {

        // int g1 = 0, g2 = 0, g3 = 0, g4 = 0;

        // if (edades != null) {
        //     for (double e : edades) {
        //         if (e < 1) g1++;
        //         else if (e <= 3) g2++;
        //         else if (e < 7) g3++;
        //         else g4++;
        //     }
        // }

        // int max = g1;
        // int idx = 1;
        // if (g2 > max) { max = g2; idx = 2; }
        // if (g3 > max) { max = g3; idx = 3; }
        // if (g4 > max) { max = g4; idx = 4; }

        return 0; // temporal
    }

    public static void main(String[] args) {}
}
