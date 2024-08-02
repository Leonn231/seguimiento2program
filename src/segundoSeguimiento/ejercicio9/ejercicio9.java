package segundoSeguimiento.ejercicio9;

class Numero {
    private double valor;

    // Constructor
    public Numero(double valor) {
        this.valor = valor;
    }

    // Método para determinar si el número es positivo, negativo o cero
    public String determinarPositivoNegativo() {
        if (valor > 0) {
            return "El número " + valor + " es positivo.";
        } else if (valor < 0) {
            return "El número " + valor + " es negativo.";
        } else {
            return "El número es cero.";
        }
    }

    // Getter y Setter
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}