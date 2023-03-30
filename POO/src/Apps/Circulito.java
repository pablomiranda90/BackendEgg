/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Circulito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Circunferencia circulo = new Circunferencia();
        
        System.out.println("El radio ingresado es " + circulo.getRadio());
        
        System.out.println("Inserte nuevamente el radio o si lo desea modifíquelo");
        
        circulo.setRadio(leer.nextDouble());
        
        System.out.println("El radio es " + circulo.getRadio());
        
        System.out.println("El área del círculo es " +circulo.area());
        
        System.out.println("El perímetro del círculo es " +circulo.perimetro());
        
    }
    
}
