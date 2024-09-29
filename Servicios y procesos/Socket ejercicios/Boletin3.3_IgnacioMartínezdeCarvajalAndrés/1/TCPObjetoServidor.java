package ejercicio1;

/**
 *
 * @author Nacho
 */

import java.io.*;
import java.net.*;

public class TCPObjetoServidor {
    
    public static void main(String[] arg) throws IOException,ClassNotFoundException {

        int numeroPuerto = 6000;// Puerto
        
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        
        System.out.println("Esperando al cliente....."); 
        Socket cliente = servidor.accept();
        
        // Se prepara un flujo de salida para objetos
        ObjectOutputStream objetoSalida = new ObjectOutputStream(cliente.getOutputStream()); 

        // Se prepara un objeto y se envía
        Persona persona1 = new Persona("Pepe", 10);
        objetoSalida.writeObject(persona1); //enviando objeto

        System.out.println("Envio: " + persona1.getNombre() +"*"+ persona1.getEdad());
        
        // Se obtiene un stream para leer objetos
        ObjectInputStream objetoEntrada = new ObjectInputStream(cliente.getInputStream());
        Persona dato = (Persona) objetoEntrada.readObject();
        System.out.println("Obtengo: "+dato.getNombre()+"*"+dato.getEdad());
        
        // CERRAR STREAMS Y SOCKETS
        objetoSalida.close();
        objetoEntrada.close();
        cliente.close();
        servidor.close();
    }
}
