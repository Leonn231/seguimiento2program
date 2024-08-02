package segundoSeguimiento.ejercicio19;

class Automovil {
    private int modelo;

    // Constructor
    public Automovil(int modelo) {
        this.modelo = modelo;
    }

    // Método para verificar si el modelo es defectuoso
    public boolean esDefectuoso() {
        return (modelo == 119 || modelo == 179 || (modelo >= 189 && modelo <= 195) || modelo == 221 || modelo == 780);
    }

    // Getters y Setters
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}

