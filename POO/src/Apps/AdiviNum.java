/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class AdiviNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here4
        Scanner leer = new Scanner(System.in);
        Juego j1 = new Juego();
        
        System.out.println("BIENVENIDO AL ADIVINADOR DE NÚMEROS");
        System.out.println("-----------------------------------");
        int inten;
        System.out.println("Primero, defina la cantidad de intentos");
        inten = leer.nextInt();
        System.out.println("-----------------------------------");
        
        j1.iniciar_juego(inten);
        
    }
    
}
