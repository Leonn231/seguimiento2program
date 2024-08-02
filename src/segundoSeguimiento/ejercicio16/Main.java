package segundoSeguimiento.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los tres ángulos del triángulo
        System.out.print("Ingrese el primer ángulo: ");
        int angulo1 = scanner.nextInt();

        System.out.print("Ingrese el segundo ángulo: ");
        int angulo2 = scanner.nextInt();

        System.out.print("Ingrese el tercer ángulo: ");
        int angulo3 = scanner.nextInt();

        // Crear una instancia de la clase Triangulo
        Triangulo triangulo = new Triangulo(angulo1, angulo2, angulo3);

        // Verificar y mostrar si el triángulo es válido
        if (triangulo.esValido()) {
            System.out.println("El triángulo es válido.");
        } else {
            System.out.println("El triángulo no es válido.");
        }

        scanner.close();
    }
}
