package Servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Numero de Cuenta ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("DNI Cliente ");
        c1.setDNI(leer.nextInt());
        System.out.println("Saldo Actual ");
        c1.setSaldoActual(leer.nextInt());

        return c1;
    }

    public void ingresar(CuentaBancaria c1) {
        double cantidadIgresar = 0;
        System.out.println(" cantidad a ingresar");
        cantidadIgresar = leer.nextDouble();
        c1.setSaldoActual(cantidadIgresar + c1.getSaldoActual());
        System.out.println("su nuevo saldo es: "+c1.getSaldoActual() );
    }

    public void retirar(CuentaBancaria c1) {

        double cantidadRetirar = 0;
        
        System.out.println("ingrese cantidad a retirar ");
        cantidadRetirar = leer.nextDouble();
        if (cantidadRetirar >c1.getSaldoActual()) {
           
            System.out.println("cantidad a retirar es mayor al saldo ");
        } else {
          c1.setSaldoActual(c1.getSaldoActual()-cantidadRetirar);
            System.out.println("retiraste "+cantidadRetirar+" tu nuevo saldo es "+c1.getSaldoActual());
            
           
            }
        
    }

    public void extraccionRapida(CuentaBancaria c1) {
        double extra;
        System.out.println("ingrese cantidad de  extraccionRapida que no supere el 20% ");
        extra = leer.nextDouble();
        
        if ( extra> c1.getSaldoActual()*0.2) {
           
            System.out.println("el saldo a retir supera el 20 % " + extra);
        } else {
             c1.setSaldoActual(c1.getSaldoActual()-extra);
            System.out.println("retiraste " +extra+ " tu nuevo saldo es " +c1.getSaldoActual());
        }

    }

    public void consultarSaldo(CuentaBancaria c1) {
        
        System.out.println("su saldo actul es " +c1.getSaldoActual());
        
        

    }

    public void consultarDatos(CuentaBancaria c1) {
    
        System.out.println("su numero de cuenta es " +c1.getNumeroCuenta());
        System.out.println("el DNI es " + c1.getDNI());
        System.out.println("el saldo  es " +c1.getSaldoActual());
        
    }

}
