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
public class Ej1_100num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = new int[100];
        
        for(int i=0; i<100; i++){
            nums[i] = i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(nums[i]);
            
        }
    }
    
}
