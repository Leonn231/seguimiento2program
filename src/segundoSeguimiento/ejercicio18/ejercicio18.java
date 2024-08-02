package segundoSeguimiento.ejercicio18;

class Computadora {
    private boolean emitePitido;
    private boolean discoDuroGira;

    // Constructor
    public Computadora(boolean emitePitido, boolean discoDuroGira) {
        this.emitePitido = emitePitido;
        this.discoDuroGira = discoDuroGira;
    }

    // Método para determinar el estado de la computadora
    public String determinarEstado() {
        if (emitePitido && discoDuroGira) {
            return "Póngase en contacto con el técnico de apoyo.";
        } else if (emitePitido && !discoDuroGira) {
            return "Verificar contactos de la unidad.";
        } else if (!emitePitido && !discoDuroGira) {
            return "Traiga la computadora para repararla en la central.";
        } else if (!emitePitido && discoDuroGira) {
            return "Compruebe las conexiones de altavoces.";
        }
        return "Estado desconocido.";
    }

    // Getters y Setters
    public boolean isEmitePitido() {
        return emitePitido;
    }

    public void setEmitePitido(boolean emitePitido) {
        this.emitePitido = emitePitido;
    }

    public boolean isDiscoDuroGira() {
        return discoDuroGira;
    }

    public void setDiscoDuroGira(boolean discoDuroGira) {
        this.discoDuroGira = discoDuroGira;
    }
}
