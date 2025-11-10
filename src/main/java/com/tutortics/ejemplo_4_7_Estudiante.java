package com.tutortics;


public class ejemplo_4_7_Estudiante {
    private int[] vector;
    private int n;

    public ejemplo_4_7_Estudiante(int tamano) {
        if (tamano < 1 || tamano > 50) {
            throw new IllegalArgumentException("El tamaño debe estar entre 1 y 50");
        }
        this.n = tamano;
        this.vector = new int[tamano];
    }

    /**
     * Inserta un valor en el arreglo.
     * @param valor El valor a insertar
     * @param posicion La posición donde insertar (base 0)
     */
    public void insertarValor(int valor, int posicion) {
        // TODO: Implementar la inserción del valor en el arreglo
        // Validar que la posición sea válida (entre 0 y n-1)
        // Insertar el valor en la posición indicada
    }

    /**
     * Implementa el algoritmo de búsqueda binaria.
     * @param x El valor a buscar
     * @return true si el elemento fue encontrado, false en caso contrario
     */
    public boolean busquedaBinaria(int x) {
        // TODO: Implementar el algoritmo de búsqueda binaria
        // 1. Inicializar las variables izq, der, cen y ban
        // 2. Mientras izq <= der y ban sea verdadero:
        //    - Calcular el centro
        //    - Si x es igual al elemento central, establecer ban a falso
        //    - Si x es mayor, actualizar izq
        //    - Si x es menor, actualizar der
        // 3. Retornar el resultado (!ban)
        return false;  // Este return debe ser modificado
    }

    public static void main(String[] args) {
        // TODO: Implementar el código de prueba
        // 1. Crear una instancia de la clase
        // 2. Insertar valores ordenados en el arreglo
        // 3. Probar la búsqueda con diferentes valores
        // 4. Mostrar los resultados
    }
}