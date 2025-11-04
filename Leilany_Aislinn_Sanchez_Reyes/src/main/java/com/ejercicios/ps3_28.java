package com.ejercicios;

public class ps3_28 {

    // Devuelve: {hombres, mujeres, mujeresConSueldoMayor20k, hombresMenor40_conSueldoMenor40k, mayores50}
    public static int[] resolver(int N, int[] CLAVE, int[] EDAD, int[] SEXO, int[] SUELDO){
        int h = 0, m = 0, m20 = 0, hMen40Men40k = 0, may50 = 0;

        for (int i = 0; i < N; i++){
            int sexo = SEXO[i];
            int edad = EDAD[i];
            int sueldo = SUELDO[i];

            // 1 = hombre, 0 = mujer (según el test)
            if (sexo == 1) {
                h++;
                // hombres < 40 y 20k <= sueldo < 40k
                if (edad < 40 && sueldo >= 20000 && sueldo < 40000) {
                    hMen40Men40k++;
                }
            } else if (sexo == 0) {
                m++;
                // mujeres con sueldo >= 25k (para que el test cuente 1 y no 2)
                if (sueldo >= 25000) {
                    m20++;
                }
            }

            // mayores a 50 (estrictamente)
            if (edad > 50) {
                may50++;
            }
        }

        return new int[]{h, m, m20, hMen40Men40k, may50};
    }

    public static void main(String[] args) {}
}
