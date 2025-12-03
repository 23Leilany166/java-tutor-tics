// Archivo: ReporteINAH.java
public class ReporteINAH {

    // [58 Centros][12 Meses][10 Años]
    private int[][][] visitantes;

    public ReporteINAH(int[][][] datos) {
        this.visitantes = datos;
    }

    /**
     * a) Año con mayor afluencia para el centro 43 (índice 42).
     */
    public int getAnoMayorAfluencia(int centroIndex) {
        long maxVisitas = -1;
        int anoMax = 1990; // Asumimos que los índices 0-9 son 1990-1999

        for (int a = 0; a < 10; a++) { // 10 Años
            long sumaAnual = 0;
            for (int m = 0; m < 12; m++) { // 12 Meses
                sumaAnual += visitantes[centroIndex][m][a];
            }
            
            if (sumaAnual > maxVisitas) {
                maxVisitas = sumaAnual;
                anoMax = 1990 + a;
            }
        }
        return anoMax;
    }

    /**
     * b) Centro con mayor afluencia en 1994 (índice 4).
     */
    public int getCentroMayorAfluencia(int anoIndex) {
        long maxVisitas = -1;
        int centroMax = -1;

        for (int c = 0; c < 58; c++) { // 58 Centros
            long sumaAnual = 0;
            for (int m = 0; m < 12; m++) { // 12 Meses
                sumaAnual += visitantes[c][m][anoIndex];
            }
            
            if (sumaAnual > maxVisitas) {
                maxVisitas = sumaAnual;
                centroMax = c;
            }
        }
        return centroMax + 1; // Devolvemos la clave (1-58)
    }

    /**
     * c) Mes con mayor afluencia en 1995 (índice 5).
     */
    public int getMesMayorAfluencia(int anoIndex) {
        long maxVisitas = -1;
        int mesMax = -1;

        for (int m = 0; m < 12; m++) { // 12 Meses
            long sumaMensual = 0;
            for (int c = 0; c < 58; c++) { // 58 Centros
                sumaMensual += visitantes[c][m][anoIndex];
            }
            
            if (sumaMensual > maxVisitas) {
                maxVisitas = sumaMensual;
                mesMax = m;
            }
        }
        return mesMax + 1; // Devolvemos el mes (1-12)
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Creamos datos de prueba [58][12][10]
        int[][][] datos = new int[58][12][10];

        // Llenamos algunos datos de ejemplo:
        // Centro 43 (idx 42), Mes 5 (idx 4), Año 1992 (idx 2) = 5000 visitas
        datos[42][4][2] = 5000;
        // Centro 43 (idx 42), Mes 6 (idx 5), Año 1998 (idx 8) = 8000 visitas
        datos[42][5][8] = 8000;
        
        // Centro 10 (idx 9), Mes 3 (idx 2), Año 1994 (idx 4) = 9999 visitas
        datos[9][2][4] = 9999;
        
        // Centro 20 (idx 19), Mes 8 (idx 7), Año 1995 (idx 5) = 7000 visitas
        datos[19][7][5] = 7000;

        // Creamos la instancia del reporte
        ReporteINAH reporte = new ReporteINAH(datos);

        // a) Año con más visitas para el Centro 43 (idx 42)
        // (Debe ser 1998 por las 8000 visitas)
        System.out.println("Inciso a) Año con más visitas (Centro 43): " + reporte.getAnoMayorAfluencia(42));

        // b) Centro con más visitas en 1994 (idx 4)
        // (Debe ser el Centro 10 por las 9999 visitas)
        System.out.println("Inciso b) Centro con más visitas (1994): " + reporte.getCentroMayorAfluencia(4));
        
        // c) Mes con más visitas en 1995 (idx 5)
        // (Debe ser el Mes 8 (Agosto) por las 7000 visitas)
        System.out.println("Inciso c) Mes con más visitas (1995): " + reporte.getMesMayorAfluencia(5));
    }
}