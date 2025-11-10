package com.tutortics;

/**
 * Problema PS 3.5 - Suma de Serie Armónica (Versión Estudiante)
 * 
 * INSTRUCCIONES:
 * Completa el método calcularSerie() para calcular la suma de la serie:
 * 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
 * 
 * PASOS A SEGUIR:
 * 1. Inicializa la variable SUMA en 0.0
 * 2. Crea un ciclo for que vaya desde I=1 hasta I=N (inclusive)
 * 3. En cada iteración del ciclo:
 *    - Calcula el término 1.0/I
 *    - Suma ese término a SUMA
 * 4. Después del ciclo, retorna el valor de SUMA
 * 
 * IMPORTANTE:
 * - Usa 1.0/I (no 1/I) para obtener división con decimales
 * - El tipo de retorno debe ser double para precisión
 * - Considera los casos extremos (N=0 o negativo)
 * 
 * EJEMPLO:
 * Si N = 4:
 * - Iteración 1: SUMA = 0.0 + 1.0/1 = 1.0000
 * - Iteración 2: SUMA = 1.0000 + 1.0/2 = 1.5000
 * - Iteración 3: SUMA = 1.5000 + 1.0/3 = 1.8333
 * - Iteración 4: SUMA = 1.8333 + 1.0/4 = 2.0833
 * Resultado: 2.0833
 */
public class problema_ps_3_5_Estudiante {
    
    /**
     * TODO: Completa este método para calcular la suma de la serie armónica
     * 
     * @param n Número de términos de la serie
     * @return Suma de la serie: 1 + 1/2 + 1/3 + ... + 1/N
     */
    public static double calcularSerie(int n) {
        // TODO: Inicializa la variable SUMA en 0.0
        
        
        // TODO: Crea un ciclo for desde I=1 hasta I=N
        
            // TODO: Suma 1.0/I a SUMA
            
        
        
        // TODO: Retorna el valor de SUMA
        return 0.0; // Reemplaza este valor
    }
    
    /**
     * Método principal para probar tu implementación
     * Descomenta las líneas después de completar el método calcularSerie()
     */
    public static void main(String[] args) {
        System.out.println("=== Prueba de Serie Armónica ===\n");
        
        // TODO: Descomenta estas líneas cuando completes el método
        /*
        // Prueba 1: N = 4
        int n1 = 4;
        double resultado1 = calcularSerie(n1);
        System.out.printf("N = %d: Suma = %.4f (Esperado: 2.0833)%n%n", n1, resultado1);
        
        // Prueba 2: N = 1
        int n2 = 1;
        double resultado2 = calcularSerie(n2);
        System.out.printf("N = %d: Suma = %.4f (Esperado: 1.0000)%n%n", n2, resultado2);
        
        // Prueba 3: N = 10
        int n3 = 10;
        double resultado3 = calcularSerie(n3);
        System.out.printf("N = %d: Suma = %.4f (Esperado: 2.9290)%n%n", n3, resultado3);
        */
        
        System.out.println("Completa el método calcularSerie() y descomenta las pruebas.");
    }
    
    /*
     * PREGUNTAS DE REFLEXIÓN:
     * 
     * 1. ¿Por qué es importante usar 1.0/I en lugar de 1/I?
     *    Respuesta: 
     * 
     * 2. ¿Qué sucede si N es 0?
     *    Respuesta: 
     * 
     * 3. ¿Qué sucede si N es negativo?
     *    Respuesta: 
     * 
     * 4. ¿Por qué el método retorna double y no int?
     *    Respuesta: 
     * 
     * 5. ¿Cómo crece la suma cuando N aumenta? (linealmente, cuadráticamente, logarítmicamente)
     *    Respuesta: 
     */
}
