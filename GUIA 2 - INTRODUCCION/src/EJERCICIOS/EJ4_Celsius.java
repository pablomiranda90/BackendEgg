package EJERCICIOS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EJ4_Celsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int celsius;
        int farenh;
        System.out.println("Ingrese los grados celsius");
        celsius = Leer.nextInt();

        System.out.println("Los farenheit equivalentes son: " +(32 + (9 * celsius / 5)));               
                
    }
    
}
