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
public class Operacion {

    private int num1;
    private int num2;
    private int suma;
    private int resta;
    private int producto;
    private double cociente;
    Scanner leer = new Scanner(System.in);

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
    }

    public int sumar() {
        suma = num1 + num2;
        return suma;
    }

    public int restar() {
        resta = num1 - num2;
        return resta;
    }

    public int multiplicar() {

        if (num1 == 0 || num2 == 0) {
            System.out.println("Multiplicación por Cero es igual a Cero");
            return 0;
        } else {
            System.out.println("La multiplicación de los números es ");
            producto = num1 * num2;
            return producto;
        }

    }

    public double dividir() {

        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else if (num1 == 0) {

            System.out.println("Cero dividido N siempre es cero");
            return 0;
        } else {
            cociente = num1 / num2;
            System.out.println("La división de los números es ");
            return cociente;
            
        }

        
    }

}


