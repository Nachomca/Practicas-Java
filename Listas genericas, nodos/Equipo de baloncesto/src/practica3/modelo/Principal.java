//VERSION 23 OCTUBRE 15:11
package practica3.modelo;
import practica3.controlador.*;

public class Principal {

    public static void main(String[] args) {
        
        Lista lista= new Lista();
        
        Titular jugador1 = new Titular("Pepe", "10/12/2021", 10, 1000);
        lista.crearNodo(jugador1);
        
        Suplente jugador2 = new Suplente("Juan", "11/12/2021", 11, 1000); 
        lista.crearNodo(jugador2);
        
        Titular jugador3 = new Titular("Jose", "12/12/2021", 12, 1000);
        lista.crearNodo(jugador3);
        
        Suplente jugador4 = new Suplente("Paco", "13/12/2021", 13, 1000); 
        lista.crearNodo(jugador4);
        
        /*player1.setNombre("Pepe");
        
        player1.setFechaAlta("11/12/2021");
        
        player1.setSueldo(1000);
        */

        for(Nodo aux = lista.primero(); aux != null; aux = aux.getSgt())
        {
            System.out.println(aux.getDato()); 
        }
        
    }
    
}
