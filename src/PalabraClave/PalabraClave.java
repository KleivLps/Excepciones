package PalabraClave;

import java.util.Scanner;

public class PalabraClave {
    private String clave;

    public void ingresarPalabraClave() throws Excepciones, Cantidad, LetraEquivocada {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra clave: ");
        clave = scanner.nextLine();

        if (clave.length() < 8) {
            throw new Excepciones("La palabra clave debe tener al menos 8 caracteres. ");
        }

        int ContadorNumeros = 0;
        for (char c: clave.toCharArray()) {
            if (Character.isDigit(c)) {
                ContadorNumeros++;
            }
        }
        if (ContadorNumeros != 4) {
            throw new Cantidad("La palabra clave debe contener exactamente 4 numeros. ");
        }
        if (!clave.contains("z")) {
            throw new LetraEquivocada("La palabra clave debe contener la letra 'z'. ");
        }
        System.out.println("¡La palabra es valida!");
        scanner.close();
    }
}
