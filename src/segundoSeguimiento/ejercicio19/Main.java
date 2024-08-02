package segundoSeguimiento.ejercicio19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de modelo del automóvil
        System.out.print("Ingrese el número de modelo de su automóvil: ");
        int modelo = scanner.nextInt();

        // Crear una instancia de la clase Automovil
        Automovil automovil = new Automovil(modelo);

        // Verificar y mostrar si el automóvil es defectuoso
        if (automovil.esDefectuoso()) {
            System.out.println("El automóvil está defectuoso, llevar a garantía.");
        } else {
            System.out.println("Su automóvil no está defectuoso.");
        }

        scanner.close();
    }
}
