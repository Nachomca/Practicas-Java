package ejercicio5_url_connection;

import java.io.*;
import java.net.*;

/**
 *
 * @author Nacho
 */

public class Ejemplo2urlCon {

    public static void main(String[] args) {
        
        try
        {
            URL url = new URL("http://localhost/2018/vernombre.php");
            URLConnection conexion = url.openConnection();
            conexion.setDoOutput(true);
            
            String cadena ="nombre=Juan&apellidos=Ramos Martín";
            
            PrintWriter output = new PrintWriter(conexion.getOutputStream());
            output.write(cadena);                    
            output.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String linea;
            while((linea = reader.readLine()) != null)
            {
                System.out.println(linea);
            }
            reader.close();

        }
        catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    }
    
}
