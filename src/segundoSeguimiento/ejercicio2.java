package segundoSeguimiento;
import java.util.Date;
public class ejercicio2 {


        String CodCita;
        Date fecha;
        Date hora;
        String consultorio;
        String nombreMedico;
        String nombrePaciente;
        private String centroMedico;

        public String crearCita(){

            boolean cita = true;

            if (cita){
                return "Cita creada";
            }
            else{
                return "No fue posible crear la cita";
            }
        }

        public String consultarDatosCita(){
            return "Datos de cita";
        }

        public void cambiarHora(){
            //Logica cambio de hora
        }

        public String getCodCita() {
            return CodCita;
        }

        public void setCodCita(String codCita) {
            CodCita = codCita;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public Date getHora() {
            return hora;
        }

        public void setHora(Date hora) {
            this.hora = hora;
        }

        public String getConsultorio() {
            return consultorio;
        }

        public void setConsultorio(String consultorio) {
            this.consultorio = consultorio;
        }

        public String getNombreMedico() {
            return nombreMedico;
        }

        public void setNombreMedico(String nombreMedico) {
            this.nombreMedico = nombreMedico;
        }

        public String getNombrePaciente() {
            return nombrePaciente;
        }

        public void setNombrePaciente(String nombrePaciente) {
            this.nombrePaciente = nombrePaciente;
        }

        public String getCentroMedico() {
            return centroMedico;
        }

        public void setCentroMedico(String centroMedico) {
            this.centroMedico = centroMedico;
        }

        @Override
        public String toString() {
            return "CitaMedica{" +
                    "CodCita='" + CodCita + '\'' +
                    ", fecha=" + fecha +
                    ", hora=" + hora +
                    ", consultorio='" + consultorio + '\'' +
                    ", nombreMedico='" + nombreMedico + '\'' +
                    ", nombrePaciente='" + nombrePaciente + '\'' +
                    ", centroMedico='" + centroMedico + '\'' +
                    '}';
        }
    }

