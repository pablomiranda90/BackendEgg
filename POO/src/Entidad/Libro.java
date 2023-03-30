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
public class Libro {

    Scanner leer = new Scanner(System.in);
    private String ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public void cargarLibro() {
        System.out.println("-------CARGA DE LIBRO-------");
        System.out.print("Ingrese el título del libro: ");
        titulo = leer.next();
        System.out.print("Ingrese el autor del libro: ");
        autor = leer.next();
        System.out.print("Ingrese el número de páginas: ");
        paginas = leer.nextInt();
        System.out.print("Ingrese el número ISBN: ");
        ISBN = leer.next();

        while (ISBN.length() != 13) {
            System.out.print("El número ISBN debe tener 13 cifras. Intente nuevamente: ");
            ISBN = leer.next();
        }

    }

    @Override
    public String toString() {
        return "Libro{" + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    

}
