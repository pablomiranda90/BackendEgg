/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author pablo
 */
public class Ej4_Traspuesta {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
    A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int Matriz[][] = new int[4][4];
        int Trasp[][] = new int[4][4];
        
        System.out.println("MATRIZ ORIGINAL");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j] = (int) (Math.random() * 9);
                System.out.print("[" +Matriz[i][j]+ "]");                
            } 
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("MATRIZ TRASPUESTA");
        
        for (int i = 0; i < Trasp.length; i++) {
            for (int j = 0; j < Trasp.length; j++) {
                Trasp[i][j] = Matriz[j][i];
                 System.out.print("[" +Trasp[i][j]+ "]");
                
            }
            System.out.println(" ");
        }
    }
    
}
