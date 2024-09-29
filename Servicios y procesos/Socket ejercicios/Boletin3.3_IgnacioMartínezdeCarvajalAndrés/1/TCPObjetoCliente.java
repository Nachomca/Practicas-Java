package ejercicio1;

/**
 *
 * @author Nacho
 */

import java.io.*;
import java.net.*;

public class TCPObjetoCliente {
    
    public static void main(String[] arg) throws IOException,ClassNotFoundException {
        
        String Host = "localhost";
        int Puerto = 6000;//puerto remoto
        
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket cliente = new Socket(Host, Puerto);
        
        //Flujo de entrada para objetos
        ObjectInputStream personaEntrada = new ObjectInputStream(cliente.getInputStream());

        //Se recibe un objeto
        Persona dato = (Persona) personaEntrada.readObject();//recibo objeto
        System.out.println("Obtengo: "+dato.getNombre()+"||"+dato.getEdad());
        
        //Modifico el objeto
        dato.setNombre("Juan");
        dato.setEdad(15);
        
        //FLUJO DE salida para objetos
        ObjectOutputStream personaSalida = new ObjectOutputStream(cliente.getOutputStream());

        // Se envía el objeto
        personaSalida.writeObject(dato);
        System.out.println("Envio: "+dato.getNombre()+"*"+dato.getEdad()); 
        
        // CERRAR STREAMS Y SOCKETS
        personaEntrada.close();
        personaSalida.close();
        cliente.close();
    }
}
