import java.util.Scanner;

public class Saludo {
    public static void saludar() throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.length() < 2) {
                throw new Exception("El nombre debe tener al menos 2 caracteres.");
            }
            System.out.println("Hola, " +nombre+ "!!!");
        } finally {
            System.out.println("Cerrando scanner...");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        try {
            saludar();
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}
