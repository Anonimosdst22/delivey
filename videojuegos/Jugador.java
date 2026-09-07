// Clase Jugador
// Representa al jugador que crea y controla personajes.
// El jugador sigue existiendo aunque su personaje sea eliminado.

public class Jugador {

    private String nombre;
    private Personaje personaje; // el jugador tiene un personaje (puede ser null)

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

    // El jugador puede crear su personaje
    public void crearPersonaje(String nombrePersonaje, int vidaMaxima) {
        this.personaje = new Personaje(nombrePersonaje, vidaMaxima);
    }

    // Si se elimina el personaje, su inventario desaparece con él,
    // pero el jugador (this) sigue existiendo normalmente.
    public void eliminarPersonaje() {
        this.personaje = null;
    }
}
