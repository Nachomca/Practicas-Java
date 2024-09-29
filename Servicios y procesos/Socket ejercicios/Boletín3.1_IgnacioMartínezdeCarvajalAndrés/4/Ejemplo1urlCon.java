package ejercicio4_urlconnection;

import java.net.*;
import java.io.*;
/**
 *
 * @author Nacho
 */

public class Ejemplo1urlCon {

    public static void main(String[] args) {

        URL url = null;
        URLConnection urlCon = null;
        
        try
        {
            url = new URL("http://www.elaltozano.es");
            urlCon = url.openConnection();
            
            BufferedReader in;
            
            InputStream inputStream = urlCon.getInputStream();
            
            in = new BufferedReader(new InputStreamReader(inputStream));
            
            String inputLine;
            while((inputLine = in.readLine()) != null)
            {
                System.out.println(inputStream);
            }
            
            in.close();
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
