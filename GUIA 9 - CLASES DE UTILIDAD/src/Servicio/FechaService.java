/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pablo
 */

/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase 
FechaService, en paquete Servicios, que tenga los siguientes métodos:
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);

    /*
    Método fechaNacimiento que pregunte al usuario día, mes y año de su naci-
    miento. Luego los pase por parámetro a un nuevo objeto Date. El método debe 
    retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     */
    public Date fechaNacimiento() {
        System.out.println("Ingrese el año de su nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);
    }

    /*
    Método fechaActual que cree un objeto fecha con el día actual. Para esto 
    usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
    El método debe retornar el objeto Date.
     */
    public Date fechaActual() {
        return new Date();
    }

    /*
    Método diferencia que reciba las dos fechas por parámetro y retorna la 
    diferencia de años entre una y otra (edad del usuario)
     */
    public int diferencia(Date fN, Date fA) {
        int edad = fA.getYear() - fN.getYear();
        
        if (fA.getMonth() < fN.getMonth()) {
            edad--;
        } else if (fA.getMonth() == fN.getMonth() && fA.getDay() < fN.getDay()) {
            edad--;
        }
        return edad;
    }
}
