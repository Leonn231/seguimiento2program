package segundoSeguimiento.ejercicio14;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el género
        System.out.print("Ingrese el género (femenino/masculino): ");
        String genero = scanner.nextLine();

        // Solicitar al usuario la edad
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        // Crear una instancia de la clase AyudaAlcaldia
        AyudaAlcaldia ayuda = new AyudaAlcaldia(genero, edad);

        // Calcular y mostrar el valor recibido
        int valorRecibido = ayuda.calcularAyuda();
        System.out.println("El valor recibido es: $" + valorRecibido);

        scanner.close();
    }
}
