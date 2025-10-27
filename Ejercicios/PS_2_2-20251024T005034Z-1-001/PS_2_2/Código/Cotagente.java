
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author imac13
 */
public class Cotagente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Ingrese el seno");
        double coseno = dato.nextDouble();
        
        System.out.println("Ingrese el coseno");
        double seno = dato.nextDouble();
        
        if (seno != 0) {
            double cotangente = coseno / seno; 
            System.out.println("La cotangente del ángulo es: " + Math.round(cotangente));
        } else {
            System.out.println("El seno debe ser diferente de cero.");
        }
        
        
    }
    
}
