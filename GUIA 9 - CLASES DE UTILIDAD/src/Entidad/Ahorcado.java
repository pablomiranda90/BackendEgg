/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author pablo
 */

/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas 
y la cantidad jugadas máximas que puede realizar el usuario.
*/
public class Ahorcado {
    
    private String palabra[];
    private int letrasEnc;
    private int jugMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int jugMax) {
        this.palabra = palabra;
        this.jugMax = jugMax;
    }

  
    
    

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEnc() {
        return letrasEnc;
    }

    public void setLetrasEnc(int letrasEnc) {
        this.letrasEnc = letrasEnc;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }
    
    
}
