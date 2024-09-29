package Modelo;

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
    
    public Empleado(String nombre, float sueldo, int sueldoMaximo, String fecha) {
        this.numero = (int)(Math.random()*100+1);
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.sueldoMaximo = sueldoMaximo;
        setFecha(fecha);
    }
    
    //GET AND SET
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
        
        if(sueldo <= this.sueldoMaximo)
            this.sueldo = sueldo;
        else
            System.out.println("El sueldo no puede ser mayor que " + this.sueldoMaximo + ". Repita:");
    }

    public int getSueldoMaximo() {
        return sueldoMaximo;
    }

    public void setSueldoMaximo(int sueldoMaximo) {
        this.sueldoMaximo = sueldoMaximo;
    }

    public String getFecha() {
        String aux;
        
        aux = "" + fecha.get(Calendar.DAY_OF_MONTH) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.YEAR);
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
        return this.getNumero() + "|"
        + this.getNombre() + "|"
        + this.getFecha() + "|"
        + this.getSueldo() + "|"
        + this.getSueldoMaximo();
    }
}
