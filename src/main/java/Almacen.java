
// Archivo: Almacen.java
import java.util.ArrayList;

public class Almacen {
    public static void main(String[] args) {
        // Crear y usar un ArrayList para almacenar elementos
        ArrayList<Integer> elementos = new ArrayList<>();

        // Insertar elementos
        elementos.add(10);
        System.out.println("Insertado: 10. Lista actual: " + elementos);

        elementos.add(20);
        System.out.println("Insertado: 20. Lista actual: " + elementos);

        elementos.add(30);
        System.out.println("Insertado: 30. Lista actual: " + elementos);

        elementos.add(10);
        System.out.println("Insertado: 10. Lista actual: " + elementos);

        // Eliminar el primer 10 que encuentra
        boolean resultado1 = elementos.remove(Integer.valueOf(10));
        if (resultado1) {
            System.out.println("Eliminado: 10. Lista actual: " + elementos);
        } else {
            System.out.println("No se encontró: 10. Lista actual: " + elementos);
        }

        // Intentar eliminar uno que no existe
        boolean resultado2 = elementos.remove(Integer.valueOf(99));
        if (resultado2) {
            System.out.println("Eliminado: 99. Lista actual: " + elementos);
        } else {
            System.out.println("No se encontró: 99. Lista actual: " + elementos);
        }

        // Eliminar el 20
        boolean resultado3 = elementos.remove(Integer.valueOf(20));
        if (resultado3) {
            System.out.println("Eliminado: 20. Lista actual: " + elementos);
        } else {
            System.out.println("No se encontró: 20. Lista actual: " + elementos);
        }

        System.out.println("Estado final: " + elementos);
    }
}