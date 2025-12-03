import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<ItemFactura> items;
    
    public Factura() {
        this.items = new ArrayList<>();
    }
    
    public void agregarItem(ItemFactura item) {
        this.items.add(item);
    }
    
    public double getGranTotal() {
        double granTotal = 0;
        for (ItemFactura item : items) {
            granTotal += item.getTotal();
        }
        return granTotal;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void imprimirFactura() {
        System.out.println("\n--- TIENDA \"LA PROVIDENCIA\" ---");
        System.out.println("CLAVE - RAMO         CANTIDAD   PRECIO UNIT.   TOTAL");
        System.out.println("-----------------------------------------------------");
        
        // Formato: %-[ancho]s (string), %-[ancho]d (int), %-[ancho].2f (double)
        for (ItemFactura item : items) {
            System.out.printf("%-5d - %-12s %-10d $%-13.2f $%-7.2f\n",
                item.getClave(),
                item.getRamo(),
                item.getCantidad(),
                item.getPrecioUnitario(),
                item.getTotal());
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("TOTAL A PAGAR: $ %.2f\n\n", getGranTotal());
    }
}