public class Jugador {

    private String nombre;
    private Personaje personaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.personaje = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void crearPersonaje(String nombrePersonaje, int vidaMaxima) {
        this.personaje = new Personaje(nombrePersonaje, vidaMaxima);
    }

    public void eliminarPersonaje() {
        this.personaje = null;
    }
}
