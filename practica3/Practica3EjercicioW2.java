import java.util.Scanner;
public class Practica3EjercicioW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String usuarioCorrecto = "admin";
        int pin;
        int pinCorrecto = 1234567;
        int correcto = 0;
        System.out.println("Bienvenido al sistema de inicio de sesión");
        while (correcto <= 0){
            System.out.println("Introduce tu nombre de usuario:");
            usuario=scanner.nextLine();

            System.out.print("Ingrese pin: ");
            pin=scanner.nextInt();


            if ((usuario.equals(usuarioCorrecto)) && (pin == pinCorrecto)){
                correcto = 1;
            }
            System.out.println("usuario y/o pin incorrecto"); 
            scanner.nextLine();

        }
        System.out.println("Bienvenido al sistema");
        scanner.close();
    }
}
