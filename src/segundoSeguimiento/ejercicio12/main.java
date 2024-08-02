package segundoSeguimiento.ejercicio12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las calificaciones de las cinco materias
        System.out.print("Ingrese la calificación de Física: ");
        double fisica = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Química: ");
        double quimica = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Biología: ");
        double biologia = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Matemáticas: ");
        double matematicas = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Informática: ");
        double informatica = scanner.nextDouble();

        // Crear una instancia de la clase Calificacion
        notas calificacion = new notas(fisica, quimica, biologia, matematicas, informatica);

        // Calcular y mostrar el promedio y la calificación
        double promedio = calificacion.calcularPromedio();
        System.out.println("El promedio es: " + promedio);
        System.out.println(calificacion.determinarCalificacion());

        scanner.close();
    }
}