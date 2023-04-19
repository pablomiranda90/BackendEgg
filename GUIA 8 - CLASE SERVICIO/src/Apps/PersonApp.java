/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author pablo
 */
public class PersonApp {

    /*
    En la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
    todos los métodos para cada objeto, deberá comprobar si la persona está en 
    su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar 
    para cada objeto si la persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
    en distintas variables(arrays), para después calcular un porcentaje de esas 
    4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y 
    cuantos, por encima, y también calcularemos un porcentaje de cuantos son
    mayores de edad y cuantos menores. Para esto, podemos crear unos métodos 
    adicionales.

     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 

        String mayMen[] = new String[4];
        for (int i = 0; i < mayMen.length; i++) {
            mayMen[i] = " ";
        }

        int IMC[] = new int[4];
        for (int i = 0; i < IMC.length; i++) {
            IMC[i] = 111;
        }

        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        cargarPna(p1, mayMen, IMC);

        Persona p2 = ps.crearPersona();
        cargarPna(p2, mayMen, IMC);

        Persona p3 = ps.crearPersona();
        cargarPna(p3, mayMen, IMC);

        Persona p4 = ps.crearPersona();
        cargarPna(p4, mayMen, IMC);

    }

    public static void cargarPna(Persona xx, String[] mayMen, int[] IMC) {

        if (PersonaServicio.esMayorDeEdad(xx)) {
            System.out.println(xx.getNombre() + " es mayor de edad");

            for (int i = 0; i < mayMen.length; i++) {
                if (" ".equals(mayMen[i])) {
                    mayMen[i] = "MAYOR";
                    break;
                }
            }
        } else {
            System.out.println(xx.getNombre() + " no es mayor de edad");

            for (int i = 0; i < mayMen.length; i++) {
                if (" ".equals(mayMen[i])) {
                    mayMen[i] = "MENOR";
                    break;
                }
            }
        }

        switch (PersonaServicio.calcularIMC(xx)) {
            case -1:
                System.out.println(xx.getNombre() + " esta por debajo de su peso ideal");
                for (int i = 0; i < IMC.length; i++) {
                    if (IMC[i] == 111) {
                        IMC[i] = -1;
                        break;
                    }
                }
                break;
            case 0:
                System.out.println(xx.getNombre() + " esta en su peso ideal");
                for (int i = 0; i < IMC.length; i++) {
                    if (IMC[i] == 111) {
                        IMC[i] = 0;
                        break;
                    }
                }
                break;
            case 1:
                for (int i = 0; i < IMC.length; i++) {
                    if (IMC[i] == 111) {
                        IMC[i] = 1;
                        break;
                    }
                }
                break;
        }
    }
}
