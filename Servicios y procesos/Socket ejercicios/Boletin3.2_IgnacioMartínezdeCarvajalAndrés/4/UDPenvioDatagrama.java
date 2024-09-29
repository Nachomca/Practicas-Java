package ejercicio4;

/**
 *
 * @author Nacho
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPenvioDatagrama{
    
    public static void main(String[] argv) throws Exception {
        
        int port = 12345;
        InetAddress destino = InetAddress.getLocalHost();
        byte[] mensaje = new byte[1024];
        String Saludo = "Enviando Saludos !!";
        mensaje = Saludo.getBytes();

        DatagramPacket envio = new DatagramPacket
        (mensaje, mensaje.length, destino, port);
        DatagramSocket socket = new DatagramSocket(34567);
        socket.send(envio);

        socket.close();
    }
}

