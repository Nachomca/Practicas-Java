package ejercicio5;

/**
 *
 * @author Nacho
 */

import java.io.*;
import java.net.*;

public class Cliente {
    
    public static void main(String[] args) throws IOException {
        
        String Host = "localhost";
        int Puerto = 6000;
        Socket Cliente = new Socket(Host, Puerto);
        
        //CREAMOS FLUJO DE SALIDA AL SERVIDOR
        PrintWriter fsalida = new PrintWriter (Cliente.getOutputStream(), true);
        
        //CREAMOS FLUJO DE ENTRADA AL SERVIDOR
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
        
        //CREAMOS FLUJO PARA ENTRADA NORMAL POR BUFFER
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String cadena, eco="";
        
        do{ 
            System.out.print("Introduce una cadena: ");
            cadena = in.readLine();
            fsalida.println(cadena);
            eco=fentrada.readLine();
            System.out.println("Eco: "+eco);
            
        } while(!cadena.trim().equals("*"));
        
        fsalida.close();
        fentrada.close();
        System.out.println("Fin del envío");
        in.close();
        Cliente.close();
    }
}
