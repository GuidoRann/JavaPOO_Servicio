package Entidades;


public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
        this.saldoActual = 150000;
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = 150000;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}
