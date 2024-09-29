package ejercicio5;

/**
 *
 * @author Nacho
 */

import java.io.*;
import java.net.*;

public class HiloServidor extends Thread {
    
    BufferedReader fentrada;
    PrintWriter fsalida;
    Socket socket = null;
    
    public HiloServidor(Socket s) throws IOException 
    {  
        socket = s;
        
        // se crean flujos de entrada y salida
        fsalida = new PrintWriter(socket.getOutputStream(), true);
        fentrada = new BufferedReader(new
        InputStreamReader(socket.getInputStream()));
    }
    
    public void run() {// tarea a realizar con el cliente
        
        String cadena = "";
        
        System.out.println("Me comunico con: " + socket.toString());
        
        while (!cadena.trim().equals("*")) {
            
            try {
                cadena = fentrada.readLine();
                
            } catch (IOException e) {
                e.printStackTrace();
            }// obtenemos la cadena
            
            fsalida.println(cadena.trim().toUpperCase());//para enviar mayúsculas
        }
        
        System.out.println("Finalización de comunicación con: " + socket.toString());
        
        fsalida.close();
        
        try {
            fentrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
