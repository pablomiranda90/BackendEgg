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
public class Ej6_MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Magica[][] = new int[3][3];
        Scanner Leer = new Scanner(System.in);
        
        for (int i = 0; i < Magica.length; i++) {            
            System.out.println("Ingrese los números de la fila " +(i+1));            
            for (int j = 0; j < Magica.length; j++) {
               Magica[i][j] = Leer.nextInt();  
               while(Magica[i][j]<1 || Magica[i][j]>9){
                   System.out.println("Los números deben estar entre 1 y 9. Ingrese nuevamente");
                   Magica[i][j] = Leer.nextInt();
               }
            }            
        }
        int nMagico = 0;
        int suma = 0;
        boolean mMagica = true;
        
        for (int i = 0; i < Magica.length; i++) {
            for (int j = 0; j < Magica.length; j++) {
                if (i == 0) {
                    nMagico = nMagico + Magica[i][j];
                } else {
                    suma = suma + Magica[i][j];
                }                
            }
            if (i != 0 && nMagico != suma) {
               mMagica = false;
            }
            suma = 0;
        }
        
        while(mMagica == true){
            
            for (int j = 0; j < Magica.length; j++) {
                for (int i = 0; i < Magica.length; i++) {
                   suma = suma + Magica[i][j];                    
                }
                if (suma != nMagico) {
                    mMagica = false;
                }
                suma = 0;
            }
            
            for (int i = 0; i < Magica.length; i++) {
                suma = suma + Magica[i][i];
            }
            if (suma != nMagico) {
                    mMagica = false;
                }
            suma = 0;
            
            int aux = 2;
            int c = 0;
            
            for (int i = 0; i < Magica.length; i++) {
                suma = suma + Magica[c][aux];
                aux--;
                c++;                
            }
            if (suma != nMagico) {
                    mMagica = false;
                }            
            break;
        }
        if (mMagica == true) {
            System.out.println("La Matriz es mágica");
        } else {
            System.out.println("La Matriz no es mágica");
        }
        System.out.println(" ");
        
        for (int i = 0; i < Magica.length; i++) {
            for (int j = 0; j < Magica.length; j++) {
                System.out.print("[" +Magica[i][j]+ "] ");
               
            }
            System.out.println("[=]" + "[" +nMagico+ "]");
        }
        System.out.println("[=] [=] [=] [=]");
        System.out.println("[" +nMagico+ "]"+"[" +nMagico+ "]"+"[" +nMagico+ "]"+"[" +nMagico+ "]");
    }
    
}
