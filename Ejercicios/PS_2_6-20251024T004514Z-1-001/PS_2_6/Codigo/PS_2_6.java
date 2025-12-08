import java.util.Scanner;

public class PS_2_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int DIST, TIEM;
        double precioKm = 0.23;
        double distanciaTotal, precioNormal, precioFinal;

        System.out.print("Ingrese la distancia de ida (km): ");
        DIST = leer.nextInt();

        System.out.print("Ingrese el tiempo de estancia (dias): ");
        TIEM = leer.nextInt();

        // Distancia total ida y vuelta
        distanciaTotal = DIST * 2;

        // Precio sin descuento
        precioNormal = distanciaTotal * precioKm;

        // Aplicar descuento del 30% si cumple condiciones
        if (TIEM > 7 && distanciaTotal > 800) {
            precioFinal = precioNormal * 0.70;  // Se paga solo el 70%
        } else {
            precioFinal = precioNormal;
        }

        System.out.println("El precio final del billete es: $" + precioFinal);
    }
}
