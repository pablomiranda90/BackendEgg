/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además 
implementar los siguientes métodos
 */
/**
 *
 * @author pablo
 */
import Entidad.ParDeNumeros;

public class ParDeNumerosServicio {

    //Método mostrarValores que muestra cuáles son los dos números guardados
    public void mostrarValores(ParDeNumeros pn) {
        System.out.println("Numero 1: " + pn.getNum1());
        System.out.println("Numero 2: " + pn.getNum2());
    }

    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(ParDeNumeros pn) {

        return Math.max(pn.getNum1(), pn.getNum2());

    }

   
    /*
    Método calcularPotencia para calcular la potencia del mayor valor de la 
    clase elevado al menor número. Previamente se deben redondear ambos valores
    */
    public double calcularPotencia(ParDeNumeros pn) {

        double num1 = Math.round(pn.getNum1());
        double num2 = Math.round(pn.getNum2());

        return Math.pow(Math.max(num2, num1), Math.min(num2, num1));
    }
    
    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos 
    valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
    absoluto del número.
    */

    public double calculaRaiz(ParDeNumeros pn) {
        double menor = Math.min(pn.getNum1(), pn.getNum2());
        Math.abs(menor);
        return Math.sqrt(menor);
    }

}
