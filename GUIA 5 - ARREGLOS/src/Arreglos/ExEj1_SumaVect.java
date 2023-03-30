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
public class ExEj1_SumaVect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");// \ = alt + 92
        
        System.out.println("Tamaño del vector:");
        
        int n = leer.nextInt();  
        int [] vec = new int [n];
        
        int total = 0;
        System.out.println("Ingresa los numeros");
        for (int i = 0; i < vec.length; i++) {
           
            vec[i]=leer.nextInt();
            
            total += vec[i];
            
        }
        System.out.println("la suma total es:"+total);
       
    }
    
}
