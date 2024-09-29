package ejercicio3;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author nacho
 */

public class ClienteFichero
{

    public static void main(String[] args)
    {
        // Mensaje inicial
        System.out.println("Fichero solicitado por el cliente 'hola.txt'");
        System.out.println("********************************************");
        
        // Se crea el cliente y se le manda pedir el fichero.
        ClienteFichero cf = new ClienteFichero();
        cf.pide("hola.txt", "localhost", 6000);
    }

    public void pide(String fichero, String servidor, int puerto)
    {
        int numeroBytes = 0;
        
        try
        {
            // Se abre el socket.
            Socket socket = new Socket(servidor, puerto);

            // Se envía un mensaje de petición de fichero.
            ObjectOutputStream oos = new ObjectOutputStream(socket
                    .getOutputStream());
            MensajeDameFichero mensaje = new MensajeDameFichero();
            mensaje.nombreFichero = fichero;
            oos.writeObject(mensaje);

            // Se abre un fichero para empezar a copiar lo que se reciba.
            FileOutputStream fos = new FileOutputStream(mensaje.nombreFichero + "_copia");

            // Se crea un ObjectInputStream del socket para leer los mensajes
            // que contienen el fichero.
            ObjectInputStream ois = new ObjectInputStream(socket
                    .getInputStream());
            MensajeTomaFichero mensajeRecibido;
            Object mensajeAux;
            
            // Se escribe un mensaje sobre la función de este cliente
            System.out.println("Este es un fichero de prueba para el ejercicio de enviar fichero"
                    + "a traves de socket");
            System.out.println("Este fichero es 'hola.txt' y se guarda en una dirección determinada"
                    + "(raiz del programa)");
            System.out.println("Fichero copiado en 'hola.txt_copia'. Se mostrara su contenido:");
            System.out.println("\nContenido:");
            
            do
            {
                // Se lee el mensaje en una variable auxiliar
                mensajeAux = ois.readObject();
                
                // Si es del tipo esperado, se trata
                if (mensajeAux instanceof MensajeTomaFichero)
                {
                    mensajeRecibido = (MensajeTomaFichero) mensajeAux;
                    // Se escribe en pantalla y en el fichero
                    System.out.print(new String(
                            mensajeRecibido.contenidoFichero, 0,
                            mensajeRecibido.bytesValidos));
                    fos.write(mensajeRecibido.contenidoFichero, 0,
                            mensajeRecibido.bytesValidos);
                    
                    // Bucle para contar el numero de bytes ocupados por el contenido del fichero
                    for(int i = 0; i < mensajeRecibido.contenidoFichero.length; i++)
                    {
                        if(mensajeRecibido.contenidoFichero[i] != 0)
                            numeroBytes++;
                        else
                            break;
                    }
                    
                } else
                {
                    // Si no es del tipo esperado, se marca error y se termina
                    // el bucle
                    System.err.println("Mensaje no esperado " + mensajeAux.getClass().getName());
                    break;
                }
            } while (!mensajeRecibido.ultimoMensaje);
            
            System.out.println("Se han copiado un total de "+ numeroBytes + " bytes");
            
            // Se cierra socket y fichero
            fos.close();
            ois.close();
            socket.close();

        } catch (Exception e)
        {
            System.out.println("ERROR pide");
            e.printStackTrace();
        }
    }
}
