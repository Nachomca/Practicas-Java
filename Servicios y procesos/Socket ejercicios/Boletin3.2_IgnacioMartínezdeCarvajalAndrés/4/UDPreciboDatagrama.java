package ejercicio4;

/**
 *
 * @author Nacho
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPreciboDatagrama {
    
    public static void main(String[] argv) throws Exception {
        
    byte[] bufer = new byte[1024];

    DatagramSocket socket = new DatagramSocket(12345); 
 
    DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
    System.out.println("Esperando Datagrama .......... ");

    socket.receive(recibo);

    int bytesRec = recibo.getLength();
    String paquete= new String(recibo.getData());

    System.out.println("Número de Bytes recibidos: "+ bytesRec); 
    System.out.println("Contenido del Paquete: " + paquete.trim());
    System.out.println("Puerto origen del mensaje: " + recibo.getPort());
    System.out.println("IP de origen: " + recibo.getAddress().getHostAddress());
    System.out.println("Puerto destino del mensaje: " + socket.getLocalPort());

    socket.close();

    }
}

