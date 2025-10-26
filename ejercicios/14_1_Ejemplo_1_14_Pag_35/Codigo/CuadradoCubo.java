import java.util.Scanner; // Se importa la clase Scanner para leer la entrada del usuario.

/**
 * El programa, dado como dato un número entero positivo,
 * calcula el cuadrado y el cubo de dicho número.
 */
public class CuadradoCubo {

    public static void main(String[] args) {

        // Declaración de variables:
        // NUM es una variable de tipo entero. CUA y CUB son variables de tipo real (double en Java).
        int num;
        double cua, cub;

        // Se crea un objeto Scanner para leer los datos introducidos por el usuario.
        Scanner teclado = new Scanner(System.in);

        // 1. Leer NUM
        System.out.print("Introduce un número entero: ");
        num = teclado.nextInt();

        // 2. Hacer CUA = NUM * NUM y CUB = NUM ^ 3
        // Se utiliza Math.pow() para elevar el número a la potencia deseada.
        cua = Math.pow(num, 2); // Eleva num al cuadrado
        cub = Math.pow(num, 3); // Eleva num al cubo

        // 3. Escribir CUA y CUB
        System.out.println("El cuadrado de " + num + " es: " + cua);
        System.out.println("El cubo de " + num + " es: " + cub);

        // Se cierra el objeto Scanner para liberar recursos.
        teclado.close();
    }
}