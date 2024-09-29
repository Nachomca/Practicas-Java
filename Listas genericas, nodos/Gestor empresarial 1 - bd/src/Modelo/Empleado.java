package Modelo;

import java.util.Date;


public class Empleado{
    
    private int numero;
    private String nombre;
    private String apellido;
    private String foto;
    private float sueldo;
    private float sueldoMax;
    private Date fechaAlta ;

    public Empleado(int numero, String nombre, String apellido, String foto, float sueldo, float sueldoMax, Date fechaAlta) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.sueldo = sueldo;
        this.sueldoMax = sueldoMax;
        this.fechaAlta = fechaAlta;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldoMax() {
        return sueldoMax;
    }

    public void setSueldoMax(float sueldoMax) {
        this.sueldoMax = sueldoMax;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    @Override
    public String toString(){
        return nombre+"/"+apellido+"/"+sueldo+"/"+sueldoMax+"/"+fechaAlta;
    }

}
