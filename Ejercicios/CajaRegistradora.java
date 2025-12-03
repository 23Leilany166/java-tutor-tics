import java.util.HashMap;
import java.util.Map;

public class CajaRegistradora {
    // Mapa para rastrear el total vendido por clave de ramo (Inciso b)
    private Map<Integer, Double> ventasPorRamo;
    
    public CajaRegistradora() {
        this.ventasPorRamo = new HashMap<>();
        // Inicializar los 4 ramos
        ventasPorRamo.put(1, 0.0);
        ventasPorRamo.put(2, 0.0);
        ventasPorRamo.put(3, 0.0);
        ventasPorRamo.put(4, 0.0);
    }

    // Procesa una factura completa (Inciso a y b)
    public void procesarFactura(Factura factura) {
        factura.imprimirFactura();
        
        // Actualizar totales por ramo
        for (ItemFactura item : factura.getItems()) {
            int clave = item.getClave();
            if (ventasPorRamo.containsKey(clave)) {
                double totalAnterior = ventasPorRamo.get(clave);
                ventasPorRamo.put(clave, totalAnterior + item.getTotal());
            }
        }
    }

    // Imprime el reporte final del día (Inciso b y c)
    public void imprimirReporteDiario() {
        System.out.println("--- REPORTE DIARIO DE VENTAS ---");
        double maxVenta = -1;
        String ramoMax = "";

        for (Map.Entry<Integer, Double> entry : ventasPorRamo.entrySet()) {
            String ramo = getRamoPorClave(entry.getKey());
            double venta = entry.getValue();
            System.out.printf("Total Ramo %d (%s): $%.2f\n", entry.getKey(), ramo, venta);
            
            if (venta > maxVenta) {
                maxVenta = venta;
                ramoMax = ramo;
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Ramo con mayor venta: " + ramoMax);
    }
    
    private String getRamoPorClave(int clave) {
        // (Lógica duplicada de ItemFactura, idealmente estaría en un solo lugar)
        switch (clave) {
            case 1: return "Perecederos";
            case 2: return "Aseo";
            case 3: return "Perfumería";
            case 4: return "Abarrotes";
            default: return "Otro";
        }
    }

    // --- Main para simular el día ---
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();

        // Cliente 1
        Factura f1 = new Factura();
        f1.agregarItem(new ItemFactura(1, 5, 10.50)); // Perecederos
        f1.agregarItem(new ItemFactura(3, 1, 150.00)); // Perfumería
        caja.procesarFactura(f1);

        // Cliente 2
        Factura f2 = new Factura();
        f2.agregarItem(new ItemFactura(4, 10, 20.00)); // Abarrotes
        f2.agregarItem(new ItemFactura(1, 2, 5.00));   // Perecederos
        caja.procesarFactura(f2);
        
        // Final del día
        caja.imprimirReporteDiario();
    }
}