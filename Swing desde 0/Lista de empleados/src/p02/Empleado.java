package p02;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Nacho
 */

public class Empleado {
    
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
   
    //ATRIBUTOS
    private int numero;
    private String nombre;
    private float sueldo;
    private int sueldoMaximo;
    private GregorianCalendar fecha;
    
    //PUNTEROS LISTA
    private static Empleado primero = null;
    private static Empleado actual = null;
    private Empleado siguiente;

    //CONSTRUCTOR
    public Empleado(String nombre, float sueldo, int sueldoMaximo, String fecha) {
        this.numero = (int)(Math.random()*10+1);
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.sueldoMaximo = sueldoMaximo;
        setFecha(fecha);
        this.siguiente = siguiente;
        
        this.siguiente = primero;
        primero = this;
        actual = primero;
    }

    //GET AND SET
    public static String getNombre() {
        return actual.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static float getSueldo() {
        return actual.sueldo;
    }

    public void setSueldo(float sueldo) {
        
        if(sueldo <= this.sueldoMaximo)
            this.sueldo = sueldo;
        else
            System.out.println("El sueldo no puede ser mayor que " + this.sueldoMaximo + ". Repita:");
    }

    public static int getSueldoMaximo() {
        return actual.sueldoMaximo;
    }

    public void setSueldoMaximo(int sueldoMaximo) {
        this.sueldoMaximo = sueldoMaximo;
    }

    public static String getFecha() {
        String aux;
        
        aux = "" + actual.fecha.get(Calendar.DAY_OF_MONTH) + "/" + actual.fecha.get(Calendar.MONTH) + "/" + actual.fecha.get(Calendar.YEAR);
        return aux;
    }

    public void setFecha(String fecha) {
        this.fecha = new GregorianCalendar
        (
            Integer.parseInt(fecha.substring(6, 10)),
            Integer.parseInt(fecha.substring(3, 5)),
            Integer.parseInt(fecha.substring(0, 2))
        );

    }
    
    //METODOS
    @Override
    public String toString()
    {
        return this.getNombre() + "|" 
        + this.getSueldo() + "|"
        + this.getSueldoMaximo();
    }
    
    public static void proximo() //PARA PASAR AL SIGUIENTE DE LA LISTA
    {
        actual = actual.siguiente;
    }
    
    public static void anterior() //PARA PASAR AL ANTERIOR DE LA LISTA
    {
        Empleado aux = primero;
        
        while(aux.siguiente != actual)
        {
            aux = aux.siguiente;
        }
        
        actual = aux;
    }
    
    public static boolean principio() //PARA SABER SI ES EL PRIMERO || PRINCIPIO DE LA LISTA
    {
        return (actual == primero);
    }
    
    public static boolean ultimo() //PARA SABER SI ES EL ULTIMO || FINAL DE LA LISTA
    {
        return (actual.siguiente == null);
    }
}
