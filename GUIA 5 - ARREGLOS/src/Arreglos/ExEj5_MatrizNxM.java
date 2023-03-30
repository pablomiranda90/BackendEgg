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
public class ExEj5_MatrizNxM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, m;
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: ");
        n = Leer.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        m=Leer.nextInt();
        
        int [][] Matriz = new int [n][m];
        int suma = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matriz[i][j]=(int)(Math.random()*19);
                System.out.print("[" +Matriz[i][j]+ "]");
                suma = suma + Matriz[i][j];
            }
            System.out.println("");            
        }
        System.out.println("");
        System.out.println("La suma de los elementos es " +suma);
    }
    
}
