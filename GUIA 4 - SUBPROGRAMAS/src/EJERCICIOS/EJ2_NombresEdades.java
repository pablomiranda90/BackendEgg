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
public class EJ2_NombresEdades {

    /*
    Diseñe una función que pida el nombre y la edad de N personas e imprima 
    los datos de las personas ingresadas por teclado e indique si son mayores 
    o menores de edad. Después de cada persona, el programa debe preguntarle 
    al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
    ingrese la palabra “No”.

     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String salir;

        do {
            
            Personas();
            System.out.println("Desea Ingresar otra persona? (NO = SALIR)");
            salir = leer.nextLine();

        } while (!"no".equalsIgnoreCase(salir));

    }
    
    public static void Personas(){
        String nombre;
        int edad;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese la edad de la persona");
        edad = leer.nextInt();
        
        if (edad < 18) {
            System.out.println(nombre+ " tiene " +edad+ " años. Es menor de edad");
        } else {
            System.out.println(nombre+ " tiene " +edad+ " años");
        }
     
        
        
    }

}
