/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Puntos;

/**
 *
 * @author pablo
 */
public class DistaPun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos p1 = new Puntos();
        
        p1.crearPuntos();
        
        System.out.println("La distancia entre los puntos ingresados es " +p1.distancia());
        
    }
    
}
