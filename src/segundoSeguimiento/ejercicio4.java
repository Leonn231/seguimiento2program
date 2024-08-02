package segundoSeguimiento;

public class ejercicio4 {
    private String codEmpleado;
    private double salarioBasico;
    private int horasExtras;
    private int numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    private double bonificacion;
    private double neto;

    // Constructor
    public ejercicio4(String codEmpleado, double salarioBasico, int horasExtras, int numeroHoras, double descuento, double descuentoPrestamo, double bonificacion) {
        this.codEmpleado = codEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtras = horasExtras;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.descuentoPrestamo = descuentoPrestamo;
        this.bonificacion = bonificacion;
        this.neto = 0.0;
    }

    // Métodos
    public double calcularValorHE() {

        double valorHoraExtra = (salarioBasico / numeroHoras) * 1.5;
        return valorHoraExtra * horasExtras;
    }

    public double calcularDevengado() {
        return salarioBasico + calcularValorHE() + bonificacion;
    }

    public double calcularDeducido() {
        return descuento + descuentoPrestamo;
    }

    public double calcularNeto() {
        this.neto = calcularDevengado() - calcularDeducido();
        return this.neto;
    }

    // Getters y Setters
    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(double descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getNeto() {
        return neto;
    }


}
