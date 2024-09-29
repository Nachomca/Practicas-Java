package Modelo;

import java.sql.Date;

/**
 *
 * @author Nacho y Jorge
 */

public class Empresa {
    
    private int numero;
    private String nombre;
    private Date fecha;
    private String contraseña;
    
    public Empresa()
    {}

    public Empresa(int numero, String nombre, Date fecha, String contraseña) {
        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.contraseña = contraseña;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
