package com.ejercicios;

import java.util.*;

public class Problema4_3 {

    // Cuenta votos por candidato 1..11 (12 se considera inválido/nulo)
    public static int[] contarVotos(List<Integer> votos){
        int[] V = new int[12]; // índices 0..11 (usaremos 1..11)
        if (votos == null) return V;
        for (int c : votos) if (c >= 1 && c <= 11) V[c]++;
        return V;
    }

    // Candidato ganador entre 1..11 (empate: índice menor)
    public static int ganador(int[] V){
        int g = 1, mv = V[1];
        for (int i = 2; i <= 11; i++){
            if (V[i] > mv){ mv = V[i]; g = i; }
        }
        return g;
    }

    // Porcentaje del ganador sobre votos válidos (1..11)
    public static double porcentajeGanador(int[] V){
        int tot = 0;
        for (int i = 1; i <= 11; i++) tot += V[i];
        if (tot == 0) return 0.0;
        int g = ganador(V);
        return (V[g] * 100.0) / tot;
    }

    // Esto no afecta el test, lo dejo igual
    public static double cuentaYGanaYPorcentaje(int[] valores, int umbral){
        if (valores == null || valores.length == 0) return 0.0;
        int gana = 0;
        for (int v : valores) if (v >= umbral) gana++;
        return (gana * 100.0) / valores.length;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> votos = new ArrayList<>();
        int v = sc.nextInt();
        while (v != 0){ votos.add(v); v = sc.nextInt(); }
        int[] V = contarVotos(votos);
        System.out.println(ganador(V));
        System.out.printf(Locale.ROOT, "%.2f%n", porcentajeGanador(V));
    }
}
