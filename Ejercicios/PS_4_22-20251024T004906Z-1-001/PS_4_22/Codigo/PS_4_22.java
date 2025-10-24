/*
Los datos reunidos en la Secretar ́ıa de Industrias relacionado a la producci ́on de N f ́abricas
en cada uno de los meses del a ̃no anterior, se proporcionan de la siguiente manera:
Datos: N

F AB1, MES1,1, MES1,2, MES1,12,
F AB2, MES2,1, MES2,2, MES2,12,

...
...
F ABN , MESN ,1, MESN ,2, MESN ,12

Donde:
N es una variable de tipo entero que representa el ńumero de f́abricas, 1 ≤ N ≤ 500
F ABi es una variable de tipo entero que representa la clave de la f́abricai
MESi,j es una variable de tipo real que representa la producci ́on de la fabrica 
en el mes j
a) La clave de la f ́abrica que m ́as produjo el a ̃no anterior. Imprimir tambi ́en su
producci on.

b) Dado un mes como paŕametro, imprimir las claves de las f́abricas cuyas produc-
ciones en dicho mes, fueron superiores a $150,000.
 */
package ps_4_22;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class PS_4_22 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de fábricas: ");
        int N = scanner.nextInt();

        int claveMaxProduccion = 0;
        double maxProduccion = 0;
        int mesParametro = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la clave de la fábrica " + (i+1) + ": ");
            int fabClave = scanner.nextInt();

            double produccionMaxMes = 0;

            for (int j = 1; j <= 12; j++) {
                System.out.print("Ingrese la producción en el mes " + j + " para la fábrica " + fabClave + ": ");
                double produccionMes = scanner.nextDouble();

                if (produccionMes > produccionMaxMes) {
                    produccionMaxMes = produccionMes;
                }

                if (produccionMes > 150000 && j == mesParametro) {
                    System.out.println("La fábrica " + fabClave + " produjo en el mes " + j + ": " + produccionMes);
                }
            }

            if (produccionMaxMes > maxProduccion) {
                maxProduccion = produccionMaxMes;
                claveMaxProduccion = fabClave;
            }
        }

        System.out.println("La fábrica con mayor producción fue: " + claveMaxProduccion + " con una producción de: " + maxProduccion);
    }
}
