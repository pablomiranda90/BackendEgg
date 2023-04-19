/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class CuentaBancApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria c1 = cbs.crearCuenta();
        String salir;
        int opcion;
        salir = "";

        do {
            System.out.println("---------------MENU---------------");
            System.out.println("1. INGRESAR DINERO");
            System.out.println("2. RETIRAR DINERO");
            System.out.println("3. EXTRACCION RAPIDA");
            System.out.println("4. CONSULTAR SALDO");
            System.out.println("5. CONSULTAR DATOS");
            System.out.println("6. SALIR");

            opcion = leer.nextInt();

            while (opcion < 1 || opcion > 6) {
                System.out.println("Opción inválida. Intente nuevamente");
                opcion = leer.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el dinero");
                    double depo = leer.nextDouble();
                    CuentaBancariaServicio.ingresar(c1, depo);
                    break;

                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    double reti = leer.nextDouble();
                    CuentaBancariaServicio.retirar(c1, reti);
                    break;

                case 3:

                    //CuentaBancariaServicio.extraccionRapida(c1);
                    break;

                case 4:
                    CuentaBancariaServicio.consultarSaldo(c1);
                    break;

                case 5:
                    CuentaBancariaServicio.consultarDatos(c1);
                    break;

                case 6:
                    System.out.println("Desea salir");
                    salir = leer.next();
                    break;
            }

        } while (!"si".equalsIgnoreCase(salir));

    }

}
