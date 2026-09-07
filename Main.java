public class Main {
    public static void main(String[] args) {

        Habitacion habitacion101 = new Habitacion(101, "Sencilla");
        Administrador admin = new Administrador("Sofia");
        Huesped huesped = new Huesped("Pedro");

        System.out.println("Estado inicial: " + habitacion101.getEstado());

        Reserva reserva = huesped.reservar(habitacion101, "2026-02-01", "2026-02-05");
        System.out.println("Estado tras reservar: " + habitacion101.getEstado());
        System.out.println("Reservas del huesped: " + huesped.getReservas().size());

        admin.cambiarEstadoHabitacion(habitacion101, EstadoHabitacion.MANTENIMIENTO);
        System.out.println("Estado cambiado por admin: " + habitacion101.getEstado());

        huesped.eliminarReserva(reserva);
        System.out.println("Reservas despues de eliminar: " + huesped.getReservas().size());
        System.out.println("Habitacion sigue existiendo: " + habitacion101.getNumero());
        System.out.println("Huesped sigue existiendo: " + huesped.getNombre());
    }
}
