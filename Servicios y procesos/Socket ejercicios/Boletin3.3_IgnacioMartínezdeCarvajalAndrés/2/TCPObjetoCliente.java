package ejercicio2;

/**
 *
 * @author Nacho
 */

import java.io.*;
import java.net.*;

public class TCPObjetoCliente {
    
    public static void main(String[] arg) throws IOException,ClassNotFoundException {
        
        String Host = "localhost";
        int Puerto = 6000;//puerto remoto
        int numero;
        
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket cliente = new Socket(Host, Puerto);
        
        //FLUJO DE salida para objetos
        ObjectOutputStream numeroSalida;
        
        //Flujo de entrada para objetos
        ObjectInputStream numeroEntrada;
        
        do{
            //Pedimos el numero por teclado
            System.out.println("Introduce un numero: ");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            numero = Integer.parseInt(flujoE.readLine());

            //Creamos el objeto y le metemos el numero introducido por teclado
            Numeros num = new Numeros();      
            num.setNumero(numero);

            //FLUJO DE salida para objetos
            numeroSalida = new ObjectOutputStream(cliente.getOutputStream());

            // Se envía el objeto
            numeroSalida.writeObject(num);
            System.out.println("Envio: "+num.getNumero());
            
            //Flujo de entrada para objetos
            numeroEntrada = new ObjectInputStream(cliente.getInputStream());
            
            if(numero <= 0)
                break;

            //Se recibe un objeto
            num = (Numeros) numeroEntrada.readObject();//recibo objeto
            System.out.println("Obtengo: "+num.getNumero()+"||"+num.getCuadrado()+"||"+num.getCubo());
            
        }while(numero > 0);
        
        numeroSalida.close();
        numeroEntrada.close();
        cliente.close();               
    }
}
