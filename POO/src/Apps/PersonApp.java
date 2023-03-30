/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Persona;

/**
 *
 * @author pablo
 */
public class PersonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo", 32, "Masculino");
        System.out.println("El nombre de la persona es " + persona1.getNombre() + " y su edad es " + persona1.getEdad() + " años");
        persona1.setEdad(33);
        System.out.println(persona1.getNombre() + " cumplió " + persona1.getEdad() + " años");
    }

}
