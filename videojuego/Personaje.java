import java.util.ArrayList;

public class Personaje {

    private String nombre;
    private int nivel;
    private int vida;
    private int vidaMaxima;
    private ArrayList<ObjetoInventario> inventario;

    public Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.nivel = 1;
        this.vida = vidaMaxima;
        this.inventario = new ArrayList<ObjetoInventario>();
    }

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

    public void subirNivel() {
        nivel = nivel + 1;
    }

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
