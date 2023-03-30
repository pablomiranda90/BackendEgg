/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author pablo
 */
public class ExEj3_FuncionRellenarImprimir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");// \ = alt + 92

        int [] vec = new int [5]; 
        rellenarVector(vec);
        imprimirVector(vec);
    }
    
    public static void rellenarVector(int [] vec){
        
        for (int i = 0; i < vec.length; i++) {
            vec[i]=(int)(Math.random()*9);
            
        }    
    }
    
    public static void imprimirVector(int [] vec){
    
        for (int i = 0; i < vec.length; i++) {
            System.out.print("["+vec[i]+"]");
            
        }
    
    }
    
}
