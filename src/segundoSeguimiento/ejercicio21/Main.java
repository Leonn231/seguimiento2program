package segundoSeguimiento.ejercicio21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del sándwich
        System.out.print("Ingrese el tamaño del sándwich (pequeño o grande): ");
        String tamano = scanner.nextLine();

        // Solicitar al usuario que seleccione los ingredientes adicionales
        System.out.print("¿Desea agregar tocino? (true/false): ");
        boolean tocino = scanner.nextBoolean();

        System.out.print("¿Desea agregar jalapeño? (true/false): ");
        boolean jalapeno = scanner.nextBoolean();

        System.out.print("¿Desea agregar pavo? (true/false): ");
        boolean pavo = scanner.nextBoolean();

        System.out.print("¿Desea agregar queso? (true/false): ");
        boolean queso = scanner.nextBoolean();

        // Crear una instancia de la clase SandwichOrder
        SandwichOrder pedido = new SandwichOrder(tamano, tocino, jalapeno, pavo, queso);

        // Calcular y mostrar el costo total
        try {
            int costoTotal = pedido.calcularCosto();
            System.out.println("El costo total del pedido es: $" + costoTotal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
