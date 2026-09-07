import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private ArrayList<DetalleVenta> detalles;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.detalles = new ArrayList<DetalleVenta>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        producto.reducirStock(cantidad);
        DetalleVenta detalle = new DetalleVenta(producto, cantidad, producto.getPrecio());
        detalles.add(detalle);
    }
}
