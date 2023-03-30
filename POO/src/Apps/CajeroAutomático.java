/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class CajeroAutomático {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cuenta c1 = new Cuenta();
        String opcion;
        String salir;
        salir = "";
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("--------MENU--------");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Cambiar Titular");
            System.out.println("4. Salir");

            opcion = leer.nextLine();

            while (!"1".equals(opcion) && !"2".equals(opcion) && !"3".equals(opcion) && !"4".equals(opcion)) {
                System.out.println("Opción inválida. Ingrese nuevamente");
                opcion = leer.nextLine();
            }

            switch (opcion) {
                case "1":
                    c1.retirar_dinero();
                    break;
                case "2":
                    System.out.println("Su saldo es: $" +c1.getSaldo());
                    break;
                case "3":
                    System.out.print("Ingrese el nuevo titular: ");
                    c1.setTitular(leer.next());
                    System.out.println("Nuevo titular definido");
                    break;
                case "4":
                    System.out.println("Desea salir?");
                    salir = leer.next();

            }

        } while (!"si".equalsIgnoreCase(salir));

    }

}
