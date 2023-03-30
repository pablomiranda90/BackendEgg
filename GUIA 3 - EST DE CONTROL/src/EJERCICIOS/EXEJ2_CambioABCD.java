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
public class EXEJ2_CambioABCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int A, B, C, D, aux;
        System.out.println("Ingrese valor de A");
        A = Leer.nextInt();
        System.out.println("Ingrese valor de B");
        B = Leer.nextInt();
        System.out.println("Ingrese valor de C");
        C = Leer.nextInt();
        System.out.println("Ingrese valor de D");
        D = Leer.nextInt();
        
        System.out.println("Valor de A: " +A+ ". Valor de B: " +B+ ". Valor de C: " +C+ ". Valor de D: " +D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valor de A: " +A+ ". Valor de B: " +B+ ". Valor de C: " +C+ ". Valor de D: " +D);
        
    }
    
}
