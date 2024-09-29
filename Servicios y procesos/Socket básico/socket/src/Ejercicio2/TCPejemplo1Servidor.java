package Ejercicio2;

import java.io.*;
import java.net.*;

public class TCPejemplo1Servidor {
    
    public static void main(String[] args) throws Exception{
        
        // Puerto
        
        // CREO FLUJO DE ENTRADA DEL CLIENTE

        // EL CLIENTE ME ENVIA UN MENSAJE
        
        // CREO FLUJO DE SALIDA AL CLIENTE

        // ENVIO UN SALUDO AL CLIENTE

        // CERRAR STREAMS Y SOCKETS
        
        int Puerto = 6000;
        
        ServerSocket Servidor = new ServerSocket(Puerto);
        
        System.out.println("Programa servidor.\nEsperando al cliente...");
        
        Socket cliente1= Servidor.accept();
        
        try(InputStream flujoEntradaDeCliente = cliente1.getInputStream();
            OutputStream flujoSalidaACliente = cliente1.getOutputStream();
            InputStreamReader flujoEntLecturaCliente = new InputStreamReader(flujoEntradaDeCliente,"UTF-8");
            BufferedReader bufferLecturaDeCliente = new BufferedReader(flujoEntLecturaCliente);
            OutputStreamWriter flujoSalEscrituraACliente = new OutputStreamWriter(flujoSalidaACliente, "UTF-8");
            BufferedWriter buferEscrituraACliente = new BufferedWriter(flujoSalEscrituraACliente)){

            String lineaRecibida;
            
            while((lineaRecibida=bufferLecturaDeCliente.readLine()) !=null && lineaRecibida.length()>0) {
                buferEscrituraACliente.write("Has introducido: " + lineaRecibida);
                buferEscrituraACliente.newLine();
                buferEscrituraACliente.flush();
            }
        }
    }
}
