/*
    ESTA ES LA LISTA DE NODOS. AVANZA Y RETROCEDE EN LA LISTA, SE OBTIENE LA INFORMACION DEL NODO Y SE INSERTA O BORRA UN NODO NUEVO
*/

package Controlador;

/**
 *
 * @author Nacho
 */

import Modelo.Empleado;

public class Lista <T>{
    
    private Nodo <T> inicial;
    private Nodo <T> actual;
    
    public Lista()
    {
        inicial = null;
        actual = null;
    }
    
    //METODO PARA AVANZAR EN LA LISTA
    public void siguiente()
    {
        actual = actual.getSgt();
    }
    
    //METODO PARA RETROCEDER EN LA LISTA
    public void retrocede()
    {
        actual = actual.getAnt();
    }
    
    //METODO PARA DEVOLVER EL PRIMERO
    public Nodo primero()
    {
        return inicial;
    }
    
    //METODO PARA DEVOLVER EL ULTIMO
    public Nodo ultimo()
    {
        while(actual.getSgt() != null)
            actual = actual.getSgt();
        
        return actual;
    }
    
    //METODO PARA DEVOLVER EL OBJETO QUE CONTIENE EL NODO
    public T extraerObjeto()
    {
        return actual.getDato();
    }
    
    //METODO PARA SABER SI LA LISTA ESTA VACIA
    public boolean vacia()
    {
        return inicial == null;
    }
    
    //METODO PARA VOLVER AL PRINCIPIO CUANDO LA LISTA CONTIENE OBJETOS
    public void principio()
    {
        actual = inicial;
    }
    
    //METODO PARA DEVOLVER EL NODO ACTUAL Y SABER DONDE ESTAMOS
    public Nodo getActual()
    {
        return this.actual;
    }
    
    //METODO PARA ELIMINAR UN NODO DE LA LISTA
    public void eliminarNodo(Nodo nodo)
    {
        principio(); //Para que actual vuelva al principio para recorrer la lista en busca del nodo que queremos eliminar
        
        while(actual.getSgt() != null)
        {
            if(actual == nodo)
            {
                actual.getSgt().setSgt(actual.getAnt()); //Ponemos que el siguiente del siguiente de actual sea el anterior de actual
                actual.getAnt().setSgt(actual.getSgt()); //Ponemos que el siguiente del anterior de actual sea el siguiente de actual
                principio();
                System.gc();
                break;                
            }
            
            actual = actual.getSgt();
        }
        
    }
    
    //METODOS PARA AÑADIR UN NODO NUEVO A LA LISTA
    public void crearNodo(T objeto, int i)
    {
        Nodo <T> nuevo = new Nodo<T>(objeto, i);
        añadirNodo(nuevo);
    }
    
   
    public void añadirNodo(Nodo nodo)
    {
        if(inicial == null)
        {
            inicial = nodo;
            actual = inicial;
        }else
        {
            nodo.setSgt(inicial); //Indico que el siguiente del nodo que quiero meter es el primero de la lista
            nodo.getSgt().setAnt(nodo); //Indico que el anterior de inicial es el nodo que quiero añadir
            inicial = nodo; //Indico que ahora el primero de la lista es el nodo actual
            actual = inicial;
        }
        
    }
    
    //METODOS PARA ORDENAR LA LISTA (BURBUJA)
    public void intercambiarNodo(Nodo x, Nodo y)
    {
        Nodo aux = new Nodo();
        
        aux.setDato(x.getDato());
        aux.setIndice(x.getIndice());
        
        x.setDato(y.getDato());
        x.setIndice(y.getIndice());
        
        y.setDato(aux.getDato());
        y.setIndice(aux.getIndice());
    }
    
    public void ordenarLista()
    {
        Nodo x;
        Nodo y;
        
        for(x = this.inicial; x != null; x = x.getSgt())
        {
//            System.out.println(" " + x.getIndice());
            
            for(y = x.getSgt(); y != null; y = y.getSgt())
            {
//                System.out.println(" " + y.getIndice());
                
                if(x.getIndice()> y.getIndice())
                {
                    intercambiarNodo(x, y);
                    //System.out.print(" " + x.getIndice()+" " + y.getIndice());
                    //System.out.println(" ");
                }
            }
        }
        
    }
    
    
    @Override
    public String toString()
    {
        String aux = "";
        
        for(Nodo <T> nodo = primero(); nodo != null; nodo = nodo.getSgt())
        {
            aux = nodo.getDato().toString();
        }
        
        return aux;
    }
}
