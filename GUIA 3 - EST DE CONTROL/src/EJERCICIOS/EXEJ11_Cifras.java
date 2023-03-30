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
public class EXEJ11_Cifras {

    /*
    Escribir un programa que lea un número entero y devuelva el número de 
    dígitos que componen ese número. Por ejemplo, si introducimos el número 
    12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
    matemáticamente utilizando el operador de división. Nota: recordar que las 
    variables de tipo entero truncan los números o resultados.

     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, cifras;
        cifras = 0;
        
        System.out.println("Ingresame un número que te tiro un datazo");
        num = leer.nextInt();

        while (num > 0) {
            num = num/10;
            cifras++;
        }
        
        System.out.println("El número tiene " +cifras+ " cifras. Sorprendido?");
    }

}
