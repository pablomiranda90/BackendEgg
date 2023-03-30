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
public class ExEj4_NotasPromedioMio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        double [] promedios = new double[3]; //son 10, pero a modo de prueba 3
        double ptp, stp, pint, sint, promedio;
        int apro = 0, desa = 0;
        
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("ALUMNO " +(i+1));
            System.out.print("Nota primer trabajo práctico: ");
            ptp = Leer.nextDouble();
            System.out.print("Nota segundo trabajo práctico: ");
            stp = Leer.nextDouble();
            System.out.print("Nota primer integrador: ");
            pint = Leer.nextDouble();
            System.out.print("Nota segundo integrador: ");
            sint = Leer.nextDouble();
            promedios[i] = ptp*0.1 + stp*0.15 + pint*0.25 + sint*0.5;
            if (promedios[i] >= 7) {
                apro++;
            } else {
                desa++;
            }
        }
        System.out.println("");
        System.out.println("CANTIDAD DE APROBADOS: " +apro);
        System.out.println("CANTIDAD DE DESAPROBADOS: " +desa);
    }
    
}
