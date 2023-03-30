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
public class ExEj6_SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] Sopa = new String[20][20];
        Scanner Leer = new Scanner(System.in);
        String palabra;
        boolean vacio;
        int fila, columna, aux;
        
        InicializarMatriz(Sopa);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la " +(i+1)+ "° palabra de 3 a 5 letras");
            palabra = Leer.nextLine();
            while(palabra.length()<3 || palabra.length() > 5){
                System.out.println("La palabra debe tener entre 3 y 5 letras. Ingrese nuevamente");
                palabra = Leer.nextLine();
            }
            
                    do{
                    vacio = true;
                    fila = (int)(Math.random()*19);
                    columna = (int)(Math.random() * (19 - palabra.length()));
                    aux = columna;
                    
                    for (int k = 0; k < palabra.length(); k++) {
                        if (!" ".equals(Sopa[fila][aux])) {
                            vacio = false;
                        }
                        aux++;
                    }
                    
                    if (vacio) {
                        for (int k = 0; k < palabra.length(); k++) {
                            Sopa[fila][columna] = palabra.substring(k, k+1);
                            columna++;
                        }
                    }
                    } while(vacio = false);                   
            
        }
        
        LlenarMatriz(Sopa);
        
        for (int i = 0; i < Sopa.length; i++) {
            for (int j = 0; j < Sopa.length; j++) {
                System.out.print("[" +Sopa[i][j]+ "]");                
            }
            System.out.println(" ");
        }
    }
    
    public static void InicializarMatriz(String [][] Sopa){
        
        for (int i = 0; i < Sopa.length; i++) {
            for (int j = 0; j < Sopa.length; j++) {
                Sopa[i][j]= " ";                
            }        
        }        
    }
    
    public static void LlenarMatriz(String [][] Sopa){
        
        for (int i = 0; i < Sopa.length; i++) {
            for (int j = 0; j < Sopa.length; j++) {
                if (" ".equals(Sopa[i][j])) {
                    Sopa[i][j]= String.valueOf((int)(Math.random()*9));
                }                
            }            
        }
    }
}
