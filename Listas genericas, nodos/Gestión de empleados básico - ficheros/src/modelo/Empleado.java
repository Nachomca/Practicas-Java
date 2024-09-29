package modelo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import Controlador.Terminal;
import java.io.Serializable;

public abstract class Empleado  implements Serializable{
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    protected int numero;
    protected transient String nombre;
    protected float sueldo;
    protected static float sueldoMax = 10000;
    protected GregorianCalendar fechaAlta = new GregorianCalendar();

    public Empleado(int numero, String nombre, float sueldo, String fechaAlta) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
        setFechaAlta(fechaAlta);
    }
    
    


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
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

    public String getFechaAlta() {
        String aux;
        
        aux= ""+ this.fechaAlta.get(Calendar.DAY_OF_MONTH) + "/" + (this.fechaAlta.get(Calendar.MONTH)+1) + "/" + this.fechaAlta.get(Calendar.YEAR);
        return aux;
    }
    
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = new GregorianCalendar(
                Integer.parseInt(fechaAlta.substring(6,10)),
                Integer.parseInt(fechaAlta.substring(3,5)) -1,
                Integer.parseInt(fechaAlta.substring(0,2))
                
        );
    }
    
    public static float getSueldoMax() {
        return sueldoMax;
    }

    public static void setSueldoMax(float sueldoMax) {
        Empleado.sueldoMax = sueldoMax;
    }
    
    @Override
    public abstract String toString();
    
    /*public int getDiaFecha(){
        System.out.println("Entra en getDiaFecha");
        return Integer.parseInt(
          Terminal.parseDate(this.fechaAlta).substring(0,2)); 
    } 
    
    public int getMesFecha(){
        System.out.println("Entra en getMesFecha");
        return Integer.parseInt(
          Terminal.parseDate(this.fechaAlta).substring(3,5));           
    } 
    
    public int getAñoFecha(){
        System.out.println("Entra en getAñoFecha");
        return Integer.parseInt(
          Terminal.parseDate(this.fechaAlta).substring(6,10));           
    } */
}
