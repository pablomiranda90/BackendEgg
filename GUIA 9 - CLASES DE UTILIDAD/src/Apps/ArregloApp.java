/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Servicio.ArregloServicio;

/**
 *
 * @author pablo
 */
public class ArregloApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Crear en el Main dos arreglos. El arreglo A de 50 números reales y el 
        //arreglo B de 20 números reales
        ArregloServicio as = new ArregloServicio();

        double A[] = new double[50];
        double B[] = new double[20];
        
        as.inicializarA(A);
        System.out.println("-------------ARREGLO A-------------");
        as.mostrar(A);
        as.ordenar(A);
        
        as.inicializarB(A, B);
        System.out.println("---------ARREGLO A ORDENADO---------");
        as.mostrar(A);
        System.out.println("-------------ARREGLO B-------------");
        as.mostrar(B);

    }

}
