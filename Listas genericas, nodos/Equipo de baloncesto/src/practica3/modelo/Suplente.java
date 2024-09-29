package practica3.modelo;

public class Suplente extends Jugador{
    
    private int minJugados; //DATO
    private String posicion;
    
    //CONSTRUCTORES
    public Suplente(String nombre, String fecha, int minJugados, float sueldo)
    {
        super(nombre, fecha);
        this.setSueldo(sueldo);
        this.minJugados = minJugados;
    }
    
    public Suplente(String nombre, String fecha, int minJugados, float sueldo, String posicion)
    {
        super(nombre, fecha, sueldo);
        setPosicion(posicion);
        this.minJugados = minJugados;
    }
    
    //GETTER AND SETTER
    public void setMinJugados(int minJugados) {
        this.minJugados = minJugados;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public float getDato() {
        return this.minJugados;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString()
    {
        return this.getNombre() + "|" 
        + this.getFechaAlta() + "|" 
        + this.getSueldo() + "|"
        + this.getSueldoMax() + "|"
        + this.minJugados + "|"
        + this.posicion;
    }
    
}
