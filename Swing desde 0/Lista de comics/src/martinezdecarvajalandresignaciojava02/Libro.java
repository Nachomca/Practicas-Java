package martinezdecarvajalandresignaciojava02;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Libro {
    
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    private String nombre;
    private int ref;
    private String editorial;
    private GregorianCalendar fecha;
    private float precio;
    
    private static Libro primero = null;
    private static Libro actual = null;
    private Libro siguiente;
    
    //CONSTRUCTOR
    
    public Libro(String nombre, int ref, String editorial, String fecha, float precio)
    {
        this.nombre = nombre;
        this.ref = ref;
        this.editorial = editorial;
        setFecha(fecha);
        this.precio = precio;
        
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

    public static int getRef() {
        return actual.ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public static String getEditorial() {
        return actual.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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

    public static float getPrecio() {
        return actual.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //METODOS
    
    public static void proximo() //PARA PASAR AL SIGUIENTE DE LA LISTA
    {
        actual = actual.siguiente;
    }
    
    public static void anterior() //PARA PASAR AL ANTERIOR DE LA LISTA
    {
        Libro aux = primero;
        
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
