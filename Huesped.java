import java.util.ArrayList;

public class Huesped {

    private String nombre;
    private ArrayList<Reserva> reservas;

    public Huesped(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<Reserva>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public Reserva reservar(Habitacion habitacion, String fechaEntrada, String fechaSalida) {
        if (habitacion.getEstado() == EstadoHabitacion.DISPONIBLE) {
            Reserva reserva = new Reserva(this, habitacion, fechaEntrada, fechaSalida);
            reservas.add(reserva);
            habitacion.cambiarEstado(EstadoHabitacion.OCUPADA);
            return reserva;
        }
        return null;
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }
}
