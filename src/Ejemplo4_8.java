public class Ejemplo4_8 {

    public static double[][] crearMatriz() {
        int filas = (3 - (-11)) + 1;  // 15 filas
        int columnas = (-13 - (-17)) + 1; // 5 columnas

        double[][] matriz = new double[filas][columnas];
        double valor = 1.0;

        // Llenamos la matriz con valores secuenciales
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = valor++;
            }
        }

        return matriz;
    }

    public static int contarElementos(double[][] matriz) {
        int total = 0;
        for (double[] fila : matriz) {
            total += fila.length;
        }
        return total;
    }

    public static void main(String[] args) {
        double[][] matriz = crearMatriz();
        int total = contarElementos(matriz);

        System.out.println("Número total de elementos (NTE): " + total);
        System.out.println("Dimensiones: " + matriz.length + " filas x " + matriz[0].length + " columnas");
        System.out.println("Ejemplo de acceso: MATRIZ1[-5, -16] corresponde a fila " + (11 - (-5)) + " y columna " + (-17 - (-16) + 1));
    }
}
