public class Ejemplo5_6 {

    // Registro anidado para DOMICILIO
    static class Domicilio {
        String calle;
        int numero;
        String ciudad;
        String pais;

        public Domicilio(String calle, int numero, String ciudad, String pais) {
            this.calle = calle;
            this.numero = numero;
            this.ciudad = ciudad;
            this.pais = pais;
        }

        @Override
        public String toString() {
            return calle + " #" + numero + ", " + ciudad + ", " + pais;
        }
    }

    // Registro principal EMPLEADO
    static class Empleado {
        int numero;
        String nombre;
        Domicilio direccion;
        String departamento;
        int nivel;
        double sueldo;

        public Empleado(int numero, String nombre, Domicilio direccion, String departamento, int nivel, double sueldo) {
            this.numero = numero;
            this.nombre = nombre;
            this.direccion = direccion;
            this.departamento = departamento;
            this.nivel = nivel;
            this.sueldo = sueldo;
        }

        @Override
        public String toString() {
            return "Empleado #" + numero + "\n" +
                   "Nombre: " + nombre + "\n" +
                   "Dirección: " + direccion + "\n" +
                   "Departamento: " + departamento + "\n" +
                   "Nivel: " + nivel + "\n" +
                   "Sueldo: $" + sueldo;
        }
    }

    public static void main(String[] args) {
        // Creamos el registro anidado
        Domicilio dom = new Domicilio("Av. Hidalgo", 102, "Pachuca", "México");
        Empleado emp = new Empleado(1, "Xavier Guerrero", dom, "TICs", 2, 18500.75);

        System.out.println(emp);
    }
}
