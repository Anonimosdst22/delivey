import java.util.ArrayList;

// Clase Personaje
// El jugador puede CONSULTAR nivel y vida, pero no modificarlos directamente.
// Solo suben/bajan mediante métodos controlados (acciones del juego).

public class Personaje {

    private String nombre;
    private int nivel;
    private int vida;
    private int vidaMaxima;
    private ArrayList<ObjetoInventario> inventario;

    public Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.nivel = 1;          // todo personaje empieza en nivel 1
        this.vida = vidaMaxima;  // empieza con la vida al máximo
        this.inventario = new ArrayList<ObjetoInventario>();
    }

    // ---- Solo consulta (getters), no hay setters directos ----

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public ArrayList<ObjetoInventario> getInventario() {
        return inventario;
    }

    // ---- Métodos controlados: solo el juego los debería llamar ----

    // El nivel solo puede subir, nunca bajar ni asignarse directamente
    public void subirNivel() {
        nivel = nivel + 1;
    }

    // La vida nunca puede quedar por debajo de 0 ni por encima del máximo
    public void recibirDano(int cantidad) {
        vida = vida - cantidad;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void curar(int cantidad) {
        vida = vida + cantidad;
        if (vida > vidaMaxima) {
            vida = vidaMaxima;
        }
    }

    public void agregarObjeto(ObjetoInventario objeto) {
        inventario.add(objeto);
    }
}
