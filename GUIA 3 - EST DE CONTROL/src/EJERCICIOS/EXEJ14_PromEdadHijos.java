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
public class EXEJ14_PromEdadHijos {

    /*
    Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
    cantidad de hijos. Escriba un programa que pida la cantidad de familias y 
    para cada familia la cantidad de hijos para averiguar la media de edad de 
    los hijos de todas las familias.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int f, h, edad, totalEdad, cantH;
        totalEdad = 0;
        cantH = 0;

        System.out.println("Ingrese la cantidad de familias");
        f = leer.nextInt();

        for (int i = 0; i < f; i++) {
            System.out.println("Ingrese la cantidad de hijos de la " + (i + 1) + "° familia");
            h = leer.nextInt();

            for (int j = 0; j < h; j++) {
                System.out.println("Ingrese la edad del " + (j + 1) + "° hijo");
                edad = leer.nextInt();
                totalEdad += edad;
                cantH++;
            }
        }
        
        System.out.println("El promedio de edad de los " +cantH+ " niños ingresados es de " +(totalEdad/cantH)+ " años");
    }

}
