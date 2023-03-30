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
public class EJ2_EUREKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = Leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
            
        } else {
            System.out.println("Incorrecto");   
        }
    }
    
}
