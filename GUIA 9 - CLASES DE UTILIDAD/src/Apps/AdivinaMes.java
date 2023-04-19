/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.MesSecreto;

/**
 *
 * @author pablo
 */
public class AdivinaMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MesSecreto mes = new MesSecreto();

        mes.adivinaMes();

        mes.setMesSecreto(mes.getMeses()[(int) (Math.random() * 12)]);

        System.out.println("-----------------------------------------");
        System.out.println("-----------JUGUEMOS NUEVAMENTE-----------");
        System.out.println("-----------------------------------------");

        mes.adivinaMes();

    }

}
