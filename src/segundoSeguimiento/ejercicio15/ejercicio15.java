package segundoSeguimiento.ejercicio15;

class Gimnasio {
    private int duracion;

    // Constructor
    public Gimnasio(int duracion) {
        this.duracion = duracion;
    }

    // Método para calcular el costo de la membresía
    public int calcularCosto() {
        switch (duracion) {
            case 15:
                return 18000;
            case 30:
                return 35000;
            case 90: // 3 meses = 90 días
                return 86000;
            default:
                return 0; // Duración no válida
        }
    }

    // Getters y Setters
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
