package segundoSeguimiento.ejercicio11;

public class ejercicio11 {
    private int numero;

    // Constructor
    public ejercicio11(int numero) {
        this.numero = numero;
    }

    // Método para determinar si el número es par o impar
    public String determinarParImpar() {
        if (numero % 2 == 0) {
            return "El número " + numero + " es par.";
        } else {
            return "El número " + numero + " es impar.";
        }
    }

    // Getter y Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}