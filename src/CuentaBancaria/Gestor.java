package CuentaBancaria;

import java.util.Scanner;

public class Gestor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria(2000.00);

        try {
            System.out.println("Ingrese la cantidad que deseas retirar: ");
            double cantidad = scanner.nextDouble();

            cuenta.retirarSaldo(cantidad);
        } catch (SaldoInsuficiente e) {
            System.out.println("Error: " +e.getMessage());
        } catch (Exception e){
            System.out.println("Ocurrio un error inesperado: " +e.getMessage());
        } finally {
            System.out.println("Cerrando la aplicacion, hasta pronto...");
            scanner.close();
        }
    }
}
