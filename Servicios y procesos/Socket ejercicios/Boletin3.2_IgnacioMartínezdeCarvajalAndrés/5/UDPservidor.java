package Ejercicio5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Nacho
 */

public class UDPservidor {
    
    public static void main(String[] args) throws IOException {

        byte[] bufer = new byte[1024];
    
        DatagramSocket socket = new DatagramSocket(12345);
        
        System.out.println("Esperando Datagrama...............................................");
        DatagramPacket recibo = new DatagramPacket(bufer,bufer.length);
        
        socket.receive(recibo);
        
        int bytesRec = recibo.getLength();
        String paquete = new String(recibo.getData());
        
        System.out.println("Nº de bytes recibidos: " + bytesRec);
        System.out.println("Contenido: " + paquete);
        System.out.println("Puerto de origen: " + recibo.getPort());
        System.out.println("Ip de origen: " + recibo.getAddress().getHostAddress());
        System.out.println("Puerto de destino: " + socket.getLocalPort());
        
        socket.close();
    }
}
