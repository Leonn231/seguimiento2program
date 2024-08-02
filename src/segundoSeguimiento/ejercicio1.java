package segundoSeguimiento;

public class ejercicio1 {public class Usuario {

    String usuarioBase;
    String usuarioIngresado;
    String claveBase;
    String claveIngresada;
    boolean EstadoSistema;

    public String validarEstado(){
        return "Estado";
    }

    public void PermitirAcceso(){
        //Logica para permitir acceso
    }

    public String getUsuarioBase() {
        return usuarioBase;
    }

    public void setUsuarioBase(String usuarioBase) {
        this.usuarioBase = usuarioBase;
    }

    public String getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }

    public String getClaveBase() {
        return claveBase;
    }

    public void setClaveBase(String claveBase) {
        this.claveBase = claveBase;
    }

    public String getClaveIngresada() {
        return claveIngresada;
    }

    public void setClaveIngresada(String claveIngresada) {
        this.claveIngresada = claveIngresada;
    }

    public boolean isEstadoSistema() {
        return EstadoSistema;
    }

    public void setEstadoSistema(boolean estadoSistema) {
        EstadoSistema = estadoSistema;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioBase='" + usuarioBase + '\'' +
                ", usuarioIngresado='" + usuarioIngresado + '\'' +
                ", claveBase='" + claveBase + '\'' +
                ", claveIngresada='" + claveIngresada + '\'' +
                ", EstadoSistema=" + EstadoSistema +
                '}';
    }
}
}
