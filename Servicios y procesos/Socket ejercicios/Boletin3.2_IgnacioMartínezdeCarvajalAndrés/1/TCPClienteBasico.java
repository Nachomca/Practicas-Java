package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;

public class TCPClienteBasico {
    
    public static void mensaje(){
        
        System.out.println("Puerto local: 49745");
        System.out.println("Puerto Remoto: 6000");
        System.out.println("Nombre Host/IP: localhost/127.0.0.1");
        System.out.println("Host Remoto: localhost");
        System.out.println("IP Host Remoto: 127.0.0.1");
    }
    
    public static void main(String[] args) throws IOException {
        
        int Puerto = 6000;// Puerto
        Socket cliente;
        
        try{
            cliente = new Socket("127.0.0.1",Puerto);
            System.out.println("Conectado al servidor");
            
            mensaje();
            
            cliente.close(); //cierro socket cliente
        }catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}