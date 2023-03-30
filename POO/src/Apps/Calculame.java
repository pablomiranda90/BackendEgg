/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Calculame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String opcion;
        Operacion op1 = new Operacion();
        
        op1.crearOperacion();
        
        System.out.println("Los números ingresados son " + op1.getNum1() + " y " + op1.getNum2());
        
        System.out.println("Desea modificarlos? SI/NO");
        opcion = leer.next();
        
        while (!"SI".equalsIgnoreCase(opcion) && !"NO".equalsIgnoreCase(opcion)) {
            System.out.println("Ingrese SI/NO");
            opcion = leer.next();
        }
        
        if ("SI".equalsIgnoreCase(opcion)) {
            System.out.println("Ingrese los números nuevamente: ");
            op1.setNum1(leer.nextInt());
            op1.setNum2(leer.nextInt());
        }
        
        System.out.println("La suma de los números es " +op1.sumar());
        System.out.println("La resta de los números es " +op1.restar());       
        
        System.out.println(op1.multiplicar());
        System.out.println(op1.dividir());
        
    }
    
}
