/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.
*/

/**
 *
 * @author pablo
 */
public class Cuenta {
    private int saldo;
    private String titular;
    Scanner leer = new Scanner(System.in);

    public Cuenta() {
        System.out.println("------CREAR NUEVA CUENTA------");
        System.out.println("Ingrese titular de la cuenta");
        titular = leer.nextLine();
        System.out.println("Ingrese el saldo de la cuenta");
        saldo = leer.nextInt();
        System.out.println("--------CUENTA CREADA--------");
    }
    
    public void retirar_dinero(){
        int monto;
        System.out.println("--------RETIRAR DINERO--------");
        System.out.println("Ingrese la cantidad de dinero a retirar");
        monto = leer.nextInt();
        
        while(monto > saldo){
            System.out.println("No hay saldo disponible. Ingrese una cantidad menor");
            System.out.println("Saldo actual: $" +saldo);
            monto = leer.nextInt();
        }
        
        System.out.println("Retire su dinero");
        saldo -= monto;
        
    }

    public int getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
}
