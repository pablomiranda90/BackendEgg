/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
---Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
---Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
---Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
---Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las
2 posibles soluciones.
---Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
raíz. Es en el caso en que se tenga una única solución posible.
---Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros 
métodos y en caso de no existir solución, se mostrará un mensaje.

Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

 */
/**
 *
 * @author pablo
 */
public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices crearEcuacion(){
        System.out.print("Ingrese el valor de A: ");
        int a = leer.nextInt();
        
        System.out.print("Ingrese el valor de B: ");
        int b = leer.nextInt();
        
        System.out.print("Ingrese el valor de C: ");
        int c = leer.nextInt();
        
        return new Raices(a, b, c);
        
    }

    public static double getDiscriminante(Raices xx) {

        return (Math.pow(xx.getB(), 2) - 4 * xx.getA() * xx.getC());
    }

    public static boolean tieneRaices(Raices xx) {

        return ((Math.pow(xx.getB(), 2) - 4 * xx.getA() * xx.getC()) >= 0);
    }

    public static boolean tieneRaiz(Raices xx) {

        return ((Math.pow(xx.getB(), 2) - 4 * xx.getA() * xx.getC()) == 0);
    }

    public static void obtenerRaices(Raices xx) {

        if (tieneRaices(xx)) {
            System.out.print("Solución 1: ");
            System.out.println(((-xx.getB() + Math.sqrt(Math.pow(xx.getB(), 2)) - (4 * xx.getA() * xx.getC())) / (2 * xx.getA())));
            System.out.print("Solución 2: ");
            System.out.println(((-xx.getB() - Math.sqrt(Math.pow(xx.getB(), 2)) - (4 * xx.getA() * xx.getC())) / (2 * xx.getA())));
        }

    }
    
    public static void obtenerRaiz(Raices xx){
        
        if (tieneRaiz(xx)) {
            
            System.out.print("Solución única: ");
            System.out.println(((-xx.getB() + Math.sqrt(Math.pow(xx.getB(), 2)) - (4 * xx.getA() * xx.getC())) / (2 * xx.getA())));
        }
    }
    
    public static void calcular(Raices xx){
        
        obtenerRaices(xx);
        obtenerRaiz(xx);
        
        if(!tieneRaiz(xx) && !tieneRaices(xx)){
            System.out.println("No existe solución");
        }
        
    }

}
