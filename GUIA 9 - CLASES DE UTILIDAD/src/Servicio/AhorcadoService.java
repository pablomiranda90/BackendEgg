/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
//Definir los siguientes métodos en AhorcadoService:
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int encontradas;
    private int faltantes;

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
    máxima. Con la palabra del usuario, pone la longitud de la palabra, como la 
    longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
    quedando cada letra de la palabra en un índice del vector. Y también, guarda 
    la cantidad de jugadas máximas y el valor que ingresó el usuario.
     */
    public Ahorcado crearJuego() {
        System.out.print("Ingrese una palabra: ");
        String p1 = leer.nextLine();

        String palabra[] = new String[p1.length()];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = p1.substring(i, i + 1);
        }

        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        int jMax = leer.nextInt();

        faltantes = palabra.length;
        encontradas = 0;
        

        return new Ahorcado(palabra, jMax);
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length.
     */
    public void longitud(Ahorcado xx) {
        System.out.println("Longitud de la palabra: " + xx.getPalabra().length);
    }

    /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y 
    busca si la letra ingresada es parte de la palabra o no. También informará 
    si la letra estaba o no.
     */
    public void buscar(Ahorcado xx, String letra) {
        boolean esta = false;

        for (int i = 0; i < xx.getPalabra().length; i++) {

            if (xx.getPalabra()[i].equals(letra)) {
                esta = true;
                break;
            }
        }

        if (esta) {
            System.out.println("La letra se encuentra en la palabra!");
        } else {
            System.out.println("La letra no se encuentra en la palabra");
        }
    }

    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
    muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
    además deberá devolver true si la letra estaba y false si la letra no estaba, 
    ya que, cada vez que se busque una letra que no esté, se le restará uno a sus 
    oportunidades.
     */
    public boolean encontradas(Ahorcado xx, String letra) {

        boolean esta = false;

        for (int i = 0; i < xx.getPalabra().length; i++) {

            if (xx.getPalabra()[i].equals(letra)) {
                esta = true;
                System.out.println("La letra esta el la posición " + (i + 1));
                encontradas++;
                faltantes--;
            }
        }
        System.out.println("Letras encontradas: " + encontradas + ". Letras faltantes: " + faltantes);
        if (!esta) {
            xx.setJugMax(xx.getJugMax() - 1);
        }

        return esta;
    }

    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
     */
    public void intentos(Ahorcado xx) {

        System.out.println("Le quedan " + xx.getJugMax() + " intentos");
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos 
    previamente mencionados e informará cuando el usuario descubra toda la palabra 
    o se quede sin intentos. Este método se llamará en el main.
     */
    public boolean juego(Ahorcado xx, String letra) {

        boolean continuar = true;
        longitud(xx);
        buscar(xx, letra);
        encontradas(xx, letra);
        intentos(xx);

        if (xx.getJugMax() == 0) {
            System.out.println("Se ha quedado sin intentos. La palabra era " + Arrays.toString(xx.getPalabra()));
            continuar = false;
        } else if (encontradas == xx.getPalabra().length) {
            System.out.println("Ha adivinado la palabra! " + Arrays.toString(xx.getPalabra()));
            continuar = false;
        }

        return continuar;

    }
    

}
