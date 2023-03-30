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
public class EXEJ4_NrosRomanos {

    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 
    1 y 10 y se muestre su equivalente en romano.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int num;
        String romano = null;
        System.out.println("Ingrese un número entre 1 y 10");
        num = Leer.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("El número debe estar entre 1 y 10. Ingrese nuevamente");
            num = Leer.nextInt();
        }

        switch (num) {
            case 1:
                romano = "I";
                break;
            case 10:
                romano = "X";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
        }
        
        System.out.println("El equivalente del número " +num+ " en romano es " +romano);
    }

}
