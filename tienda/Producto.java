public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto(String codigo, String nombre, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        }
    }

    public void actualizarInventario(int nuevaCantidad) {
        if (nuevaCantidad >= 0) {
            this.cantidadDisponible = nuevaCantidad;
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= cantidadDisponible) {
            cantidadDisponible = cantidadDisponible - cantidad;
        }
    }
}
