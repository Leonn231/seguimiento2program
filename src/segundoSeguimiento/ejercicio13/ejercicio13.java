package segundoSeguimiento.ejercicio13;

class NumeroMayor {
    private int numero1;
    private int numero2;
    private int numero3;

    // Constructor
    public NumeroMayor(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    // Método para encontrar el número mayor
    public int encontrarMayor() {
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        return mayor;
    }

    // Getters y Setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
}
