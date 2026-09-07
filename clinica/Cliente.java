import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private ArrayList<Mascota> mascotas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<Mascota>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
}
