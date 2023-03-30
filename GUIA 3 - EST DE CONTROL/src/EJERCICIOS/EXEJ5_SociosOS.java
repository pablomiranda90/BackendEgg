/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EXEJ5_SociosOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipoSocio;
        float valor = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio A, B o C:");
        tipoSocio = leer.next().charAt(0);
        tipoSocio = Character.toUpperCase(tipoSocio);

        System.out.println("Ingrese costo tratamiento:");
        valor = leer.nextFloat();

        switch (tipoSocio) {
            case 'A':
                System.out.println("Valor Costo, Dto. 50% $" + (valor / 2));
                break;
            case 'B':
                System.out.println("Valor Costo, Dto. 35% $" + (valor - valor * 35 / 100));
                break;
            case 'C':
                System.out.println("A pagar la plata!!!!. $" + valor);
                break;
            default:
                System.out.println("ERROR - Tipo socio Incorrecto.");
        }
    }
    
}
