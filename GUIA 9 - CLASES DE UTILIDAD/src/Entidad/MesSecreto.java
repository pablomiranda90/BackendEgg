/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author pablo
 */

/*
Crea una clase en Java donde declares una variable de tipo array de Strings que 
contenga los doce meses del año, en minúsculas. A continuación, declara una 
variable mesSecreto de tipo String, y hazla igual a un elemento del array 
(por ejemplo, mesSecreto = mes[9]
 */
public class MesSecreto {

    private final String meses[] = new String[12];
    private String mesSecreto;
    Scanner leer = new Scanner(System.in);

    public MesSecreto() {
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";

        mesSecreto = meses[(int) (Math.random() * 11)];
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }
    
    

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    /*
    El programa debe pedir al usuario que adivine el mes secreto. Si el usuario 
    acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar 
    adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
    Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
    No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
    ¡Ha acertado!
     */
    
    public void adivinaMes(){
                
        System.out.print("Adivine el mes secreto: ");
        String mes = leer.next();
        
        while(!mes.equals(mesSecreto)){
            System.out.print("No ha acertado. Intente nuevamente: ");
            mes = leer.next();
        }
        
        System.out.println("HA ACERTADO! EL MES SECRETO ES " +mesSecreto.toUpperCase());
        
    }
}
