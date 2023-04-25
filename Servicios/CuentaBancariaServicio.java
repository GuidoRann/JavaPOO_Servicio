package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el numero de cuenta");
        int NumeroCuenta = consola.nextInt();

        System.out.println("Ingrese su DNI");
        long DniCliente = consola.nextLong();

        return new CuentaBancaria(NumeroCuenta, DniCliente);
    }

    public void ingresar(CuentaBancaria cuenta) {
        System.out.print("Indique el monto desea ingresar: ");
        double monto = consola.nextDouble();
        cuenta.setSaldoActual((cuenta.getSaldoActual() + monto));
    }
    
    public void retirar(CuentaBancaria cuenta){
        System.out.print("Ingrese el monto a retirar: ");
        double monto = consola.nextDouble();
        if (cuenta.getSaldoActual() >= monto) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
            System.out.println("Se retiro correctamente el dinero");
            System.out.println("Usted acaba de retirar: $" + monto );
        } else {
            System.out.println("El saldo que desea retirar es insuficiente");
            System.out.println("Usted acaba de retirar: $" + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        System.out.print("Extracción rápida solo puede retirar hasta el 20%"
                        + "\n Su saldo actual es: $" + cuenta.getSaldoActual() + "\n\n"
                        + "Ingrese el monto a retirar >> $");
        double monto = consola.nextDouble();
        if (monto <= cuenta.getSaldoActual()*0.2) {
            cuenta.setSaldoActual(cuenta.getSaldoActual()- monto);
            System.out.println("Ha retirado correctamente $" + monto);
        }else{
            System.out.println("Extraccion denegada, solo puede retirar el 20");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su salgo actual es: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Su numero de cuenta es: " + cuenta.getNumeroCuenta());
        System.out.println("El DNI asociado a la cuenta es: " + cuenta.getDniCliente());
        System.out.println("El saldo actual en la cuenta es: " + cuenta.getSaldoActual());
    }
}
