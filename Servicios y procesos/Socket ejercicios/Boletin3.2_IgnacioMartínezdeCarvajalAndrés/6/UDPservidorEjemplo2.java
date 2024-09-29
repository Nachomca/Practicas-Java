package ejercicio6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author Nacho
 */

public class UDPservidorEjemplo2 {

    public static void main(String[] args) throws SocketException, IOException {
        
        DatagramSocket socket = new DatagramSocket(12345);
        
        System.out.println("Servidor esperando Datagrama.........");
        DatagramPacket recibo;
        
        byte[] bufer = new byte[1024];
        recibo = new DatagramPacket(bufer,bufer.length);
        socket.receive(recibo);
        
        String mensaje = new String(recibo.getData());
        
        System.out.println("Servidor recibe: " + mensaje);
        
        int contador = 0;
        for(int i=0; i<mensaje.length();i++)
            if(mensaje.charAt(i)=='a')
                contador++;
        
        InetAddress IPOrigen = recibo.getAddress();
        int puerto = recibo.getPort();
        
        System.out.println("Enviando las veces que aparece la letra a: " + contador);
        byte b = (byte)contador;
        byte[] enviados = new byte[2];
        enviados[0] = b;
        
        DatagramPacket envio = new DatagramPacket(enviados,enviados.length,IPOrigen,puerto);
        System.out.println("Cerrando conexion.");
        socket.close();
        
    }
    
}
