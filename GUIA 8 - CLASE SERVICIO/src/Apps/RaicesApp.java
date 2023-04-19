/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author pablo
 */
public class RaicesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RaicesServicio rs = new RaicesServicio();
        Raices ec1 = rs.crearEcuacion();

        System.out.println("Discriminante: " +RaicesServicio.getDiscriminante(ec1));
        
        if (RaicesServicio.tieneRaices(ec1)) {
            System.out.println("Tiene dos soluciones");
        } else {
            System.out.println("No tiene dos soluciones");
        }
        
        if (RaicesServicio.tieneRaiz(ec1)) {
            System.out.println("Tiene una solución");
        } else {
            System.out.println("Tiene más o menos de una solución");
        }
        
        
        RaicesServicio.obtenerRaices(ec1);
        RaicesServicio.obtenerRaiz(ec1);        
        RaicesServicio.calcular(ec1);

    }
}
