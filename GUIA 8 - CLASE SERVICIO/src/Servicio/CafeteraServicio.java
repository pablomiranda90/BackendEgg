/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;

/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se 
sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
/**
 *
 * @author pablo
 */
public class CafeteraServicio {

    public static void llenarCafetera(Cafetera xx) {
        System.out.println("Faltan " + (xx.getCapacidadMaxima() - xx.getCapacidadActual()) + "ml para llenar");
        xx.setCapacidadActual(xx.getCapacidadMaxima());
        System.out.println("--------------");
        System.out.println("Cafetera llena");
    }

    public static void servirTaza(Cafetera xx, int taza) {
        if (taza <= xx.getCapacidadActual()) {
            System.out.println("Taza llena");
            xx.setCapacidadActual(xx.getCapacidadActual() - taza);
            System.out.println("Café restante: " + xx.getCapacidadActual() + "ml");
        } else {
            System.out.println("Café insuficiente, se servirán " + xx.getCapacidadActual() + "ml");
            System.out.println("Faltan " + (taza - xx.getCapacidadActual() + "ml para llenar la taza"));
            xx.setCapacidadActual(0);
        }
    }

    public static void vaciarCafetera(Cafetera xx) {
        System.out.println("Descartando " +xx.getCapacidadActual()+ "ml de café");
        xx.setCapacidadActual(0);
        System.out.println("----------------");
        System.out.println("Cafetera vaciada");
    }
    
    public static void agregarCafe(Cafetera xx, int cafe){
        if ((cafe + xx.getCapacidadActual()) > xx.getCapacidadMaxima()) {
            System.out.println("La cantidad agregada excede la capacidad máxima. Se llenará la cafetera");
            xx.setCapacidadActual(xx.getCapacidadMaxima());
            System.out.println("--------------");
            System.out.println("Cafetera llena");
        } else {
            System.out.println("Agregando café");
            xx.setCapacidadActual(cafe + xx.getCapacidadActual());
            System.out.println("-------------");
            System.out.println("Café agregado");
        }
    }

}
