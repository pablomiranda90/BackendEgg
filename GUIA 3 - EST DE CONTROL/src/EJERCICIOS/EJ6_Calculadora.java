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
public class EJ6_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int num1, num2, opc;
        String salir;
        salir = "N";
        do {
            System.out.println("Ingrese dos números");
            num1 = Leer.nextInt();
            num2 = Leer.nextInt();

            System.out.println("MENU: Seleccione la opción deseada");
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opc = Leer.nextInt();

            while (opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5) {
                System.out.println("La opción es inválida. Ingrese nuevamente");
                opc = Leer.nextInt();
            }
            switch (opc) {
                case 1:
                    System.out.println("La suma de los números " + num1 + " y " + num2 + " es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números " + num1 + " y " + num2 + " es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números " + num1 + " y " + num2 + " es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división de los números " + num1 + " y " + num2 + " es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? S/N");
                    salir = Leer.next();
                    while (!"N".equals(salir) && !"S".equals(salir)) {
                        System.out.println("La opción es inválida. Ingrese nuevamente");
                        salir = Leer.next();
                    }

            }

        } while (!"S".equals(salir));
    }

}
