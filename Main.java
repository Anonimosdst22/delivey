// Clase Main
// Aquí probamos que todo funcione, paso a paso.

public class Main {
    public static void main(String[] args) {

        // 1. Creamos un jugador
        Jugador jugador1 = new Jugador("Camilo");

        // 2. El jugador crea su personaje
        jugador1.crearPersonaje("Guerrero01", 100);
        Personaje personaje = jugador1.getPersonaje();

        System.out.println("Nombre: " + personaje.getNombre());
        System.out.println("Nivel inicial: " + personaje.getNivel());
        System.out.println("Vida inicial: " + personaje.getVida());

        // 3. El personaje sube de nivel (por una acción del juego)
        personaje.subirNivel();
        System.out.println("Nivel despues de subir: " + personaje.getNivel());

        // 4. El personaje recibe daño
        personaje.recibirDano(30);
        System.out.println("Vida despues de recibir daño: " + personaje.getVida());

        // 5. Probamos que la vida no baje de 0
        personaje.recibirDano(1000);
        System.out.println("Vida despues de daño exagerado: " + personaje.getVida());

        // 6. Agregamos objetos al inventario
        personaje.agregarObjeto(new ObjetoInventario("Espada"));
        personaje.agregarObjeto(new ObjetoInventario("Escudo"));
        System.out.println("Objetos en inventario: " + personaje.getInventario().size());

        // 7. Eliminamos el personaje: su inventario desaparece con él,
        //    pero el jugador sigue existiendo
        jugador1.eliminarPersonaje();
        System.out.println("Jugador sigue existiendo: " + jugador1.getNombre());
        System.out.println("Personaje actual: " + jugador1.getPersonaje());
    }
}
