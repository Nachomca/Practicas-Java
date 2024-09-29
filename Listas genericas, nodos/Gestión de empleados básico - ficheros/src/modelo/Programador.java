package modelo;

import Controlador.Terminal;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Programador extends Empleado implements Interfaz, Serializable{
    private float sueldoExtra;
    private int proyectosRealizados;
    private String tipo = "Programador";
    
    public Programador (int numero, String nombre, float sueldo, String fechaAlta, float sueldoExtra, int proyectosRealizados){
        super(numero, nombre, sueldo, fechaAlta);
        this.sueldoExtra = sueldoExtra;
        this.proyectosRealizados = proyectosRealizados;
        
        
    }

    public float getSueldoExtra() {
        return sueldoExtra;
    }

    public void setSueldoExtra(float sueldoExtra) {
        this.sueldoExtra = sueldoExtra;
    }

    public int getProyectosRealizados() {
        return proyectosRealizados;
    }

    public void setProyectosRealizados(int proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    @Override
    public String toString() {
        return this.tipo+"*"+this.getNumero()+"*"+this.getNombre()+"*"+this.getSueldo()+"*"+getFechaAlta()
                +"*"+this.sueldoExtra+"*"+this.proyectosRealizados;
    }
    
    
    @Override
    public boolean cumpleMes() {
       GregorianCalendar actual = new GregorianCalendar();
       return (this.fechaAlta.get(DIA)<=actual.get(DIA) && this.fechaAlta.get(MES)<actual.get(MES));      
    }

    @Override
    public boolean cumpleTrimestre() {
        return true;
    }

    @Override
    public boolean cumpleAño() {
        return true;
    }

}
