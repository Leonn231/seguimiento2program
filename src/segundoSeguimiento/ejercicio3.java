package segundoSeguimiento;

public class ejercicio3 {   // Atributos
    private String codPrestamo;
    private String fechaPrestamo;
    private String nombreLibro;
    private String codigoUsuario;
    private int diasDePrestamo;
    private String estadoPrestamo;

    // Constructor
    public ejercicio3(String codPrestamo, String fechaPrestamo, String nombreLibro, String codigoUsuario, int diasDePrestamo, String estadoPrestamo) {
        this.codPrestamo = codPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.nombreLibro = nombreLibro;
        this.codigoUsuario = codigoUsuario;
        this.diasDePrestamo = diasDePrestamo;
        this.estadoPrestamo = estadoPrestamo;
    }

    // Métodos
    public String consultarEstadoPrestamo() {
        return this.estadoPrestamo;
    }

    public String consultarDatosPrestamo() {
        return "Código de Préstamo: " + this.codPrestamo + "\n" +
                "Fecha de Préstamo: " + this.fechaPrestamo + "\n" +
                "Nombre del Libro: " + this.nombreLibro + "\n" +
                "Código de Usuario: " + this.codigoUsuario + "\n" +
                "Días de Préstamo: " + this.diasDePrestamo + "\n" +
                "Estado del Préstamo: " + this.estadoPrestamo;
    }

    // Getters y Setters
    public String getCodPrestamo() {
        return codPrestamo;
    }

    public void setCodPrestamo(String codPrestamo) {
        this.codPrestamo = codPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getDiasDePrestamo() {
        return diasDePrestamo;
    }

    public void setDiasDePrestamo(int diasDePrestamo) {
        this.diasDePrestamo = diasDePrestamo;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }
}
