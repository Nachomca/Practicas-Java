//Version 14/11/2021
package Controlador;

import modelo.*;

public class Practica4 {


    public static void main(String[] args) {
        
        //PARA PROBAR LA LISTA       
        Lista <Jugador > lista1= new Lista<Jugador>();
        
        Jugador jugador1 = new Jugador("Pepe", "10/12/2021", 10);
        lista1.crearNodo(jugador1, 1);
        
        Jugador jugador2 = new Jugador("Juan", "11/12/2021", 11); 
        lista1.crearNodo(jugador2, 2);
        
        Jugador jugador3 = new Jugador("Jose", "12/12/2021", 12); 
        lista1.crearNodo(jugador3, 3);
        
        Jugador jugador4 = new Jugador("Paco", "13/12/2021", 13); 
        lista1.crearNodo(jugador4, 4);

        for(Nodo <Jugador> aux = lista1.primero(); aux != null; aux = aux.getSgt())
        {
            System.out.println("Nodo: "+ aux.getIndice() + " " + aux.getDato().toString());
            lista1.siguiente(); 
        }
        
        //PARA PROBAR LOS FICHEROS
        /*ControlFicheros Ficheros = new ControlFicheros();
        
        //Ficheros.creaFichero(lista);
        //System.out.println("Fichero creado");
        lista = Ficheros.leeFichero();
        System.out.println("Fichero leido");
        
        for(Nodo <Jugador> aux = lista.primero(); aux != null; aux = aux.getSgt())
        {
            System.out.println("Nodo: "+ aux.getIndice() + " " + aux.getDato().toString());
            lista.siguiente(); 
        }*/
        
        //PARA PROBAR LA LISTA CON EL MODELO
        Lista <Empleado> lista = new Lista<Empleado>();
        
        Analista ana1 = new Analista(1, "Pepe", 1000f, "23/10/2020", 0.5f, "Buena gente");
        lista.crearNodo(ana1, ana1.getNumero());
        Programador pro1 = new Programador(2, "Juan", 1000f, "23/09/2021", 0.5f, 5);
        lista.crearNodo(pro1, pro1.getNumero());
        Analista ana2 = new Analista(3, "Jose", 1000f, "23/10/2020", 0.5f, "Buena gente");
        lista.crearNodo(ana2, ana2.getNumero());
        Programador pro2 = new Programador(4, "Paco", 1000f, "23/09/2021", 0.5f, 5);
        lista.crearNodo(pro2, pro2.getNumero());
        
        for(Nodo <Empleado> aux = lista.primero(); aux != null; aux = aux.getSgt())
        {
            System.out.println("Nodo: "+ aux.getIndice() + " " + aux.getDato().toString());
            lista.siguiente(); 
        }
        
        if(ana1.cumpleAño())
            System.out.println("Ana Ha cumplido un año");
        else
            System.out.println("Ana No ha cumplido na");
        
        if(pro1.cumpleMes())
            System.out.println("Pro Ha cumplido un mes");
        else
            System.out.println("Pro No ha cumplido na");
        
        for(int i = 0; i < 20; i++)
            System.out.println();
        
    }
    
}

class Jugador
{
    String nombre;
    String fecha;
    int sueldo;
    
    public Jugador(String nombre, String fecha, int sueldo)
    {
        this.nombre = nombre;
        this.fecha = fecha;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return this.getNombre()+"*"+this.getFecha()+"*"+this.getSueldo();
    }
    
}
