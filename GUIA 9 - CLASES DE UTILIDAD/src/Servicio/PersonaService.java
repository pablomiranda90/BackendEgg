/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
//Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    /*
    Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
    persona a crear. Retornar el objeto Persona creado.
     */
    public Persona crearPersona() {
        System.out.print("Nombre de la persona: ");
        String nombre = leer.next();
        System.out.print("Año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.print("Dia de nacimiento: ");
        int dia = leer.nextInt();
        Date nacimiento = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, nacimiento);

    }

    /*
    Método calcularEdad que calcule la edad del usuario utilizando el atributo 
    de fecha de nacimiento y la fecha actual.
     */
    public int calcularEdad(Persona nn) {
        Date actual = new Date();
        int edad = actual.getYear() - nn.getNacimiento().getYear();

        if (nn.getNacimiento().getMonth() > actual.getMonth()) {
            edad--;
        } else if (nn.getNacimiento().getMonth() == actual.getMonth() && nn.getNacimiento().getDay() > actual.getDay()) {
            edad--;
        }
        return edad;
    }

    /*
    Método menorQue recibe como parámetro una Persona y una edad. Retorna true 
    si la persona es menor que la edad consultada o false en caso contrario.
     */
    public boolean menorQue(Persona nn, int edad) {

        return (calcularEdad(nn) < edad);
    }

    /*
    Método mostrarPersona que muestra la información de la persona deseada.
     */
    public void mostrarPersona(Persona nn) {
        System.out.println("Nombre: " +nn.getNombre());
        System.out.println("Nacimiento: " +nn.getNacimiento().getDay()+ "/" +nn.getNacimiento().getMonth()+ "/" +nn.getNacimiento().getDay());
        System.out.println("Nacimiento: " +nn.getNacimiento());
    }

}
