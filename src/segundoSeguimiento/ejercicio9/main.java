package segundoSeguimiento.ejercicio9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        double numeroIngresado = scanner.nextDouble();

        // Crear una instancia de la clase Numero
        Numero numero = new Numero(numeroIngresado);

        // Determinar y mostrar si el número es positivo, negativo o cero
        System.out.println(numero.determinarPositivoNegativo());

        scanner.close();
    }
}