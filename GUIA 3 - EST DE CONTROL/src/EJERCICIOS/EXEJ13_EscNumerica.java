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
public class EXEJ13_EscNumerica {
    public static void main(String[] args) {
        int n,linea;
        linea=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de lineas del arbol numerico: ");
        n=sc.nextInt();
        //n=validarNum(n);
        for (int i = 1; i <= n; i++) {
            linea=linea*10+i;
            System.out.println(linea);
        }
        sc.close();
    }}
