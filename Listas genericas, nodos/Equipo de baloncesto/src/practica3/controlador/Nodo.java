/*
    AQUI SE GENERAN LOS ELEMENTOS DE LA LISTA, QUE OBJETO CONTIENE, CUAL ES EL ANTERIOR A ESE ELEMENTO Y CUAL ES EL SIGUIENTE.
*/

package practica3.controlador;

public class Nodo {
    
    private Object objeto;
    private Nodo sgt;
    private Nodo ant;
    
    //CONSTRUCTORES
    public Nodo(Object objeto)
    {
        this.objeto = objeto;
    }
    
    public Nodo()
    {
    }

    //GETTER AND SETTER
    public Object getDato() {
        return objeto;
    }

    public void setDato(Object dato) {
        this.objeto = dato;
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
    
    
    
    
    
}
