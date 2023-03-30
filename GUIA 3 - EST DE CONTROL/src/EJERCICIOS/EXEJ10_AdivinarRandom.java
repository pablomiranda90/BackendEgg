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
public class EXEJ10_AdivinarRandom {

    /*
    Realice un programa para que el usuario adivine el resultado de una 
    multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
    El programa debe indicar al usuario si su respuesta es o no correcta. 
    En caso que la respuesta sea incorrecta se debe permitir al usuario 
    ingresar su respuesta nuevamente. Para realizar este ejercicio investigue 
    como utilizar la función Math.random() de Java.

     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int aleatorio, num, mUno, mDos;
        
        mUno = (int) (Math.random() * 10);
        mDos = (int) (Math.random() * 10);

        aleatorio = mUno * mDos;
        boolean bandera;
        bandera = false;

        System.out.println("Adivine el número de una multiplicación de dos números entre 0 y 10");

        while (bandera == false) {

            num = leer.nextInt();

            if (num == aleatorio) {
                System.out.println("Correcto, ha adivinado el número");
                bandera = true;
            } else if (num > aleatorio) {
                System.out.println("Incorrecto. El número secreto es menor");
            } else {
                System.out.println("Incorrecto. El número secreto es mayor");
            }
        }
        
    }

}
