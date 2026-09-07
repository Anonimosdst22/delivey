public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Laura");
        Mascota mascota = new Mascota("Firulais", "Perro", 3, 12.5);
        cliente.agregarMascota(mascota);

        Veterinario veterinario = new Veterinario("Dr. Gomez");

        Consulta consulta1 = new Consulta("2026-01-10", "Revision general", "Sano", "Ninguno");
        veterinario.registrarConsulta(mascota, consulta1);

        veterinario.actualizarPesoMascota(mascota, 13.0);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Mascota: " + mascota.getNombre() + " - Peso: " + mascota.getPeso());
        System.out.println("Consultas registradas: " + mascota.getConsultas().size());

        // Probamos que el peso no cambie si es invalido
        veterinario.actualizarPesoMascota(mascota, -5);
        System.out.println("Peso despues de intento invalido: " + mascota.getPeso());

        // Eliminamos la consulta, la mascota y el cliente siguen existiendo
        mascota.eliminarConsulta(consulta1);
        System.out.println("Consultas despues de eliminar: " + mascota.getConsultas().size());
        System.out.println("Mascota sigue existiendo: " + mascota.getNombre());
        System.out.println("Cliente sigue existiendo: " + cliente.getNombre());
    }
}
