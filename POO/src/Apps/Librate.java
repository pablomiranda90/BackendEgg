/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Libro;

/**
 *
 * @author pablo
 */
public class Librate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro book1 = new Libro();
        
        book1.cargarLibro();
        
        System.out.println(book1.toString());
        
    }
    
}
