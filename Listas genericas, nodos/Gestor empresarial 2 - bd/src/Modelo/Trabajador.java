package Modelo;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nacho y Jorge
 */

public class Trabajador {
    
    //ATRIBUTOS
    private int numero;
    private int numEmp;
    private String nombre;
    private Date fecha;
    private float sueldo;
    private String foto;

    //CONSTRUCTOR
    public Trabajador()
    {
    }
    
    public Trabajador(int numero, int numEmp, String nombre, Date fecha, float sueldo, String foto) {
        this.numero = numero;
        this.numEmp = numEmp;
        this.nombre = nombre;
        this.fecha = fecha;
        this.sueldo = sueldo;
        this.foto = foto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    //METODOS
    @Override
    public String toString()
    {
        return this.getNumero() + "|"
        + this.getNumEmp() + "|"
        + this.getNombre() + "|"
        + this.getFecha() + "|"
        + this.getSueldo();
    }
    
}
