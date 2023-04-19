/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author pablo
 */
import Entidad.Cadena;

//Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
public class CadenaServicio {

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
    //tiene la frase ingresada.
    public int mostrarVocales(Cadena c1) {
        int contador = 0;
        char letra;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = c1.getFrase().charAt(i);
            letra = Character.toUpperCase(letra);

            switch (letra) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    contador++;
            }

        }
        return contador;
    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla 
    //por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena c1) {
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
        System.out.println("");
    }

    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
    usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

     */
    public void vecesRepetido(String letra, Cadena c1) {
        int contador = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {

            if ((c1.getFrase().substring(i, i + 1).equals(letra))) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
    }
    
    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la 
    frase que compone la clase con otra nueva frase ingresada por el usuario.
    */

    public boolean compararLongitud(String frase, Cadena c1) {
        boolean resultado = false;

        if (frase.length() == c1.getLongitud()) {
            resultado = true;
        }

        return resultado;
    }

    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase 
    Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    
    public void unirFrases(String frase, Cadena c1) {

        System.out.println(c1.getFrase().concat(frase));

    }
    
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que 
    se encuentren en la frase, por algún otro carácter seleccionado por el 
    usuario y mostrar la frase resultante.
    */

    public void reemplazar(String letra, Cadena c1) {

        for (int i = 0; i < c1.getLongitud(); i++) {

            if (c1.getFrase().charAt(i) == 'a') {
                System.out.print(letra);
            } else {
                System.out.print(c1.getFrase().charAt(i));
            }
        }
        System.out.println("");
    }
    
    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una 
    letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */

    public boolean contiene(String letra, Cadena c1) {
        boolean contiene = false;

        for (int i = 0; i < c1.getLongitud(); i++) {

            if (String.valueOf(c1.getFrase().charAt(i)).equals(letra)) {

                contiene = true;
                break;
            }
        }
        return contiene;
    }

}
