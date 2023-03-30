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
public class T_Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();
        
        Multiplo(num1, num2);
        
    }
    
    public static void Multiplo(int num1, int num2) {
        
        if(num1 % num2 == 0){
            System.out.println("El número " +num2+ " es múltiplo del número " +num1);
        } else {
            System.out.println("El número " +num2+ " NO es múltiplo del número " +num1);
        }
        
    }
    
}
