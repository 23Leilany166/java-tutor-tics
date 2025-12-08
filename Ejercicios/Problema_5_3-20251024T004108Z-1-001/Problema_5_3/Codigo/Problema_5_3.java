import java.util.Scanner;

public class Problema_5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        System.out.print("Ingrese el número de profesores (1-200): ");
        N = sc.nextInt();
        sc.nextLine();

        // ARRAYS PARALELOS QUE SIMULAN EL REGISTRO PROFESOR
        int[] NUM = new int[N];
        String[] NOM = new String[N];
        String[] DEP = new String[N];
        String[] GRADO = new String[N];
        String[] NAC = new String[N];
        double[][] SALARIO = new double[N][12]; // 12 meses

        // CAPTURA DE DATOS
        System.out.println("\n--- CAPTURA DE INFORMACIÓN ---");

        for (int i = 0; i < N; i++) {
            System.out.println("\nProfesor " + (i + 1));

            System.out.print("Número de empleado: ");
            NUM[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Nombre: ");
            NOM[i] = sc.nextLine();

            System.out.print("Departamento: ");
            DEP[i] = sc.nextLine();

            System.out.print("Grado académico: ");
            GRADO[i] = sc.nextLine();

            System.out.print("Nacionalidad: ");
            NAC[i] = sc.nextLine();

            System.out.println("Ingrese los 12 salarios mensuales:");
            for (int j = 0; j < 12; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                SALARIO[i][j] = sc.nextDouble();
            }
            sc.nextLine(); 
        }

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n------ MENÚ ------");
            System.out.println("1) Profesor que más ganó en el año");
            System.out.println("2) Total pagado al departamento X");
            System.out.println("3) Total pagado a profesores extranjeros");
            System.out.println("4) Profesor del departamento Y que más ganó");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            // ======================================================
            // a) PROFESOR QUE MÁS GANÓ EN EL AÑO
            // ======================================================
            if (opcion == 1) {

                double MAX = 0;
                int IND = 0;

                for (int i = 0; i < N; i++) {
                    double suma = 0;
                    for (int j = 0; j < 12; j++) {
                        suma += SALARIO[i][j];
                    }

                    if (suma > MAX) {
                        MAX = suma;
                        IND = i;
                    }
                }

                System.out.println("\n--- Profesor que más ganó ---");
                System.out.println("Número: " + NUM[IND]);
                System.out.println("Nombre: " + NOM[IND]);
                System.out.println("Nacionalidad: " + NAC[IND]);
            }

            // ======================================================
            // b) TOTAL PAGADO A PROFESORES DEL DEPARTAMENTO X
            // ======================================================
            else if (opcion == 2) {

                System.out.print("\nIngrese el departamento: ");
                String depBuscado = sc.nextLine();

                double total = 0;

                for (int i = 0; i < N; i++) {
                    if (DEP[i].equalsIgnoreCase(depBuscado)) {
                        for (int j = 0; j < 12; j++) {
                            total += SALARIO[i][j];
                        }
                    }
                }

                System.out.println("\nTotal pagado al departamento " + depBuscado + ": " + total);
            }

            // ======================================================
            // c) TOTAL PAGADO A PROFESORES EXTRANJEROS
            // ======================================================
            else if (opcion == 3) {

                double total = 0;

                for (int i = 0; i < N; i++) {
                    if (!NAC[i].equalsIgnoreCase("México")) {
                        for (int j = 0; j < 12; j++) {
                            total += SALARIO[i][j];
                        }
                    }
                }

                System.out.println("\nTotal pagado a profesores extranjeros: " + total);
            }

            // ======================================================
            // d) PROFESOR DEL DEPTO. Y QUE MÁS GANÓ
            // ======================================================
            else if (opcion == 4) {

                System.out.print("\nIngrese el departamento: ");
                String depBuscado = sc.nextLine();

                double MAX = 0;
                int IND = -1;

                for (int i = 0; i < N; i++) {
                    if (DEP[i].equalsIgnoreCase(depBuscado)) {

                        double suma = 0;
                        for (int j = 0; j < 12; j++) {
                            suma += SALARIO[i][j];
                        }

                        if (suma > MAX) {
                            MAX = suma;
                            IND = i;
                        }
                    }
                }

                if (IND == -1) {
                    System.out.println("No hay profesores en ese departamento.");
                } else {
                    System.out.println("\nProfesor que más ganó en el departamento " + depBuscado + ":");
                    System.out.println("Nombre: " + NOM[IND]);
                }
            }

            else if (opcion == 5) {
                System.out.println("Saliendo...");
            }

            else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
