package segundoSeguimiento.ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("¿La computadora emite un pitido al iniciarse? (true/false): ");
        boolean emitePitido = scanner.nextBoolean();


        System.out.print("¿El disco duro gira? (true/false): ");
        boolean discoDuroGira = scanner.nextBoolean();


        Computadora computadora = new Computadora(emitePitido, discoDuroGira);


        String estado = computadora.determinarEstado();
        System.out.println("Estado de la computadora: " + estado);

        scanner.close();
    }
}
