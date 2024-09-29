/*
    ESTA ES LA LISTA DE NODOS. AVANZA Y RETROCEDE EN LA LISTA, SE OBTIENE LA INFORMACION DEL NODO Y SE INSERTA O BORRA UN NODO NUEVO
*/

package practica3.controlador;

import practica3.modelo.*;

public class Lista {
    
    private Nodo inicial;
    private Nodo actual;
    
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
    public Object extraerObjeto()
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
    public void crearNodo(Object objeto)
    {
        Nodo nuevo = new Nodo(objeto);
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
    
    //METODOS PARA EL FILTRADO DE LISTA
    //Por dia
    public Lista filtrarListaDia(int dia)
    {
        Lista listaAux = new Lista();
        
        principio();
        
        Suplente aux = null;
        Titular aux2 = null;
        
        while(actual != null)
        {
            if(actual.getDato() instanceof Suplente)
            {
                aux = (Suplente)actual.getDato();
            }else
                aux2 = (Titular)actual.getDato();
                
            if (aux != null && dia == aux.getDiaFecha())
                listaAux.añadirNodo(new Nodo(aux));
            else if (aux2 != null && dia == aux2.getDiaFecha())
                listaAux.añadirNodo(new Nodo(aux2));
            
            actual = actual.getSgt();
        }
        
        return listaAux;
    }
    //Por mes
    public Lista filtrarListaMes(int mes)
    {
        Lista listaAux = new Lista();
        
        principio();
        
        Suplente aux = null;
        Titular aux2 = null;
        
        while(actual != null)
        {
            if(actual.getDato() instanceof Suplente)
            {
                aux = (Suplente)actual.getDato();
            }else
                aux2 = (Titular)actual.getDato();
                
            if (aux != null && mes == aux.getMesFecha())
                listaAux.añadirNodo(new Nodo(aux));
            else if (aux2 != null && mes == aux2.getMesFecha())
                listaAux.añadirNodo(new Nodo(aux2));
            
            actual = actual.getSgt();
        }
        
        return listaAux;
    }
    //Por año
    public Lista filtrarListaAño(int año)
    {
        Lista listaAux = new Lista();
        
        principio();
        
        Suplente aux = null;
        Titular aux2 = null;
        
        while(actual != null)
        {
            if(actual.getDato() instanceof Suplente)
            {
                aux = (Suplente)actual.getDato();
            }else
                aux2 = (Titular)actual.getDato();
                
            if (aux != null && año == aux.getAñoFecha())
                listaAux.añadirNodo(new Nodo(aux));
            else if (aux2 != null && año == aux2.getAñoFecha())
                listaAux.añadirNodo(new Nodo(aux2));
            
            actual = actual.getSgt();
        }
        
        return listaAux;
    }
    //Por tipo
    public Lista filtrarTipo(String posicion) {
        
        Lista listaAux = new Lista();
        
        principio();
        
        Suplente aux = null;
        Titular aux2 = null;
        
        boolean bandera = (posicion.equals("suplente"));
        
        while(actual != null)
        {
            if(bandera && actual.getDato() instanceof Suplente)
            {
                aux = (Suplente)actual.getDato();
                listaAux.crearNodo(aux);
            }
            else if (!bandera && actual.getDato() instanceof Titular)
            {
                aux2 = (Titular)actual.getDato();
                listaAux.crearNodo(aux2);
            }
            
            actual = actual.getSgt();
        }
        
        return listaAux;
    }
}
