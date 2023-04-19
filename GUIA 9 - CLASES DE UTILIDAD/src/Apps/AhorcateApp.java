/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class AhorcateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AhorcadoService as = new AhorcadoService();
        Ahorcado a1 = as.crearJuego();
        boolean contin = true;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String letra;

        do {
            System.out.print("Ingrese una letra: ");
            letra = leer.nextLine();
            contin = as.juego(a1, letra);
            
        } while (contin);       
        

    }
}
