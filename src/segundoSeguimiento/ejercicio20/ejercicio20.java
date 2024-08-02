package segundoSeguimiento.ejercicio20;

class OperadorMovil {
    private String operador;
    private int minutosInternacionales;

    // Constructor
    public OperadorMovil(String operador, int minutosInternacionales) {
        this.operador = operador;
        this.minutosInternacionales = minutosInternacionales;
    }

    // Método para calcular el costo total
    public int calcularCostoTotal() {
        int cargoFijo;
        int valorMinutoInternacional;
        int valorPaqueteDatos;

        switch (operador.toLowerCase()) {
            case "tigo":
                cargoFijo = 45000;
                valorMinutoInternacional = 200;
                valorPaqueteDatos = 12000;
                break;
            case "claro":
                cargoFijo = 30000;
                valorMinutoInternacional = 100;
                valorPaqueteDatos = 18000;
                break;
            case "movistar":
                cargoFijo = 40000;
                valorMinutoInternacional = 250;
                valorPaqueteDatos = 8000;
                break;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }

        int costoTotal = cargoFijo + (valorMinutoInternacional * minutosInternacionales) + valorPaqueteDatos;
        return costoTotal;
    }

    // Getters y Setters
    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void setMinutosInternacionales(int minutosInternacionales) {
        this.minutosInternacionales = minutosInternacionales;
    }
}
