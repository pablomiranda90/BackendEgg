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
public class EJ8_CuadradoDeAst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el tamaño del cuadrado: ");
        lado = entrada.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}
