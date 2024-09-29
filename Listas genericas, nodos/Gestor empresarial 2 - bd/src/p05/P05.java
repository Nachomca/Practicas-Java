package p05;

import Controlador.*;
import Modelo.*;

/**
 *
 * @author Nacho y Jorge
 */

public class P05 {

    public static void main(String[] args) {
        // TODO code application logic here
        GestionConex.conectar();
        
        if(GestionConex.consultaInicial("UBISOFT", "ubi1"))
        {
            System.out.println("Bien");
            GestionTrabajador.abrir();
            GestionTrabajador.primero(1);
            /*GestionTrabajador.nuevoTrabajador(4, 1, "Rocio", 0, "nada");           
            System.out.println("Trabajador creado");
            GestionTrabajador.primero(1);
            Trabajador tra = GestionTrabajador.verPrimero();
            System.out.println(tra.toString());
            tra = GestionTrabajador.avanzar();
            System.out.println(tra.toString());
            tra = GestionTrabajador.retroceder();
            System.out.println(tra.toString());
            tra = GestionTrabajador.verUltimo();
            System.out.println(tra.toString());*/
            GestionTrabajador.modificarTrabajador("pepe2", "1200", "", "1");
            
            GestionTrabajador.cerrar();
        }
        else
            System.out.println("Mal");
        
        
        GestionConex.cerrar();
        
    }
    
}
