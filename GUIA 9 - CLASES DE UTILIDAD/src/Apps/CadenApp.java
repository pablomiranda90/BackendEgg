/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class CadenApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CadenaServicio cs = new CadenaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase");
        Cadena c1 = new Cadena(leer.next());

        System.out.println("-------------------");
        System.out.println("La frase ingresada tiene " + cs.mostrarVocales(c1) + " vocales");
        System.out.println("-------------------");
        cs.invertirFrase(c1);
        System.out.println("-------------------");
        System.out.println("Ingrese un caracter a buscar");
        cs.vecesRepetido(leer.next(), c1);
        System.out.println("-------------------");
        System.out.println("Ingrese una frase para comparar longitud");
        if (cs.compararLongitud(leer.next(), c1)) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
        System.out.println("-------------------");
        System.out.println("Ingrese frase a concatenar");
        cs.unirFrases(leer.next(), c1);
        System.out.println("-------------------");
        System.out.println("Ingrese un caracter para reemplazar las [a]");
        cs.reemplazar(leer.next(), c1);
        System.out.println("-------------------");
        System.out.println("Ingrese un caracter a buscar en la frase");
        if (cs.contiene(leer.next(), c1)) {
            System.out.println("La frase contiene el caracter ingresado");
        } else {
            System.out.println("La frase no contiene el caracter ingresado");
        }

    }

}
