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
public class EJ7_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DISPOSITIVO RS232. INICIANDO");
        System.out.println(" ");
        Scanner Leer = new Scanner(System.in);
        String cadena;
        int bien, mal;
        bien = 0;
        mal = 0;
        System.out.println("Ingrese los envíos");
        do {
            cadena = Leer.nextLine();

            if ("X".equals(cadena.substring(0, 1)) && "O".equals(cadena.substring(4, 5)) && cadena.length() == 5) {
                System.out.println("Correcto");
                bien++;
            } else if (!"&&&&&".equals(cadena)) {
                System.out.println("Incorrecto");
                mal++;
            }

        } while (!"&&&&&".equals(cadena));
        System.out.println("Cantidad de entradas correctas: " + bien);
        System.out.println("Cantidad de entradas incorrectas: " + mal);
    }

}
