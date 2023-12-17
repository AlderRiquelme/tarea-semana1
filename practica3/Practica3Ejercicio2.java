import java.util.Scanner;

public class Practica3Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tabla, result;

        System.out.println( " Quem   tabla deseas mostrar ? ");

        tabla = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            result = tabla * i;
            System.out.println("Tabla " + tabla + " por " + i + " es: " + result);
        }

        // Cierra el Scanner al final del programa
        scanner.close();
    }
}
