import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinandoNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinado = random.nextInt(50) + 1;
        int intentos = 0;
        boolean adivinado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("EMPEZANDO ADIVINANZA...");
        System.out.println("¡¡Bienvenido al juego de adivinar un numero aleatorio!!...");
        System.out.println("Intenta adivinar un numero entre el 1 al 50 :v");

        while (!adivinado) {
            try {
                System.out.println("Ingresa tu intento(osea tu numero) :");
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario < numeroAdivinado) {
                    System.out.println("El numero es mayor.");
                } else if (numeroUsuario > numeroAdivinado) {
                    System.out.println("El numero es menor.");
                } else {
                    System.out.println("!FELICIDADES¡ lograste adivinar el numero en " +intentos+ " intentos. EZ GGWP");
                    adivinado = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida. Por favor, ingresa un numero.");
                intentos++;
                scanner.next();
            }
        }
        scanner.close();
    }


}
