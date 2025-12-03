public class ItemFactura {
    private int clave;
    private String ramo;
    private int cantidad;
    private double precioUnitario;

    public ItemFactura(int clave, int cantidad, double precioUnitario) {
        this.clave = clave;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.ramo = getRamoPorClave(clave);
    }

    private String getRamoPorClave(int clave) {
        switch (clave) {
            case 1: return "Perecederos";
            case 2: return "Aseo";
            case 3: return "Perfumería";
            case 4: return "Abarrotes";
            default: return "Otro";
        }
    }

    public double getTotal() {
        return cantidad * precioUnitario;
    }

    // Getters
    public int getClave() { return clave; }
    public String getRamo() { return ramo; }
    public int getCantidad() { return cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }
}