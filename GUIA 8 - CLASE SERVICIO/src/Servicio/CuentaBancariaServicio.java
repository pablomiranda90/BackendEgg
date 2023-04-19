/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará
al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se 
retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

*/


/**
 *
 * @author pablo
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese número de cuenta bancaria (8 dígitos)");
        int nroCta = leer.nextInt();
        
        while(nroCta < 10000000 || nroCta > 99999999){
            System.out.println("El número de cuenta debe tener 8 dígitos. Ingrese nuevamente");
            nroCta = leer.nextInt();            
        }
        
        System.out.println("Ingrese DNI del cliente");
        long dni = leer.nextLong();
        
        while(dni < 1000000 || nroCta > 99999999){
            System.out.println("El número de DNI debe tener 7 u 8 dígitos. Ingrese nuevamente");
            dni = leer.nextInt();            
        }
        
        System.out.println("Realice su primer depósito para activar la cuenta");
        double saldoActual = leer.nextDouble();
               
        
        return new CuentaBancaria(nroCta, dni, saldoActual);        
    }
    
    public static void ingresar(CuentaBancaria xx, double deposito){
        xx.setSaldoActual(xx.getSaldoActual() + deposito);
        
        System.out.println("Dinero ingresado. Saldo actual $" +xx.getSaldoActual());
        System.out.println("-----------------------------------------");
    }
    
    public static void retirar(CuentaBancaria xx, double retiro){
        
        if (xx.getSaldoActual() < retiro) {
            System.out.println("No hay saldo suficiente. Se entregan $" + xx.getSaldoActual());
            System.out.println("Saldo actual $" +xx.getSaldoActual());
            System.out.println("-------------------");
            xx.setSaldoActual(0);            
        } else {
            System.out.println("Retire su dinero");
            xx.setSaldoActual(xx.getSaldoActual() - retiro);
            System.out.println("----------------");            
        }
    }
    
    public void extraccionRapida(CuentaBancaria xx){
        System.out.println("Ingrese el monto a retirar");
        double retiro = leer.nextDouble();        
        
        while(xx.getSaldoActual()*0.2 < retiro){
            System.out.println("La extracción no puede ser superior al 20% del saldo. Ingrese un monto menor");
            retiro = leer.nextDouble();
        }
        
        if(retiro==0){
            System.out.println("Extracción cancelada");
            System.out.println("--------------------");
        } else {
            xx.setSaldoActual(xx.getSaldoActual() - retiro);
        }       
       
    }
    
    public static void consultarSaldo(CuentaBancaria xx){
        System.out.println("Saldo actual: $" +xx.getSaldoActual());
        System.out.println("-----------------------");
    }
    
    public static void consultarDatos(CuentaBancaria xx){
        xx.toString();
    }
    
}
