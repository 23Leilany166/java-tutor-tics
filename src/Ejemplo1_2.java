public class Ejemplo1_2 {

    public static void main(String[] args) {
        System.out.println("=== EJEMPLO 1.2 ===");
        System.out.println("Resolviendo varios casos paso a paso:\n");

        casoA();
        casoB();
        casoC();
        casoD();
        casoE();
    }

    public static void casoA() {
        System.out.println("Caso a)");
        int paso1 = 7 + 5 - 6;
        System.out.println("Paso 1: 7 + 5 - 6 = " + paso1);
        int paso2 = 12 - 6;
        System.out.println("Paso 2: 12 - 6 = " + paso2);
        System.out.println("Resultado final: " + paso2 + "\n");
    }

    public static void casoB() {
        System.out.println("Caso b)");
        double paso1 = 9 + 7 * 8 - 36 / 5.0;
        System.out.println("Paso 1: 9 + 7 * 8 - 36 / 5 = " + paso1);
        double paso2 = 9 + 56 - 7.2;
        System.out.println("Paso 2: 9 + 56 - 7.2 = " + paso2);
        double paso3 = 65 - 7.2;
        System.out.println("Paso 3: 65 - 7.2 = " + paso3);
        System.out.println("Resultado final: " + paso3 + "\n");
    }

    public static void casoC() {
        System.out.println("Caso c)");
        double paso1 = Math.pow(5, 3);
        System.out.println("Paso 1: 5^3 = " + paso1);
        double paso2 = 7 * paso1 / 4;
        System.out.println("Paso 2: 7 * 125 / 4 = " + paso2);
        double paso3 = paso2 / 3;
        System.out.println("Paso 3: 218.75 / 3 = " + paso3);
        System.out.println("Resultado final: " + paso3 + "\n");
    }

    public static void casoD() {
        System.out.println("Caso d)");
        int paso1 = (int) Math.pow(3, 3);
        System.out.println("Paso 1: 3^3 = " + paso1);
        int paso2 = 160 % paso1;
        System.out.println("Paso 2: 160 mod 27 = " + paso2);
        int paso3 = 7 * 8 * paso2 / 5 * 13 - 28;
        System.out.println("Paso 3: 7 * 8 * 25 / 5 * 13 - 28 = " + paso3);
        System.out.println("Resultado final: 3612\n");
    }

    public static void casoE() {
        System.out.println("Caso e)");
        double paso1 = Math.pow(45, 2) / 16;
        System.out.println("Paso 1: (45^2) / 16 = " + paso1);
        double paso2 = 15 / 2.0 * (7 + (68 - 15 * 33 + paso1 / 3) / 15) + 19;
        System.out.println("Resultado final: " + paso2 + "\n");
    }
}
