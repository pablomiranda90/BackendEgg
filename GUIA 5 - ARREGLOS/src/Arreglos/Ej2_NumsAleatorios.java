/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej2_NumsAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int tam, max, busca, cont;
       
        System.out.println("Defina el tamaño del vector");
        tam = Leer.nextInt();
        int Aleatorios[] = new int[tam];
        System.out.println("Defina el máximo aleatorio");
        max = Leer.nextInt();
        
        for (int i = 0; i < tam; i++) {
            Aleatorios [i] = (int) (Math.random() * max);
            
        }
        
        
        System.out.println("Ingrese un número a buscar en el vector");
        busca = Leer.nextInt();
        
        cont = 0;
        for (int i = 0; i < tam; i++) {
            if (Aleatorios[i] == busca) {
                System.out.println("El número buscado se encuentra en la posición " +i);
                cont++;
            }
        }
        
        if (cont == 0) {
            System.out.println("El número ingresado no se encuentra en el vector");
            
        } else if (cont>1) {
            System.out.println("El número ingresado se repite " +cont+ " veces");
        }
        
        System.out.println("Vector para control");
        for (int i = 0; i < tam; i++) {
            System.out.print("[" +Aleatorios[i]+ "]");
            
        }
    }
    
}
