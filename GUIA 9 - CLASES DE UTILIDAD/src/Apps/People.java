/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona pibe = ps.crearPersona();
        
        System.out.println("------------------------");
        System.out.println("La edad de " +pibe.getNombre()+ " es de " +ps.calcularEdad(pibe)+ " años");
        System.out.println("------------------------");
        System.out.println("Ingrese una edad para saber si la persona es menor");
        if (ps.menorQue(pibe, leer.nextInt())) {
            System.out.println("La persona es menor que la edad ingresada");
        } else {
            System.out.println("La persona no es menor que la edad ingresada");
        }
        System.out.println("------------------------");
        ps.mostrarPersona(pibe);
        
    }
    
}
