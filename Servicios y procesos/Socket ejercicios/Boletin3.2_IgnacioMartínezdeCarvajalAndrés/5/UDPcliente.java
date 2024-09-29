package Ejercicio5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Nacho
 */

public class UDPcliente {

    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {

        InetAddress destino = InetAddress.getByName("192.168.8.9");
        int puerto = 12345;
        byte[] mensaje = new byte[1024];
        String saludo = "Enviando saludos";
        mensaje = saludo.getBytes();
        
        DatagramPacket envio = new DatagramPacket(mensaje,mensaje.length,destino,puerto);
        DatagramSocket socket = new DatagramSocket(34567);
      
                
        System.out.println("Enviando datagram de tamaño: " + mensaje.length);
        System.out.println("Host destino: " + destino.getHostName());
        System.out.println("Ip destino: " + destino.getHostAddress());
        System.out.println("Puerto local del socket: " + socket.getLocalPort());
        System.out.println("Puerto al que envio: " + envio.getPort());
      
        socket.send(envio);
        socket.close();
    }
    
}
