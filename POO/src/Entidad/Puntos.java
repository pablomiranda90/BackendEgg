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
public class Puntos {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double distancia;
    Scanner leer = new Scanner(System.in);

    public Puntos() {
    }

    public void crearPuntos() {
        System.out.println("Ingrese las coordenadas del primer punto");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas del segundo punto");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
    }

    public double distancia() {
        distancia = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return distancia;
    }
}
