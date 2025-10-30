public class Problema1_3 {

    // Método para convertir peso (libras → kilogramos)
    public double convertirPeso(double libras) {
        return libras * 0.453592; // 1 libra = 0.453592 kg
    }

    // Método para convertir longitud (pies → metros)
    public double convertirLongitud(double pies) {
        return pies * 0.3047; // según el libro
    }

    // Método principal de ejemplo
    public void mostrarDatos(String nombre, double pesoLibras, double longitudPies) {
        double pesoKg = convertirPeso(pesoLibras);
        double longitudMetros = convertirLongitud(longitudPies);

        System.out.println("Dinosaurio: " + nombre);
        System.out.println("Peso en kilogramos: " + pesoKg);
        System.out.println("Longitud en metros: " + longitudMetros);
    }

    // Método main opcional para probar desde consola
    public static void main(String[] args) {
        Problema1_3 p = new Problema1_3();
        p.mostrarDatos("Tyrannosaurus Rex", 15000, 40);
    }
}
