package segundoSeguimiento.ejercicio8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        // Solicitar el número de horas trabajadas
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        // Crear el objeto Empleado y mostrar el mensaje
        empleado empleado = new empleado(nombre, horasTrabajadas);
        empleado.mostrarMensaje();

        scanner.close();
    }
}
