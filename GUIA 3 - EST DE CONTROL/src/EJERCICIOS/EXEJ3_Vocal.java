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
public class EXEJ3_Vocal {

    /*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si 
    se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
    la función equals() de la clase String.
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = Leer.next();
        
        while (letra.length() != 1) {
            System.out.println("Debe ingresar una letra");
            letra = Leer.next();
        }
        
        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
            System.out.println("La letra " +letra+ " es una vocal");
        } else {
            System.out.println("La letra " +letra+ " NO es una vocal");
        }
    }
    
}
