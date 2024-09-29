/*
    AQUI SE GENERAN LOS ELEMENTOS DE LA LISTA, QUE OBJETO CONTIENE, CUAL ES EL ANTERIOR A ESE ELEMENTO Y CUAL ES EL SIGUIENTE.
*/
package Controlador;

/**
 *
 * @author Nacho
 */

public class Nodo <T> {
    
    private T elemento;
    private Nodo <T> sgt;
    private Nodo <T> ant;
    private int indice; //NUMERO DEL EMPLEADO
    
    //CONSTRUCTORES
    public Nodo(T elemento, int i)
    {
        this.elemento = elemento;
        this.indice = i;
    }
    
    public Nodo()
    {
    }

    //GET AND SET
    public T getDato() {
        return elemento;
    }

    public void setDato(T dato) {
        this.elemento = dato;
    }

    public Nodo getSgt() {
        return this.sgt;
    }

    public void setSgt(Nodo sgt) {
        this.sgt = sgt;
    }

    public Nodo getAnt() {
        return this.ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int i) {
        this.indice = i;
    }
    
}
