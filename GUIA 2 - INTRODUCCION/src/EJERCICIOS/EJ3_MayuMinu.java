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
public class EJ3_MayuMinu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner Leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        frase = Leer.nextLine();
        System.out.println("la frase en mayúscula es " + frase.toUpperCase());
        System.out.println("la frase en minúscula " + frase.toLowerCase());
         
    }
    
}
