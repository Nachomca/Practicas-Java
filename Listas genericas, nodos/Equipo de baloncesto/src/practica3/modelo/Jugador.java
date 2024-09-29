package practica3.modelo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import practica3.controlador.Terminal;

public abstract class Jugador {

    final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    private String nombre;
    private float sueldo;
    private static float sueldoMax = 2000;
    private GregorianCalendar fechaAlta = new GregorianCalendar();
    
    
    //CONSTRUCTORES
    public Jugador(String nombre, String fecha)
    {
        this.nombre = nombre;
        //this.fechaAlta.set(fechaAlta.get(Calendar.YEAR), fechaAlta.get(Calendar.MONTH), fechaAlta.get(Calendar.DAY_OF_MONTH));
        setFechaAlta(fecha);
    }
    
    public Jugador(String nombre, String fechaAlta, float sueldo)
    {
        this(nombre, fechaAlta);
        this.sueldo = sueldo;
    }
    
    public Jugador()
    {
    }
    
    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public static float getSueldoMax() {
        return sueldoMax;
    }

    public static void setSueldoMax(float sueldoMax) {
        Jugador.sueldoMax = sueldoMax;
    }

    public String getFechaAlta() {
        String aux;
        
        aux = "" + fechaAlta.get(Calendar.DAY_OF_MONTH) + "/" + (fechaAlta.get(Calendar.MONTH)+1) + "/" + fechaAlta.get(Calendar.YEAR);
        return aux;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = new GregorianCalendar
        (
            Integer.parseInt(fechaAlta.substring(6, 10)),
            Integer.parseInt(fechaAlta.substring(3, 5)) -1,
            Integer.parseInt(fechaAlta.substring(0, 2))
        );
    }
    
     public int getDiaFecha() {
        return Integer.parseInt(
                Terminal
                        .parseDate(this.fechaAlta)
                        .substring(0,2));
    }
    
    public int getMesFecha() {
        return Integer.parseInt(
                Terminal
                        .parseDate(this.fechaAlta)
                        .substring(3,5));
    }
    
    public int getAñoFecha() {
        return Integer.parseInt(
                Terminal
                        .parseDate(this.fechaAlta)
                        .substring(6,10));
    } 
    
    public abstract float getDato();
    
    public abstract String toString();    
    
}
