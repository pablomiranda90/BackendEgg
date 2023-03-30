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
public class Rectangulo {

    private int base;
    private int altura;
    private int superficie;
    private int perimetro;
    Scanner leer = new Scanner(System.in);

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base del rectángulo en centímetros");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo en centímetros");
        altura = leer.nextInt();
    }

    public int superficie() {
        superficie = base * altura;
        return superficie;
    }

    public int perimetro() {
        perimetro = 2 * base + 2 * altura;
        return perimetro;
    }

    public void dibujarRectangulo() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                if (i == 0 || j == 0 || i == altura - 1 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");

        }
    }
}
