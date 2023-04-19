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
public class Producto {

    /*
    Crear una clase llamada Producto que contenga los siguientes atributos: 
    nombre, código, stock y precio. A continuación crear los siguientes métodos:
- Método constructor vacio y constructor con todos los atributos pasados por parámetro
- Método get y set para cada atributo
- Método crearProducto(): pide los datos al usuario y lo guarda en los diferentes atributos
- Método venderProducto(): pide al usuario que ingrese una cantidad del producto y 
    lo mismo se debe restar del atributo stock
- Método cambiarPrecio(): pide al usuario un nuevo precio y lo asigna al atributo
- Método mostrarProducto(): mostrar el nombre, código, stock y precio del producto
     */
    private String nombre;
    private String codigo;
    private int stock;
    private int precio;

    public Producto() {
    }

    public Producto(String nombre, String codigo, int stock, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void crearProducto() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del pruducto: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese el código del producto: ");
        codigo = leer.next();

        while (codigo.length() != 12) {
            System.out.print("El código debe contener 12 dígitos. Ingrese nuevamente: ");
            codigo = leer.next();
        }
        System.out.print("Ingrese el stock: ");
        stock = leer.nextInt();
        System.out.print("Ingrese el precio: ");
        precio = leer.nextInt();
    }

    public void venderProducto(int cant) {
        Scanner leer = new Scanner(System.in);

        while (cant < stock) {
            System.out.println("No hay stock suficiente, ingrese una cantidad menor o cero para salir. Stock: " + stock);
            cant = leer.nextInt();
        }
        stock -= cant;
        if (cant == 0) {
            System.out.println("Operación cancelada");
        } else {
            System.out.println("Venta realizada");
        }
    }
    
    public void cambiarPrecio(){
        System.out.println("Ingrese nuevo precio");
        Scanner leer = new Scanner(System.in);
        precio = leer.nextInt();
        System.out.println("Precio actualizado");
    }
    
    public void mostrarProducto(){
        System.out.println("Producto: " +nombre);
        System.out.println("Código: " +codigo);
        System.out.println("Stock: " +stock);
        System.out.println("Precio: $" +precio);
    }

}
