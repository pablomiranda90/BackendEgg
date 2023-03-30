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
public class EJ5_SumaLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int num, suma, lim;
        System.out.println("Ingrese un número límite");
        lim = Leer.nextInt();
        suma = 0;
        do{
            System.out.println("Ingrese número a sumar");
            num = Leer.nextInt();
            suma += num;
        } while (suma<lim);
        System.out.println("Se superó el límite");
            
    }   
    /*
    Escriba un programa en el cual se ingrese un valor limite positivo, 
    y a continuacion solicite numeros al usuario hasta que la 
    suma de los numeros introducidos supere el limite inicial.
    */
}
