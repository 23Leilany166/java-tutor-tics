public class Departamento implements Comparable<Departamento> {
    private int claveDept;
    private String nomDept;
    private int numEmpleados;
    private String nomJefe;

    public Departamento(int claveDept, String nomDept, int numEmpleados, String nomJefe) {
        this.claveDept = claveDept;
        this.nomDept = nomDept;
        this.numEmpleados = numEmpleados;
        this.nomJefe = nomJefe;
    }

    // Getters
    public int getClaveDept() { return claveDept; }
    public String getNomDept() { return nomDept; }
    public int getNumEmpleados() { return numEmpleados; }
    public String getNomJefe() { return nomJefe; }

    // (Mutator para Inciso c)
    public void incrementarEmpleados() { this.numEmpleados++; }
    
    @Override
    public String toString() {
        return String.format("Depto[Clave: %d, Nombre: %s, Jefe: %s]", claveDept, nomDept, nomJefe);
    }

    // Permite que Collections.sort() y binarySearch() funcionen por clave
    @Override
    public int compareTo(Departamento other) {
        return Integer.compare(this.claveDept, other.getClaveDept());
    }
}
