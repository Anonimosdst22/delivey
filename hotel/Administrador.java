public class Administrador {

    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void cambiarEstadoHabitacion(Habitacion habitacion, EstadoHabitacion nuevoEstado) {
        habitacion.cambiarEstado(nuevoEstado);
    }
}
