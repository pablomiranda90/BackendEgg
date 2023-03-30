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
public class EJ4_AInicial {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palabra");
        frase = Leer.nextLine();
        if("a".equals(frase.substring(0, 1))){
            System.out.println("CORRECTO");
        }else{
            System.out.println("Incorrecto");
        };    
    }
    
}
/*
Escriba un programa que pida una frase o palabra
y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir “INCORRECTO”. Nota: investigar la función 
Substring y equals() de Java.
*/