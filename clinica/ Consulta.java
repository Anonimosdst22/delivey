public class Consulta {

    private String fecha;
    private String motivo;
    private String diagnostico;
    private String tratamiento;

    public Consulta(String fecha, String motivo, String diagnostico, String tratamiento) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }
}
