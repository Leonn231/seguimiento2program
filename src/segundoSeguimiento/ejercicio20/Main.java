package segundoSeguimiento.ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el operador
        System.out.print("Ingrese el operador (Claro, Tigo, Movistar): ");
        String operador = scanner.nextLine();

        // Solicitar al usuario que ingrese la cantidad de minutos internacionales
        System.out.print("Ingrese la cantidad de minutos internacionales consumidos: ");
        int minutosInternacionales = scanner.nextInt();

        // Crear una instancia de la clase OperadorMovil
        OperadorMovil operadorMovil = new OperadorMovil(operador, minutosInternacionales);

        // Calcular y mostrar el costo total
        try {
            int costoTotal = operadorMovil.calcularCostoTotal();
            System.out.println("El costo total es: $" + costoTotal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
