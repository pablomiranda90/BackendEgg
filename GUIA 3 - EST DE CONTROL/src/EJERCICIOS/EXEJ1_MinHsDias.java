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
public class EXEJ1_MinHsDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int minutos, dias, horas;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos: ");
        minutos = entrada.nextInt();

        if (minutos >= 1440) {

            dias = minutos / 1440;
            horas = (minutos % 1440) / 60;

            System.out.println("Los minutos ingresados equivalen a " + dias + " dias y " + horas + " horas");

        } else if (minutos > 60) {

            horas = minutos / 60;
            System.out.println("Los minutos ingresados equivalen a " + horas + " horas");
        } else {
            System.out.println("Los minutos ingresados son inferiores a una hora");
        }

    }

}
