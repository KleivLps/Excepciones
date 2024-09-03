import java.util.Scanner;

public class DividirX0 {
    public static int obtenernumero() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero (que no sea 0): ");
        int numero1 = scanner.nextInt();
        if (numero1 == 0) {
            throw new Exception("El numero no puede ser 0. ");
        }
        return numero1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa un denominador: ");
            int denominador = scanner.nextInt();

            int numerador = obtenernumero();

            int resultado = denominador/numerador;

            System.out.println("El resultado de la division es: " +resultado);
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}
