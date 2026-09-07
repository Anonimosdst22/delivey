public class DetalleVenta {

    private Producto producto;
    private int cantidad;
    private double precioPagado;

    public DetalleVenta(Producto producto, int cantidad, double precioPagado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioPagado = precioPagado;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPagado() {
        return precioPagado;
    }
}
