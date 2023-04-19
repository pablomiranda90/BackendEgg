/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cafetera c1 = new Cafetera();
        int opcion;

        System.out.println("Ingrese la capacidad en ml de la cafetera");
        c1.setCapacidadMaxima(leer.nextInt());

        do {
            System.out.println("---------------MENU---------------");
            System.out.println("1. LLENAR CAFETERA");
            System.out.println("2. SERVIR TAZA");
            System.out.println("3. VACIAR CAFETERA");
            System.out.println("4. AGREGAR CAFE");
            System.out.println("5. APAGAR");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    CafeteraServicio.llenarCafetera(c1);
                    break;

                case 2:
                    System.out.println("Ingrese la capacidad de la taza");
                    int taza = leer.nextInt();
                    CafeteraServicio.servirTaza(c1, taza);
                    break;

                case 3:
                    CafeteraServicio.vaciarCafetera(c1);
                    break;

                case 4:
                    System.out.println("Ingrese la cantidad de café a agregar");
                    int cafe = leer.nextInt();
                    CafeteraServicio.agregarCafe(c1, cafe);
                    break;

                case 5:
                    System.out.println("HASTA PRONTO!");
                    break;
            }
        } while (opcion != 5);

    }

}
