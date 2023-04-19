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
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos 
una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, 
cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 
5 (cinco), donde se alojarán los nombres de cada alumno
 */
public class Curso {

    Scanner leer = new Scanner(System.in);

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String alumnos[] = new String[5];

    /*
    Un constructor por defecto.
    Un constructor con todos los atributos como parámetro.
    Métodos getters y setters de cada atributo
     */
    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
    alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
    esta información en un arreglo e iterar con un bucle, solicitando en cada 
    repetición que se ingrese el nombre de cada alumno.
     */
    public void cargarAlumnos() {

        for (int i = 0; i < this.alumnos.length; i++) {
            System.out.println("Ingrese el nombre del " + (i + 1) + "° alumno");
            this.alumnos[i] = leer.next();
        }
    }

    /*
    Método crearCurso(): el método crear curso, le pide los valores de los 
    atributos al usuario y después se le asignan a sus respectivos atributos 
    para llenar el objeto Curso. En este método invocamos al método 
    cargarAlumnos() para asignarle valor al atributo alumnos
     */
    public void crearCurso() {

        System.out.print("Ingrese el nombre del curso: ");
        this.nombreCurso = leer.next();
        System.out.print("Ingrese la cantidad de horas por día: ");
        this.cantidadHorasPorDia = leer.nextInt();
        System.out.print("Ingrese la catidad de dias por semana: ");
        this.cantidadDiasPorSemana = leer.nextInt();
        System.out.print("Ingrese turno (M/T): ");
        this.turno = leer.next();
        while (!"M".equals(this.turno) && !"T".equals(this.turno)) {
            System.out.print("Turno incorrecto, ingrese nuevamente: ");
            this.turno = leer.next();
        }
        System.out.print("Ingrese el precio por hora: ");
        this.precioPorHora = leer.nextInt();

        cargarAlumnos();

        System.out.println("CURSO " + this.nombreCurso + " CREADO CON ÉXITO");

    }
    
    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la 
    ganancia en una semana por curso. Para ello, se deben multiplicar la 
    cantidad de horas por día, el precio por hora, la cantidad de alumnos y la 
    cantidad de días a la semana que se repite el encuentro.
    */
    
    public void calcularGananciaSemanal(){
        
        int gananciaTotal = this.cantidadHorasPorDia * this.precioPorHora * this.alumnos.length * this.cantidadDiasPorSemana;
        
        System.out.println("La ganancia total del curso " +this.nombreCurso+ " es de $" +gananciaTotal);
    }
}
