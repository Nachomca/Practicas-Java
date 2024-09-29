package practica3.modelo;

public class Titular extends Jugador{
    
    private static int partidos; //DATO
    private String posicion;
    
    //CONSTRUCTORES
    public Titular(String nombre, String fecha, int partidos, float sueldo)
    {
        super(nombre, fecha);
        this.setSueldo(sueldo);
        Titular.partidos = partidos;
    }
    
    public Titular(String nombre, String fecha, int partidos, float sueldo, String posicion)
    {
        super(nombre, fecha, sueldo);
        setPosicion(posicion);
        Titular.partidos = partidos;
    }
    
    //GETTER AND SETTER

    public static void setPartidos(int partidos) {
        Titular.partidos = partidos;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public float getDato() {
        return Titular.partidos;
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
        + Titular.partidos + "|"
        + this.posicion;
    }
    
}
