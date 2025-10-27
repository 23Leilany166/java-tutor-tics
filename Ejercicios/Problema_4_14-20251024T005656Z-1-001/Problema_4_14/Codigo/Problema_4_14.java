/*
PRODUCCION _DEPARTAMENTOS
{El programa, dados los costos de producción de tres departamentos de una fábrica
correspondientes a los 12 meses del año anterior, obtiene información útil para la
toma de decisiones de la empresa}
*/
package c.Problema_4_14;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Problema_4_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] PROD = new double[12][3]; // Arreglo bidimensional para almacenar los costos de producción
        System.out.println("Departamentos: (dulces, bebidas y conservas)");
        // Ingreso de los costos de producción de los departamentos
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese costo de producción en el mes " + (i + 1) + " del departamento " + (j + 1));
                PROD[i][j] = sc.nextDouble();
            }
        }

        // Mayor costo de producción de dulces en un mes
        double MAYDUL = PROD[0][0];
        int MES = 1;
        for (int i = 1; i < 12; i++) {
            if (PROD[i][0] > MAYDUL) {
                MAYDUL = PROD[i][0];
                MES = i + 1;
            }
        }
        System.out.println("En el mes " + MES + " se registró el mayor costo de producción de dulces");

        // Promedio anual de costos de producción de bebidas
        double SUM = 0;
        for (int i = 0; i < 12; i++) {
            SUM += PROD[i][1];
        }
        double PROMBEB = SUM / 12;
        System.out.println("Promedio anual de costos de producción de bebidas: " + PROMBEB);

        // Mes con mayor y menor costo de producción de bebidas
        double MAYBEB = PROD[0][1];
        double MENBEB = PROD[0][1];
        int ME5MAY = 1;
        int ME5MEN = 1;
        for (int i = 1; i < 12; i++) {
            if (PROD[i][1] > MAYBEB) {
                MAYBEB = PROD[i][1];
                ME5MAY = i + 1;
            } else if (PROD[i][1] < MENBEB) {
                MENBEB = PROD[i][1];
                ME5MEN = i + 1;
            }
        }
        System.out.println("En el mes " + ME5MAY + " se registró el mayor costo de producción de bebidas, y en el mes " + ME5MEN + " el menor costo");

        // Departamento con menor costo de producción en diciembre
        double MENOR = PROD[11][0];
        int DEP = 1;
        for (int j = 1; j < 3; j++) {
            if (PROD[11][j] < MENOR) {
                MENOR = PROD[11][j];
                DEP = j + 1;
            }
        }
        System.out.println("El departamento " + DEP + " tuvo el menor costo en diciembre");
    }
    
}
