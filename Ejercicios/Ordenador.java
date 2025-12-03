// Archivo: Ordenador.java
import java.util.Arrays; // Para imprimir el arreglo fácilmente

public class Ordenador {

    /**
     * Ordena un arreglo de enteros 'in-place' usando Selección Directa.
     */
    public static void ordenarPorSeleccion(int[] vector) {
        if (vector == null) return;

        // Bucle externo: recorre la posición 'i' donde irá el mínimo
        for (int i = 0; i < vector.length - 1; i++) {
            
            // Encontrar el índice del elemento más pequeño (minIndex)
            // en la porción no ordenada (de i hasta el final)
            int minIndex = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[minIndex]) {
                    minIndex = j; // Encontramos un nuevo mínimo
                }
            }
            
            // Intercambiar el elemento en 'i' con el mínimo encontrado en 'minIndex'
            int temp = vector[i];
            vector[i] = vector[minIndex];
            vector[minIndex] = temp;
        }
    }

    // Método main para probar el ordenador
    public static void main(String[] args) {
        // Datos del ejemplo del libro (pág. 249)
        int[] data = {32, 84, 25, 33, 61, 44, 29, 52};
        
        System.out.println("Arreglo original: " + Arrays.toString(data));
        
        Ordenador.ordenarPorSeleccion(data);
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(data));
    }
}