package segundoSeguimiento.ejercicio13;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        // Crear una instancia de la clase NumeroMayor
        NumeroMayor numeroMayor = new NumeroMayor(numero1, numero2, numero3);

        // Encontrar y mostrar el número mayor
        int mayor = numeroMayor.encontrarMayor();
        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
