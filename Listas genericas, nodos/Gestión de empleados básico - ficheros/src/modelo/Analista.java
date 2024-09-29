package modelo;

import Controlador.Terminal;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Analista extends Empleado implements Interfaz, Serializable {
    private float plusAnual ;
    private String conducta;
    private String tipo = "Analista";
    
    public Analista (int numero, String nombre, float sueldo, String fechaAlta, float plusAnual, String conducta){
        super(numero, nombre, sueldo, fechaAlta);
        this.plusAnual = plusAnual;
        this.conducta = conducta;
    }

    public float getPlusAnual() {
        return plusAnual;
    }

    public void setPlusAnual(float plusAnual) {
        this.plusAnual = plusAnual;
    }

    public String getConducta() {
        return conducta;
    }

    public void setConducta(String conducta) {
        this.conducta = conducta;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return this.tipo+"*"+this.getNumero()+"*"+this.getNombre()+"*"+this.getSueldo()+"*"+getFechaAlta()
                +"*"+this.plusAnual+"*"+this.conducta;
    }

    @Override
    public boolean cumpleMes() {
       
            
        return true;
    }

    @Override
    public boolean cumpleTrimestre() {
        return true;
    }

    @Override
    public boolean cumpleAño() {
        GregorianCalendar actual = new GregorianCalendar();
        return (this.fechaAlta.get(DIA)<=actual.get(DIA) && this.fechaAlta.get(MES)<=actual.get(MES) 
                && this.fechaAlta.get(ANIO) < actual.get(ANIO));
    }
}
