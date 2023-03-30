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
public class EXEJ6_AlturaPnas {

    /*Leer la altura de N personas y determinar el promedio de estaturas 
    que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int pnas, contB = 0, contT = 0;
        double altura, altBaja = 0, alTotal = 0;
        System.out.println("De cuántas personas desea ingresar su altura?");
        pnas = Leer.nextInt();

        for (int i = 0; i < pnas; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1));
            altura = Leer.nextDouble();

            if (altura < 1.60) {
                altBaja += altura;
                contB++;
            }

            alTotal += altura;
            contT++;
        }

        System.out.println("El promedio de altura de personas por debajo de 1.60 mts es " + (altBaja / contB) + "mts");
        System.out.println("El promedio total es " + (alTotal / contT) + "mts");
    }

}
