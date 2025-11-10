package com.tutortics;

/**
 * Ejercicio PS 4.11 - Búsqueda de Ciudad en Arreglo
 * 
 * INSTRUCCIONES PARA EL ESTUDIANTE:
 * Complete el método marcado con // TODO
 * 
 * El objetivo es buscar una ciudad en un arreglo no ordenado usando búsqueda lineal.
 * La búsqueda debe ignorar mayúsculas y minúsculas.
 */
public class problema_ps_4_11_Estudiante {

    /**
     * TODO: Implementa la búsqueda lineal de una ciudad en el arreglo.
     * 
     * PISTA:
     * - Verifica primero que ciudades y ciu no sean null
     * - Recorre el arreglo ciudades con un for-each o un for tradicional
     * - Para cada ciudad en el arreglo, compara con ciu usando equalsIgnoreCase()
     * - Si encuentras una coincidencia, retorna true inmediatamente
     * - Si terminas de recorrer el arreglo sin encontrar coincidencia, retorna false
     * 
     * EJEMPLO:
     * for (String ciudadEnArreglo : ciudades) {
     *     if (ciudadEnArreglo.equalsIgnoreCase(ciu)) {
     *         return true;
     *     }
     * }
     * 
     * @param ciudades El arreglo de nombres de ciudades
     * @param ciu La ciudad a buscar
     * @return true si la ciudad se encuentra, false en caso contrario
     */
    public static boolean buscarCiudad(String[] ciudades, String ciu) {
        // TODO: Completa este método
        // 1. Verifica que ciudades != null y ciu != null
        //    Si alguno es null, retorna false
        
        // 2. Recorre el arreglo ciudades:
        //    for (String ciudadEnArreglo : ciudades) {
        //        // Compara ciudadEnArreglo con ciu ignorando mayúsculas
        //        if (ciudadEnArreglo.equalsIgnoreCase(ciu)) {
        //            return true; // ¡Encontrado!
        //        }
        //    }
        
        // 3. Si llegaste aquí, no se encontró la ciudad
        //    return false;
        
        return false; // Reemplaza esta línea con tu implementación
    }

    public static void main(String[] args) {
        // Prueba tu implementación con estos casos:
        System.out.println("=== Pruebas de Búsqueda de Ciudad ===\n");
        
        String[] ciudades = {"Madrid", "Bogotá", "Tokio", "Lima", "Buenos Aires"};
        
        // Caso 1: Ciudad que existe
        System.out.println("Caso 1: Buscar 'Tokio'");
        boolean resultado1 = buscarCiudad(ciudades, "Tokio");
        System.out.println("Resultado: " + (resultado1 ? "Encontrada" : "No encontrada"));
        System.out.println("Esperado: Encontrada\n");
        
        // Caso 2: Ciudad que no existe
        System.out.println("Caso 2: Buscar 'París'");
        boolean resultado2 = buscarCiudad(ciudades, "París");
        System.out.println("Resultado: " + (resultado2 ? "Encontrada" : "No encontrada"));
        System.out.println("Esperado: No encontrada\n");
        
        // Caso 3: Búsqueda ignorando mayúsculas
        System.out.println("Caso 3: Buscar 'bogotá' (minúsculas)");
        boolean resultado3 = buscarCiudad(ciudades, "bogotá");
        System.out.println("Resultado: " + (resultado3 ? "Encontrada" : "No encontrada"));
        System.out.println("Esperado: Encontrada\n");
        
        // Caso 4: Búsqueda con mayúsculas
        System.out.println("Caso 4: Buscar 'LIMA' (mayúsculas)");
        boolean resultado4 = buscarCiudad(ciudades, "LIMA");
        System.out.println("Resultado: " + (resultado4 ? "Encontrada" : "No encontrada"));
        System.out.println("Esperado: Encontrada\n");
    }
}
