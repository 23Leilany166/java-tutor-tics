public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private int claveDept;
    private int antiguedad;
    private double sueldo;

    public Empleado(String nombre, int claveDept, int antiguedad, double sueldo) {
        this.nombre = nombre;
        this.claveDept = claveDept;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getClaveDept() { return claveDept; }
    public int getAntiguedad() { return antiguedad; }
    public double getSueldo() { return sueldo; }

    @Override
    public String toString() {
        return String.format("Empleado[Nombre: %s, Dept: %d, Sueldo: %.2f]", nombre, claveDept, sueldo);
    }

    // Permite que Collections.sort() y binarySearch() funcionen por nombre
    @Override
    public int compareTo(Empleado other) {
        return this.nombre.compareTo(other.getNombre());
    }
}