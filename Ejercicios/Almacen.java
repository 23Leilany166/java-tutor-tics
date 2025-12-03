// Archivo: Almacen.java
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    // Usamos List como tipo de interfaz, ArrayList como implementación
    private List<Integer> elementos;

    public Almacen() {
        this.elementos = new ArrayList<>();
    }

    /**
     * Inserta un elemento al final del arreglo desordenado.
     */
    public void insertar(int e) {
        this.elementos.add(e);
        System.out.println("Insertado: " + e + ". Lista actual: " + elementos);
    }

    /**
     * Elimina la primera ocurrencia del elemento 'e'.
     * Devuelve true si lo encontró y eliminó, false si no.
     */
    public boolean eliminar(int e) {
        // Usamos Integer.valueOf(e) para que Java sepa que queremos
        // llamar a remove(Object) y no a remove(int index).
        boolean resultado = this.elementos.remove(Integer.valueOf(e));
        
        if (resultado) {
            System.out.println("Eliminado: " + e + ". Lista actual: " + elementos);
        } else {
            System.out.println("No se encontró: " + e + ". Lista actual: " + elementos);
        }
        return resultado;
    }
    
    // Getter para ver la lista (usado en el main)
    public List<Integer> getElementos() {
        return elementos;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Almacen a = new Almacen();
        a.insertar(10);
        a.insertar(20);
        a.insertar(30);
        a.insertar(10);
        
        // Elimina el primer 10 que encuentra
        a.eliminar(10); 
        
        // Intenta eliminar uno que no existe
        a.eliminar(99); 
        
        // Elimina el 20
        a.eliminar(20); 
        
        System.out.println("Estado final: " + a.getElementos());
    }
}