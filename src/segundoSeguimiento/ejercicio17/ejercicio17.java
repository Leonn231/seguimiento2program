package segundoSeguimiento.ejercicio17;

class Fotocopiadora {
    private int cantidadCopias;

    // Constructor
    public Fotocopiadora(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    // Método para obtener el precio por copia
    public int obtenerPrecioPorCopia() {
        if (cantidadCopias >= 0 && cantidadCopias <= 499) {
            return 120;
        } else if (cantidadCopias >= 500 && cantidadCopias <= 749) {
            return 100;
        } else if (cantidadCopias >= 750 && cantidadCopias <= 999) {
            return 80;
        } else if (cantidadCopias >= 1000) {
            return 50;
        } else {
            return 0; // Cantidad de copias no válida
        }
    }

    // Método para calcular el costo total
    public int calcularCostoTotal() {
        int precioPorCopia = obtenerPrecioPorCopia();
        return precioPorCopia * cantidadCopias;
    }

    // Getters y Setters
    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }
}
