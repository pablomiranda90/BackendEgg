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
public class Ej3_1a5Cifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        Scanner Leer = new Scanner(System.in);
        int n, uno, dos, tres, cuatro, cinco;
        System.out.println("Defina tamaño de vector");
        n = Leer.nextInt();
        int vector[] = new int[n];
        
        uno=0;
        dos=0;
        tres=0;
        cuatro=0;
        cinco=0;
                
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*99999);
            if (vector[i] < 10) {
                uno++;
            }else if (vector[i]<100) {
                dos++;
            }else if (vector[i]<1000) {
                tres++;
            }else if (vector[i]<10000) {
                cuatro++;
            }else{
                cinco++;
            }
            
        }
        
        System.out.println("Hay " +uno+ " números de una cifra");
        System.out.println("Hay " +dos+ " números de dos cifras");
        System.out.println("Hay " +tres+ " números de tres cifras");
        System.out.println("Hay " +cuatro+ " números de cuatro cifras");
        System.out.println("Hay " +cinco+ " números de cinco cifras");
  
        System.out.println(" ");
        System.out.println("CONTROL");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" +vector[i]+ "]");
        }
    }
    
}
