/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de 
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto 
a través de un método constructor.
 */
/**
 *
 * @author pablo
 */
public class Raices {

    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Raices() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    

}
