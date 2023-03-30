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
public class EXEJ8_MultiploCinco {
    
    /*
    Escriba un programa que lea números enteros. Si el número es múltiplo de 
    cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
    cantidad de números pares y la cantidad de números impares. Al igual que 
    en el ejercicio anterior los números negativos no deben sumarse. Nota: 
    recordar el uso de la sentencia break.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int num, par, impar, total;
        
        par = 0;
        impar = 0;
        total = 0;
        
        do {
            System.out.println("Ingrese un número (múltiplo de 5 / fin programa)");
            num = Leer.nextInt();
            
            if (num % 5 != 0 && num >= 0) {
                if (num % 2 == 0) {
                    par++;
                    total++;
                } else {
                    impar++;
                    total++;
                }
            }
            
        } while(num % 5 != 0);
        
        System.out.println("Se ingresaron " +total+ " números, " +par+ " pares y " +impar+ " impares");
    }
    
}
