/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    private int num1;
    private int num2;
    private int intentos;
    private boolean bandera;

    public Juego() {
        num1 = 0;
        num2 = 0;
    }

    public void iniciar_juego(int inten) {
        System.out.println("JUGADOR NÚMERO 1. INGRESE UN NÚMERO ENTRE 1 Y 100");
        num1 = leer.nextInt();
        System.out.println("JUGADOR NÚMERO 2. ADIVINE EL NÚMERO. TIENE " + inten + " INTENTOS PARA HACERLO");

        intentos = 1;
        do {
            System.out.println("Intento " + intentos);
            num2 = leer.nextInt();
            bandera = false;

            if (num1 == num2) {
                System.out.println("CORRECTO. ADIVINÓ EN " + intentos + " INTENTOS. EL NÚMERO ERA " + num1);
                bandera = true;
            } else if (num1 > num2) {
                if (intentos < inten) {
                    System.out.println("Incorrecto. El número a adivinar es mayor. Le quedan " + (inten - intentos) + " intentos");
                }
                intentos++;
            } else {
                if (intentos < inten) {
                    System.out.println("Incorrecto. El número a adivinar es menor. Le quedan " + (inten - intentos) + " intentos");
                }
                intentos++;

            }

        } while (!bandera && intentos <= inten);

        if (!bandera) {
            System.out.println("Se han agotado los intentos. El número era " + num1);
        }

        num1 = 0;
        num2 = 0;
    }

}
