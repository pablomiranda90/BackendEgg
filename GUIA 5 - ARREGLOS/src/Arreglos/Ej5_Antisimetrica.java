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
public class Ej5_Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        int Matriz[][] = new int[3][3];
        int Trasp[][] = new int[3][3];
        Scanner Leer = new Scanner(System.in);
        
        
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println("Ingrese los números de la fila " +(i+1));
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j] = Leer.nextInt();                            
            }             
        }
        System.out.println("MATRIZ ORIGINAL");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {                
                 System.out.print("[" +Matriz[i][j]+ "]");                
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        System.out.println("MATRIZ TRASPUESTA");
        boolean antisimetrica = true;
        
        for (int i = 0; i < Trasp.length; i++) {
            for (int j = 0; j < Trasp.length; j++) {
                Trasp[i][j] = Matriz[j][i];
                 System.out.print("[" +Trasp[i][j]+ "]");
                 
                if ((Trasp[i][j] != (Matriz[i][j] * -1)) && i != j) {
                    antisimetrica = false;
                }
            }
            System.out.println(" ");
        }
        
        if (antisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es anisimétrica");
        }
    }
    
}
