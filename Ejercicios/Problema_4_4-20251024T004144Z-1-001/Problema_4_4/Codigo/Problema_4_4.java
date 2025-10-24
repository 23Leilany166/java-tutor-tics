/*
 El programa almacena en un arreglo unidimensional los primeros 30 números primos
 */
package problema_4_4;

/**
 *
 * @author imac27
 */
public class Problema_4_4 {
    public static void main(String[] args) {
        int[] PRIMO = new int[30];
        PRIMO[0] = 2;
        int K = 2;
        int MUM = 3;

        while (K <= 30) {
            int DIVI = 3;
            boolean BAND = true;

            while (DIVI < MUM / 2 && BAND == true) {
                if (MUM % DIVI == 0) {
                    BAND = false;
                }
                DIVI += 2;
            }
            if (BAND == true) {
                PRIMO[K - 1] = MUM;
                K++;
            }

            MUM += 2;
        }

        System.out.println("Los primeros 30 números primos son:");
        for (int i = 0; i < 30; i++) {
            System.out.println(PRIMO[i]);
        }
    }
    
}
