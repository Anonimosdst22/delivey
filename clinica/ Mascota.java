import java.util.ArrayList;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private ArrayList<Consulta> consultas;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.consultas = new ArrayList<Consulta>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    // Unica forma de cambiar el peso, debe ser mayor que 0
    public void actualizarPeso(double nuevoPeso) {
        if (nuevoPeso > 0) {
            this.peso = nuevoPeso;
        }
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void eliminarConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }
}
