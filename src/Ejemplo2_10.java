public class Ejemplo2_10 {

    public static String evaluarCondiciones(boolean condicion1, boolean condicion2, boolean condicion3) {
        if (condicion1) {
            if (condicion2) {
                return "Operación 21";
            } else {
                return "Operación 22";
            }
        } else {
            if (condicion3) {
                return "Operación 31";
            }
        }
        return "Sin operación";
    }

    public static void main(String[] args) {
        System.out.println(evaluarCondiciones(true, true, false));   // Operación 21
        System.out.println(evaluarCondiciones(true, false, false));  // Operación 22
        System.out.println(evaluarCondiciones(false, false, true));  // Operación 31
    }
}
