/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Rectangulo;

/**
 *
 * @author pablo
 */
public class RectAPPgulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectuno = new Rectangulo(0, 0);

        rectuno.crearRectangulo();

        System.out.println(" ");

        System.out.println("La superficie del rectángulo es " + rectuno.superficie());
        System.out.println("El perímetro del rectángulo es " + rectuno.perimetro());

        System.out.println(" ");

        System.out.println("Veamos el rectángulo representado con * ");
        System.out.println(" ");
        rectuno.dibujarRectangulo();

    }

}
