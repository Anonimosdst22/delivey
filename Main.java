public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Camilo");

        jugador1.crearPersonaje("Guerrero01", 100);
        Personaje personaje = jugador1.getPersonaje();

        System.out.println("Nombre: " + personaje.getNombre());
        System.out.println("Nivel inicial: " + personaje.getNivel());
        System.out.println("Vida inicial: " + personaje.getVida());

        personaje.subirNivel();
        System.out.println("Nivel despues de subir: " + personaje.getNivel());

        personaje.recibirDano(30);
        System.out.println("Vida despues de recibir daño: " + personaje.getVida());

        personaje.recibirDano(1000);
        System.out.println("Vida despues de daño exagerado: " + personaje.getVida());

        personaje.agregarObjeto(new ObjetoInventario("Espada"));
        personaje.agregarObjeto(new ObjetoInventario("Escudo"));
        System.out.println("Objetos en inventario: " + personaje.getInventario().size());

        jugador1.eliminarPersonaje();
        System.out.println("Jugador sigue existiendo: " + jugador1.getNombre());
        System.out.println("Personaje actual: " + jugador1.getPersonaje());
    }
}
