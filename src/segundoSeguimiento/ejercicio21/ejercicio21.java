package segundoSeguimiento.ejercicio21;

class SandwichOrder {
    private String tamano;
    private boolean tocino;
    private boolean jalapeno;
    private boolean pavo;
    private boolean queso;

    // Constructor
    public SandwichOrder(String tamano, boolean tocino, boolean jalapeno, boolean pavo, boolean queso) {
        this.tamano = tamano;
        this.tocino = tocino;
        this.jalapeno = jalapeno;
        this.pavo = pavo;
        this.queso = queso;
    }

    // Método para calcular el costo total
    public int calcularCosto() {
        int costoTotal = 0;

        if (tamano.equalsIgnoreCase("pequeño")) {
            costoTotal += 6000;
        } else if (tamano.equalsIgnoreCase("grande")) {
            costoTotal += 12000;
        } else {
            throw new IllegalArgumentException("Tamaño no válido: " + tamano);
        }

        if (tocino) {
            costoTotal += 3000;
        }
        if (pavo) {
            costoTotal += 3000;
        }
        if (queso) {
            costoTotal += 2500;
        }

        // El jalapeño es gratis, no se suma al costo total
        return costoTotal;
    }

    // Getters y Setters
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isTocino() {
        return tocino;
    }

    public void setTocino(boolean tocino) {
        this.tocino = tocino;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }

    public boolean isPavo() {
        return pavo;
    }

    public void setPavo(boolean pavo) {
        this.pavo = pavo;
    }

    public boolean isQueso() {
        return queso;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }
}
