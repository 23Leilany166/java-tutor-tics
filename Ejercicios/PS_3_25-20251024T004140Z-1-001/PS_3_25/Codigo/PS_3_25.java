/*
En una escuela en la que se tienen registros con las características físicas de los alumnos, se desea conocer la lista de los alumnos con aptitudes para practicar básquet.
*/
package c.PS_3_25;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class PS_3_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();
        List<Alumno> alumnasAptas = new ArrayList<>();
        List<Alumno> alumnosAptos = new ArrayList<>();

        // Ingresar los datos de los alumnos
        System.out.print("Ingrese el número de alumnos: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Sexo (F/M): ");
            String sexo = scanner.next();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Peso: ");
            int peso = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            Alumno alumno = new Alumno(nombre, sexo, edad, peso, altura);
            alumnos.add(alumno);

            // Verificar aptitudes para básquet
            if (sexo.equalsIgnoreCase("F") && altura > 1.73 && peso > 50 && peso < 90) {
                alumnasAptas.add(alumno);
            }
            if (sexo.equalsIgnoreCase("M") && altura > 1.83 && peso > 73 && peso < 110) {
                alumnosAptos.add(alumno);
            }
        }

        // Imprimir lista de alumnas aptas para básquet
        System.out.println("\nLista de alumnas con aptitudes para jugar básquet:");
        for (Alumno alumna : alumnasAptas) {
            System.out.println(alumna.getNombre());
        }

        // Calcular porcentaje de alumnas aptas
        double porcentajeAlumnasAptas = (double) alumnasAptas.size() / (double) alumnos.size() * 100;
        System.out.println("\nPorcentaje de alumnas con aptitudes para jugar básquet: " + porcentajeAlumnasAptas + "%");

        // Imprimir lista de alumnos aptos para básquet
        System.out.println("\nLista de alumnos con aptitudes para jugar básquet:");
        for (Alumno alumno : alumnosAptos) {
            System.out.println(alumno.getNombre());
        }

        // Calcular porcentaje de alumnos aptos
        double porcentajeAlumnosAptos = (double) alumnosAptos.size() / (double) alumnos.size() * 100;
        System.out.println("\nPorcentaje de alumnos con aptitudes para jugar básquet: " + porcentajeAlumnosAptos + "%");
    }

}

class Alumno {
    private String nombre;
    private String sexo;
    private int edad;
    private int peso;
    private double altura;

    public Alumno(String nombre, String sexo, int edad, int peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }    
}
