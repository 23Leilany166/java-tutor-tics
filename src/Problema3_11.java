public class Problema3_11 {
    private int can1, can2, can3, can4, sumv;
    private double por1, por2, por3, por4;

    public void contarVotos(int[] votos) {
        can1 = can2 = can3 = can4 = 0;
        for (int voto : votos) {
            if (voto == 0) break; // fin de datos
            switch (voto) {
                case 1: can1++; break;
                case 2: can2++; break;
                case 3: can3++; break;
                case 4: can4++; break;
            }
        }
        sumv = can1 + can2 + can3 + can4;
        if (sumv > 0) {
            por1 = (can1 / (double) sumv) * 100;
            por2 = (can2 / (double) sumv) * 100;
            por3 = (can3 / (double) sumv) * 100;
            por4 = (can4 / (double) sumv) * 100;
        }
    }

    public int getCan1() { return can1; }
    public int getCan2() { return can2; }
    public int getCan3() { return can3; }
    public int getCan4() { return can4; }
    public int getSumv() { return sumv; }
    public double getPor1() { return por1; }
    public double getPor2() { return por2; }
    public double getPor3() { return por3; }
    public double getPor4() { return por4; }
}
