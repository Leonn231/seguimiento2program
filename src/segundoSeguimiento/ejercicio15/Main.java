package segundoSeguimiento.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la duración de la membresía
        System.out.print("Ingrese la duración de la membresía (15, 30, o 90 días): ");
        int duracion = scanner.nextInt();

        // Crear una instancia de la clase Gimnasio
        Gimnasio gimnasio = new Gimnasio(duracion);

        // Calcular y mostrar el costo de la membresía
        int costo = gimnasio.calcularCosto();
        if (costo > 0) {
            System.out.println("El costo de la membresía es: $" + costo);
        } else {
            System.out.println("Duración no válida. Por favor ingrese 15, 30, o 90 días.");
        }

        scanner.close();
    }
}

