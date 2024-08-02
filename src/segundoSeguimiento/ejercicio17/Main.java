package segundoSeguimiento.ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de copias
        System.out.print("Ingrese el número de copias que desea imprimir: ");
        int cantidadCopias = scanner.nextInt();

        // Crear una instancia de la clase Fotocopiadora
        Fotocopiadora fotocopiadora = new Fotocopiadora(cantidadCopias);

        // Obtener el precio por copia y el costo total
        int precioPorCopia = fotocopiadora.obtenerPrecioPorCopia();
        int costoTotal = fotocopiadora.calcularCostoTotal();

        // Mostrar el precio por copia y el costo total
        System.out.println("El precio por copia es: $" + precioPorCopia);
        System.out.println("El costo total es: $" + costoTotal);

        scanner.close();
    }
}
