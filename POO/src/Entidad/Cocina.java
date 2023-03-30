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
public class Cocina {

    Scanner leer = new Scanner(System.in);
    Scanner ingred = new Scanner(System.in);
    private String[][] receta = new String[20][10];
    private int ing;
    private int fila;

    public Cocina() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                receta[i][j] = " ";
            }
        }
    }

    public void CargarReceta() {

        System.out.println("Ingrese el nombre de la receta");

        for (int i = 0; i < 20; i++) {
            if (" ".equals(receta[i][0])) {
                receta[i][0] = leer.next();
                fila = i;
                break;

            }
        }

        System.out.println("Cuántos ingredientes tiene la receta?");
        ing = leer.nextInt();

        for (int i = 1; i < ing + 1; i++) {
            System.out.println("Ingrese el " + i + "° ingrediente");
            receta[fila][i] = ingred.nextLine();
        }
        System.out.println("Receta de " + receta[fila][0] + " cargada con éxito!");

    }

    public void imprimirLibro() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(receta[i][j] + "-");

            }
            System.out.println("");

        }
    }

    public void buscarReceta(String bRec) {
        boolean bandera;
        bandera = false;

        for (int i = 0; i < 20; i++) {

            if (bRec.equalsIgnoreCase(receta[i][0])) {
                bandera = true;
                System.out.println("Los ingredientes para la receta " + bRec + " son:");
                for (int j = 0; j < 10; j++) {
                    if (!" ".equals(receta[i][j])) {
                        System.out.println(receta[i][j] + " - ");
                    }
                }

            }
        }
        if (!bandera) {
            System.out.println("No se ha encontrado la receta");
        }

    }

    public void buscarIngrediente(String bIng) {
        boolean bandera;
        bandera = false;

        for (int i = 0; i < 20; i++) {
            for (int j = 1; j < 10; j++) {
                if (bIng.equalsIgnoreCase(receta[i][j])) {
                    bandera = true;
                    System.out.println("Se ha encontrado el ingrediente en la receta " + receta[i][0]);
                }
            }
        }
        if (!bandera) {
            System.out.println("No se ha encontrado el ingrediente");
        }

    }
}
