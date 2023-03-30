/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Empleado;

/**
 *
 * @author pablo
 */
public class Salariate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1 = new Empleado();
        
        System.out.println("--------------------------------");
        System.out.println("---EMPLEADO CARGADO CON ÉXITO---");
        System.out.println("--------------------------------");
        
        emp1.calcular_aumento();
        
        System.out.println("EMPLEADO: " +emp1.getNombre());
        System.out.println("EDAD: " +emp1.getEdad());
        System.out.println("SALARIO CON PLUS POR EDAD: $" +emp1.getSalario() );
    }
    
}
