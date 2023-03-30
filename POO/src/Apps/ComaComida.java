/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Cocina;
import java.util.Scanner;

/**
 *
 * @author pablo5
 */
public class ComaComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cocina recetario = new Cocina();
        Scanner leer = new Scanner(System.in);
        String salida;
        String opc;
        String bRec;
        String bIng;

        System.out.println("----BIENVENIDO AL LIBRO DE RECETAS----");
        System.out.println("--Vamos a cargar la primera receta--");
        System.out.println("------------------------------------");

        recetario.CargarReceta();

        do {
            System.out.println("------------------------------------");
            System.out.println("----------------MENU----------------");
            System.out.println("Seleccione una opción");
            System.out.println("1. Cargar receta");
            System.out.println("2. Buscar receta");
            System.out.println("3. Buscar ingrediente");
            System.out.println("4. Salir");
            
            opc = leer.next();
            
            while(!"1".equals(opc) && !"2".equals(opc) && !"3".equals(opc) && !"4".equals(opc)){
                System.out.println("Opción inválida. Intente nuevamente");
                opc = leer.next();
            }
            
            salida = "";

            switch (opc){
                case "4":
                    salida = leer.next();
                    break;
                case "1":
                    System.out.println("------------------------------------");
                    recetario.CargarReceta();
                    break;
                case "2":
                    System.out.println("------------------------------------");
                    System.out.println("Ingrese el nombre de la receta que desea buscar");
                    bRec = leer.next();
                    recetario.buscarReceta(bRec);
                    break;
                case "3":
                    System.out.println("------------------------------------");
                    bIng = leer.next();
                    recetario.buscarIngrediente(bIng);
            } 
                
                
            } while (!"si".equalsIgnoreCase(salida));

        }


    }
