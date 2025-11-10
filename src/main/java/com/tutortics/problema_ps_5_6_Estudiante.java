package com.tutortics;

/**
 * Ejercicio PS 5.6 - Registros de Profesores
 * 
 * INSTRUCCIONES PARA EL ESTUDIANTE:
 * Complete los métodos marcados con // TODO
 * 
 * Este problema trabaja con arreglos de registros (objetos Profesor)
 * y calcula diversas estadísticas sobre ellos.
 */
public class problema_ps_5_6_Estudiante {

    /**
     * TODO: Calcula la edad promedio del grupo de profesores.
     * 
     * PISTA:
     * - Verifica que el arreglo no esté vacío
     * - Suma todas las edades usando un ciclo for-each
     * - Divide la suma entre la cantidad de profesores
     * 
     * @param personal Arreglo de profesores
     * @return El promedio de edades
     */
    public static double calcularEdadPromedio(Profesor[] personal) {
        // TODO: Implementa este método
        // 1. Si personal.length == 0, retorna 0
        // 2. Declara double sumaEdades = 0
        // 3. for (Profesor p : personal) {
        //      sumaEdades += p.edad;
        //    }
        // 4. return sumaEdades / personal.length;
        
        return 0.0; // Reemplaza con tu implementación
    }

    /**
     * TODO: Encuentra el nombre del profesor más joven.
     * 
     * PISTA:
     * - Inicia con el primer profesor como el más joven
     * - Recorre desde i=1 comparando edades
     * - Si encuentras uno menor, actualiza el más joven
     * 
     * @param personal Arreglo de profesores
     * @return Nombre del profesor más joven
     */
    public static String encontrarProfesorMasJoven(Profesor[] personal) {
        // TODO: Implementa este método
        // 1. Si personal.length == 0, retorna "N/A"
        // 2. Profesor masJoven = personal[0];
        // 3. for (int i = 1; i < personal.length; i++) {
        //      if (personal[i].edad < masJoven.edad) {
        //          masJoven = personal[i];
        //      }
        //    }
        // 4. return masJoven.nombre;
        
        return ""; // Reemplaza con tu implementación
    }

    /**
     * TODO: Encuentra el nombre del profesor de más edad.
     * 
     * PISTA:
     * - Similar al método anterior pero buscando el máximo
     * - Usa el operador > en lugar de <
     * 
     * @param personal Arreglo de profesores
     * @return Nombre del profesor de más edad
     */
    public static String encontrarProfesorMasViejo(Profesor[] personal) {
        // TODO: Implementa este método
        // Similar a encontrarProfesorMasJoven pero buscando la edad máxima
        
        return ""; // Reemplaza con tu implementación
    }

    /**
     * TODO: Cuenta profesoras con edad mayor al promedio.
     * 
     * PISTA:
     * - Recorre el arreglo con for-each
     * - Verifica: p.sexo == 'F' && p.edad > promedio
     * - Incrementa contador si se cumple
     * 
     * @param personal Arreglo de profesores
     * @param promedio La edad promedio del grupo
     * @return Cantidad de profesoras mayores al promedio
     */
    public static int contarProfesorasMayoresAlPromedio(Profesor[] personal, double promedio) {
        // TODO: Implementa este método
        // 1. int contador = 0;
        // 2. for (Profesor p : personal) {
        //      if (p.sexo == 'F' && p.edad > promedio) {
        //          contador++;
        //      }
        //    }
        // 3. return contador;
        
        return 0; // Reemplaza con tu implementación
    }

    /**
     * TODO: Cuenta profesores con edad menor al promedio.
     * 
     * PISTA:
     * - Similar al método anterior
     * - Verifica: p.sexo == 'M' && p.edad < promedio
     * 
     * @param personal Arreglo de profesores
     * @param promedio La edad promedio del grupo
     * @return Cantidad de profesores menores al promedio
     */
    public static int contarProfesoresMenoresAlPromedio(Profesor[] personal, double promedio) {
        // TODO: Implementa este método
        // Similar a contarProfesorasMayoresAlPromedio pero con sexo 'M' y edad < promedio
        
        return 0; // Reemplaza con tu implementación
    }

    public static void main(String[] args) {
        // Prueba tu implementación con estos casos:
        System.out.println("=== Pruebas del Sistema de Profesores ===\n");
        
        Profesor[] personal = {
            new Profesor("Ana", 45, 'F'),
            new Profesor("Luis", 30, 'M'),
            new Profesor("Elena", 50, 'F'),
            new Profesor("Carlos", 25, 'M')
        };
        
        System.out.println("Datos del personal:");
        for (int i = 0; i < personal.length; i++) {
            System.out.printf("%d. %s - %d años - %c%n", 
                i+1, personal[i].nombre, personal[i].edad, personal[i].sexo);
        }
        
        double promedio = calcularEdadPromedio(personal);
        System.out.printf("%na) Edad promedio: %.2f años%n", promedio);
        System.out.println("   Esperado: 37.50 años");
        
        String masJoven = encontrarProfesorMasJoven(personal);
        System.out.println("\nb) Profesor más joven: " + masJoven);
        System.out.println("   Esperado: Carlos");
        
        String masViejo = encontrarProfesorMasViejo(personal);
        System.out.println("\nc) Profesor más viejo: " + masViejo);
        System.out.println("   Esperado: Elena");
        
        int profMayores = contarProfesorasMayoresAlPromedio(personal, promedio);
        System.out.println("\nd) Profesoras > promedio: " + profMayores);
        System.out.println("   Esperado: 2");
        
        int profMenores = contarProfesoresMenoresAlPromedio(personal, promedio);
        System.out.println("\ne) Profesores < promedio: " + profMenores);
        System.out.println("   Esperado: 2");
    }
}
