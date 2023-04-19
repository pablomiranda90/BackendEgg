/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, 
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
que la persona tiene sobrepeso, y la función devuelve un 1.
 */
/**
 *
 * @author pablo
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static boolean esMayorDeEdad(Persona xx) {
        boolean mayor = xx.getEdad() >= 18;
        return mayor;
    }

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = leer.next();

        System.out.print("Ingrese la edad: ");
        int edad = leer.nextInt();

        System.out.print("Ingrese sexo (H) hombre, (M) mujer, (O) otro: ");
        String sexo = leer.next();
        while (!"H".equalsIgnoreCase(sexo) && !"M".equalsIgnoreCase(sexo) && !"O".equalsIgnoreCase(sexo)) {
            System.out.println("Sexo incorrecto. Ingrese nuevamente: ");
            sexo = leer.next();
        }

        System.out.print("Ingrese peso (kg): ");
        int peso = leer.nextInt();

        System.out.print("Ingrese altura (cm): ");
        int altura = leer.nextInt();

        System.out.println("PERSONA INGRESADA AL SISTEMA");
        System.out.println("----------------------------");
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public static int calcularIMC(Persona xx) {
        if ((xx.getPeso() / Math.pow(xx.getAltura() / 100, 2)) < 20) {            
            return -1;
        } else if ((xx.getPeso() / Math.pow(xx.getAltura() / 100, 2)) > 25) {
            return 1;
        } else {
            return 0;
        }
    }

}
