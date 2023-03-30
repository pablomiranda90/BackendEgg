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
public class EXEJ9_RestasSucesivas {

    /*
    Simular la división usando solamente restas. Dados dos números enteros 
    mayores que uno, realizar un algoritmo que calcule el cociente y el residuo 
    usando sólo restas. Método: Restar el dividendo del divisor hasta obtener 
    un resultado menor que el divisor, este resultado es el residuo, y el número 
    de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, cociente;
        cociente = 0;

        System.out.println("Ingrese dos números mayores a uno a dividir");

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        while (num1 < 1) {
            System.out.println("El primer número ingresado es menor a uno. Ingrese otro");
            num1 = leer.nextInt();
        }

        while (num2 < 1) {
            System.out.println("El segundo número ingresado es menor a uno. Ingrese otro");
            num2 = leer.nextInt();
        }
        
        while (num1 >= num2){
            num1 -= num2;
            cociente++;
        }
        
        System.out.println("El cociente es " +cociente+ " y el resto es " +num1);

    }

}
