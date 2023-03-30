/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;

/**
 *
 * @author pablo
 */
import java.util.Scanner;

public class EJ4_Primos {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado no es primo");
        }

    }

    public static boolean esPrimo(int numero) {
        boolean primo = false;
        int cantDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cantDivisores++;
            }
        }

        if (cantDivisores == 2) {
            primo = true;
        }

        return primo;
    }

}
