package segundoSeguimiento.ejercicio14;

class AyudaAlcaldia {
    private String genero;
    private int edad;

    // Constructor
    public AyudaAlcaldia(String genero, int edad) {
        this.genero = genero;
        this.edad = edad;
    }

    // Método para calcular el valor recibido
    public int calcularAyuda() {
        if (genero.equalsIgnoreCase("femenino")) {
            if (edad > 50) {
                return 120000;
            } else if (edad >= 30 && edad <= 50) {
                return 100000;
            }
        } else if (genero.equalsIgnoreCase("masculino")) {
            return 40000;
        }
        return 0;
    }

    // Getters y Setters
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
