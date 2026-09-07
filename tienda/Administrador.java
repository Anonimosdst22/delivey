public class Administrador {

    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void modificarPrecio(Producto producto, double nuevoPrecio) {
        producto.actualizarPrecio(nuevoPrecio);
    }

    public void modificarInventario(Producto producto, int nuevaCantidad) {
        producto.actualizarInventario(nuevaCantidad);
    }
}
