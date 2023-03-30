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

public class EJ3_Monedas {

    public static void main(String[] args) {
        double euros;
        String moneda;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Euros a convertir: ");
        euros = entrada.nextDouble();

        System.out.print("A que moneda desea convertirla? ");
        entrada.nextLine();
        moneda = entrada.nextLine();

        conversorMoneda(euros, moneda);

    }

    public static void conversorMoneda(double cantEuros, String moneda) {

        moneda = moneda.toLowerCase();

        switch (moneda) {
            case "libras":
                System.out.println("La conversion a libras es " + (0.86 * cantEuros));
                break;
            case "pesos":
                System.out.println("La conversion a pesos es " + (1.28611 * cantEuros));
                break;
            case "yenes":
                System.out.println("La conversion a yenes es " + (129.852 * cantEuros));
                break;
            default:
                System.out.println("La moneda ingresada es incorrecta.");
        }
    }
}
