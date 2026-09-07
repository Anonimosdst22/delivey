public class Main {
    public static void main(String[] args) {

        Producto guitarra = new Producto("P001", "Guitarra acustica", 500000, 10);
        Administrador admin = new Administrador("Ana");
        Cliente cliente = new Cliente("Marco");

        System.out.println("Precio inicial: " + guitarra.getPrecio());
        admin.modificarPrecio(guitarra, 450000);
        System.out.println("Precio tras cambio: " + guitarra.getPrecio());

        Venta venta = new Venta(cliente);
        venta.agregarProducto(guitarra, 2);
        cliente.agregarCompra(venta);

        System.out.println("Stock despues de compra: " + guitarra.getCantidadDisponible());
        System.out.println("Detalles en la venta: " + venta.getDetalles().size());
        System.out.println("Precio pagado en detalle: " + venta.getDetalles().get(0).getPrecioPagado());

        cliente.getCompras().remove(venta);
        System.out.println("Compras del cliente tras eliminar venta: " + cliente.getCompras().size());
        System.out.println("Producto sigue existiendo: " + guitarra.getNombre());
        System.out.println("Cliente sigue existiendo: " + cliente.getNombre());
    }
}
