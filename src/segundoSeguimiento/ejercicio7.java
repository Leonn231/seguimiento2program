package segundoSeguimiento;

public class ejercicio7 {
    private String numeroReclamo;
    private String nombrePersona;
    private String asunto;
    private String descripcionReclamo;
    private String estadoReclamo;

    // Constructor
    public ejercicio7(String numeroReclamo, String nombrePersona, String asunto, String descripcionReclamo, String estadoReclamo) {
        this.numeroReclamo = numeroReclamo;
        this.nombrePersona = nombrePersona;
        this.asunto = asunto;
        this.descripcionReclamo = descripcionReclamo;
        this.estadoReclamo = estadoReclamo;
    }

    // Métodos
    public boolean validarEstadoReclamo() {
        return "Resuelto".equalsIgnoreCase(estadoReclamo) || "Pendiente".equalsIgnoreCase(estadoReclamo) || "En proceso".equalsIgnoreCase(estadoReclamo);
    }

    public String mensajeRecepcionReclamo() {
        return "Reclamo recibido: " + numeroReclamo + " - " + asunto + " - " + estadoReclamo;
    }

    // Getters y Setters
    public String getNumeroReclamo() {
        return numeroReclamo;
    }

    public void setNumeroReclamo(String numeroReclamo) {
        this.numeroReclamo = numeroReclamo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcionReclamo() {
        return descripcionReclamo;
    }

    public void setDescripcionReclamo(String descripcionReclamo) {
        this.descripcionReclamo = descripcionReclamo;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }


}
