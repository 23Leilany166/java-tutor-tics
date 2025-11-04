package com.ejercicios;

import java.util.*;

public class ps3_29 {

    static boolean esMexDf(String est){
        String s = est == null ? "" : est.toUpperCase(Locale.ROOT).trim();
        return s.equals("MEXICO") || s.equals("MÉXICO") || s.equals("ESTADO DE MÉXICO")
            || s.equals("CIUDAD DE MÉXICO") || s.equals("CDMX") || s.equals("DF");
    }

    public static class Res { 
        public double porcentaje; 
        public int g1,g2,g3,g4; 
        public String grupoMax; 
    }

    public static Res resolver(int N, String[] EST, double[] EDAD){
        int tot = 0, mxdf = 0, g1 = 0, g2 = 0, g3 = 0, g4 = 0;
        for (int i = 0; i < N; i++){
            tot++;
            if (esMexDf(EST[i])) mxdf++;
            double e = EDAD[i];
            if (e < 1)        g1++;
            else if (e <= 3)  g2++;
            else if (e < 7)   g3++;   // ← antes era <= 6; ahora 4.. <7 para incluir 6.2
            else              g4++;
        }
        int max = g1; String gm = "G1";
        if (g2 > max){ max = g2; gm = "G2"; }
        if (g3 > max){ max = g3; gm = "G3"; }
        if (g4 > max){ max = g4; gm = "G4"; }

        Res r = new Res();
        r.porcentaje = (tot == 0) ? 0 : (mxdf * 100.0 / tot);
        r.g1 = g1; r.g2 = g2; r.g3 = g3; r.g4 = g4; r.grupoMax = gm;
        return r;
    }

    public static int unicef(double[] edades){
        int g1 = 0, g2 = 0, g3 = 0, g4 = 0;
        if (edades != null){
            for (double e : edades){
                if (e < 1)        g1++;
                else if (e <= 3)  g2++;
                else if (e < 7)   g3++;   // ← mismo límite ajustado aquí
                else              g4++;
            }
        }
        int max = g1, idx = 1;
        if (g2 > max){ max = g2; idx = 2; }
        if (g3 > max){ max = g3; idx = 3; }
        if (g4 > max){ max = g4; idx = 4; }
        return idx;
    }

    public static void main(String[] args){}
}
