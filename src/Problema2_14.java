public class Problema2_14 {
    public static double calcularCostoTotal(int tipoEnf, int edad, int dias) {
        double costoDia = 0;

        if (tipoEnf == 1)      costoDia = 25;
        else if (tipoEnf == 2) costoDia = 16;
        else if (tipoEnf == 3) costoDia = 20;
        else if (tipoEnf == 4) costoDia = 32;

        double costoTot = dias * costoDia;

        if (edad >= 14 && edad <= 22)
            costoTot = costoTot * 1.10;

        return costoTot;
    }

    public static void main(String[] args) {
        int tipo = 3, edad = 18, dias = 5;
        double total = calcularCostoTotal(tipo, edad, dias);
        System.out.println("Costo total: " + total);
    }
}
