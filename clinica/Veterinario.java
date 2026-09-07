public class Veterinario {

    private String nombre;

    public Veterinario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // El veterinario es quien registra consultas y actualiza el peso
    public void registrarConsulta(Mascota mascota, Consulta consulta) {
        mascota.agregarConsulta(consulta);
    }

    public void actualizarPesoMascota(Mascota mascota, double nuevoPeso) {
        mascota.actualizarPeso(nuevoPeso);
    }
}
