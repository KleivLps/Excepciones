package CuentaBancaria;

public class CuentaBancaria{
private double saldo;

public CuentaBancaria(double saldoInicial) {
    this.saldo = saldoInicial;
}

public void retirarSaldo(double cantidad ) throws SaldoInsuficiente {
    if (cantidad > saldo) {
        throw new SaldoInsuficiente("Saldo insuficiente para realizar el retiro de dinero.");
    }
    saldo -= cantidad;
    System.out.println("Retiro realizado con Exito. Su saldo actual es de: " +saldo);
}
public double getSaldo() {
    return saldo;
}
    }