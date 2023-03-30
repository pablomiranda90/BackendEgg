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
public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;
    Scanner leer = new Scanner(System.in);
   

    public Circunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextInt();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area() {
        area = (Math.PI) * radio * radio;
        return area;
    }
    
    public double perimetro() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    
}
