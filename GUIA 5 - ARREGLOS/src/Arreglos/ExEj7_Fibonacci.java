/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ExEj7_Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    //Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese N de Fibonacci");
        n = Leer.nextInt();
        int [] fibo = new int[n];
        
        Fibonacci(fibo);        
    }
    
    public static void Fibonacci(int [] fibo) {
        
        int a = 0;
        int b = 1;
        int c = 1;
     
        for (int i = 0; i < fibo.length; i++) {            
            fibo[i] = c;
            c = a + b;
            a = b;
            b = c;                
        }
        
        for (int i = 0; i < fibo.length; i++) {
            System.out.print("[" +fibo[i]+ "]");            
        }
    }    
}
