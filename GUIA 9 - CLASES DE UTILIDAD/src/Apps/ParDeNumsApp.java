/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/**
 *
 * @author pablo
 */
public class ParDeNumsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParDeNumerosServicio pn = new ParDeNumerosServicio();
        ParDeNumeros p1 = new ParDeNumeros();
        
        System.out.println("Los números son: ");
        pn.mostrarValores(p1);
        System.out.println("-----------------");
        System.out.println("El número mayor es " + pn.devolverMayor(p1));
        System.out.println("-----------------");
        System.out.println("El mayor elevado al menor es " +pn.calcularPotencia(p1));
        System.out.println("-----------------");
        System.out.println("La raíz cuadrada del menor número es " + pn.calculaRaiz(p1));
    }
    
}
