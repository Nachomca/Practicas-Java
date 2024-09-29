package ejercicio2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nacho
 */

public class TCPObjetoServidor {
    
    public static void main(String[] arg) throws IOException,ClassNotFoundException {

        int numeroPuerto = 6000;// Puerto
        int numero;
        
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        
        System.out.println("Esperando al cliente....."); 
        Socket cliente = servidor.accept();

        // Se prepara un flujo de entrada para objetos
        ObjectInputStream objetoEntrada;
        
        // Se prepara un flujo de salida para objetos
        ObjectOutputStream objetoSalida;
               
        do{
            // Se obtiene un stream para leer objetos
            objetoEntrada = new ObjectInputStream(cliente.getInputStream());
            Numeros num = (Numeros) objetoEntrada.readObject();
            System.out.println("Obtengo: "+num.getNumero());
            
            numero = num.getNumero();
        
            //Realizo el cuadrado y el cubo del objeto
            num.setCuadrado((num.getNumero() * num.getNumero()));
            num.setCubo((num.getNumero() * num.getNumero() * num.getNumero()));

            objetoSalida = new ObjectOutputStream(cliente.getOutputStream());
            
            if(numero <= 0)
                break;

            // Se prepara un objeto y se envía
            objetoSalida.writeObject(num); //enviando objeto

            System.out.println("Envio: "+num.getNumero()+"||"+num.getCuadrado()+"||"+num.getCubo());

        }while(numero > 0);
       
        //CERRAR STREAMS Y SOCKETS
        objetoSalida.close();
        objetoEntrada.close();
        cliente.close();
        servidor.close();

    }
}
