/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Cancionero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cancion c1 = new Cancion();
        System.out.print("Ingrese título de la canción: ");
        c1.setTitulo(leer.nextLine());
        System.out.print("Ingrese el autor de la canción: ");
        c1.setAutor(leer.nextLine());
        System.out.println(" ");
        System.out.println("Canción: " +c1.getTitulo()+ ". Autor: " +c1.getAutor());
        
        
        
    }
    
}
