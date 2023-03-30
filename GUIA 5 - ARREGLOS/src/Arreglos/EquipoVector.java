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
public class EquipoVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Equipo[] = new String[5];
        Scanner Leer = new Scanner(System.in);
        
        for (int i = 0; i<5; i++){
            System.out.println("Ingrese el " +(i+1)+ "° integrante");
            Equipo[i] = Leer.nextLine();
        }
        
        System.out.println("Los integrantes del equipo son: ");
        for (int i = 0; i<5; i++){
            System.out.println("Integrante " +(i+1)+" "+ Equipo[i]);
        }
    }
    
}
