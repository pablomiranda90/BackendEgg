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
public class EJ1_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int num1, num2, opc;
        System.out.println("Ingrese dos números");
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();

        System.out.println("Seleccione la operación que desea realizar");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicación");
        System.out.println("4. división");

        opc = Leer.nextInt();

        while (opc < 1 || opc > 4) {
            System.out.println("La opción es inválida, intente nuevamente");
            opc = Leer.nextInt();
        }

        switch (opc) {
            case 1:
                System.out.println("La suma de los números es " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los números es " + restar(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicación de los números es " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("La división de los números es " + dividir(num1, num2));
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;

    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;

    }

    public static int multiplicar(int num1, int num2) {
        int multip;
        multip = num1 * num2;
        return multip;
    }

    public static double dividir(int num1, int num2) {
        double dividir;
        dividir = num1 / num2;
        return dividir;
    }
}
