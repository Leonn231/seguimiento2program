package segundoSeguimiento.ejercicio12;

class notas {
    private double fisica;
    private double quimica;
    private double biologia;
    private double matematicas;
    private double informatica;

    // Constructor
    public notas(double fisica, double quimica, double biologia, double matematicas, double informatica) {
        this.fisica = fisica;
        this.quimica = quimica;
        this.biologia = biologia;
        this.matematicas = matematicas;
        this.informatica = informatica;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        return (fisica + quimica + biologia + matematicas + informatica) / 5;
    }

    // Método para determinar la calificación
    public String determinarCalificacion() {
        double promedio = calcularPromedio();
        if (promedio >= 0 && promedio < 6) {
            return "La calificación es mala.";
        } else if (promedio >= 6 && promedio <= 8) {
            return "La calificación es buena.";
        } else if (promedio > 8) {
            return "La calificación es excelente.";
        } else {
            return "Promedio fuera de rango.";
        }
    }

    // Getters y Setters
    public double getFisica() {
        return fisica;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public double getQuimica() {
        return quimica;
    }

    public void setQuimica(double quimica) {
        this.quimica = quimica;
    }

    public double getBiologia() {
        return biologia;
    }

    public void setBiologia(double biologia) {
        this.biologia = biologia;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getInformatica() {
        return informatica;
    }

    public void setInformatica(double informatica) {
        this.informatica = informatica;
    }
}