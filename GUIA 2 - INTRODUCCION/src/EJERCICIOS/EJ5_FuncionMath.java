/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EJ5_FuncionMath {
    
    /*
    Escribir un programa que lea un número entero por teclado y muestre por 
    pantalla el doble, el triple y la raíz cuadrada de ese número. 
    Nota: investigar la función Math.sqrt().
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        System.out.println("El doble del número es " +(num *2));
        System.out.println("El triple del número es " +(num *3));
        System.out.println("La raiz cuadrada del número es " +(Math.sqrt(num)));
    }
    
}
