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
public class EJ1_Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, suma;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = Leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = Leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los números es: " + suma);
                
    }
    
}
