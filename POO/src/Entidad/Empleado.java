/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser 
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/


/**
 *
 * @author pablo
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
        Scanner leer = new Scanner(System. in);        
        System.out.println("Ingrese el nombre del empleado");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del empleado");
        edad = leer.nextInt();
        System.out.println("Ingrese el salario del empleado");
        salario = leer.nextDouble();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void calcular_aumento(){
        if (edad > 30) {
            salario *= 1.3;            
        } else {
            salario *= 1.05;
        }
    }
    
    
    
    
}
