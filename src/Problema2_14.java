public class Problema2_14 {
    public double calcularCostoTotal(int tipoEnf, int edad, int dias) {
        double costoDia = 0;

        // Asignar costo por tipo de enfermedad
        switch (tipoEnf) {
            case 1:
                costoDia = 25;
                break;
            case 2:
                costoDia = 16;
                break;
            case 3:
                costoDia = 20;
                break;
            case 4:
                costoDia = 32;
                break;
            default:
                System.out.println("Tipo de enfermedad no válido");
                return 0;
        }

        double costoTotal = costoDia * dias;

        // Aumento del 10% si la edad está entre 14 y 22
        if (edad >= 14 && edad <= 22) {
            costoTotal *= 1.10;
        }

        return costoTotal;
    }
}
