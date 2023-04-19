/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Producto;

/**
 *
 * @author pablo
 */
public class Stockeame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p1 = new Producto();

        System.out.println("---SISTEMA DE CONTROL DE PRODUCTOS---");
        System.out.println("Crear primer producto");
        p1.crearProducto();
        System.out.println("PRODUCTO CARGADO CON ÉXITO");
        System.out.println("--------------------------");

        //do {
            System.out.println("-----------MENU-----------");
            System.out.println("1. Crear producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Cambiar precio");
            System.out.println("4 Mostrar producto");
            
            
            
       // } while ();
    }

}
