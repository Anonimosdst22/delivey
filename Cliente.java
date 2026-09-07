import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private ArrayList<Venta> compras;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.compras = new ArrayList<Venta>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Venta> getCompras() {
        return compras;
    }

    public void agregarCompra(Venta venta) {
        compras.add(venta);
    }
}
