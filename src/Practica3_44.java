public class Practica3_44 {

    /**
     * Simula el diagrama de flujo 6.3 para un valor de N dado.
     * Imprime los valores de P1, P2 e I durante la ejecución.
     */
    public static void ejecutar(int N) {
        if (N <= 0) {
            System.out.println("Error: N debe ser mayor que 0.");
            return;
        }

        int I = 0;
        while (I <= N) {
            int P1 = N - 2 * I;
            int P2 = I;

            while ((P2 + I) <= N && P1 >= P2) {
                System.out.println("P1=" + P1 + "  P2=" + P2 + "  I=" + I);
                P1--;
                P2++;
            }

            I++;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("=== Ejecución para N = " + N + " ===");
        ejecutar(N);
    }
}
