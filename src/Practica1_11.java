import java.util.Scanner;

public class Practica1_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas de los puntos del triángulo:");
        System.out.print("X1: "); double x1 = sc.nextDouble();
        System.out.print("Y1: "); double y1 = sc.nextDouble();
        System.out.print("X2: "); double x2 = sc.nextDouble();
        System.out.print("Y2: "); double y2 = sc.nextDouble();
        System.out.print("X3: "); double x3 = sc.nextDouble();
        System.out.print("Y3: "); double y3 = sc.nextDouble();

        double d12 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double d23 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double d31 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double perimetro = d12 + d23 + d31;

        System.out.printf("El perímetro del triángulo es: %.2f%n", perimetro);

        sc.close();
    }
}
