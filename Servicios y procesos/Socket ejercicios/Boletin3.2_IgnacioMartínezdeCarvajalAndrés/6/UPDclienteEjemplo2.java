package ejercicio6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Nacho
 */

public class UPDclienteEjemplo2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        
        DatagramSocket clientSocket = new DatagramSocket();
        
        InetAddress IPServidor = InetAddress.getByName("192.168.8.9");
        int puerto = 12345;
        
        System.out.println("Introduce un mensaje");
        String cadena = sc.nextLine();
        
        byte[] enviados = new byte[1024];
        enviados = cadena.getBytes();
        
        DatagramPacket envio = new DatagramPacket(enviados,enviados.length,IPServidor,puerto);
        clientSocket.send(envio);
        
        byte[] recibidos = new byte[2];
        DatagramPacket recibo = new DatagramPacket(recibidos,recibidos.length);
        System.out.println("Esperando datagrama....");
        clientSocket.receive(recibo);
        
        byte[] hh = recibo.getData();
        int numero = hh[1];
        
        System.out.println("El numero de caracteres a" + numero);
    }
    
}
