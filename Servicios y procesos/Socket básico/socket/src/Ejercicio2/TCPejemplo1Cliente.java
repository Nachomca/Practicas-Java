package Ejercicio2;

import java.io.*;
import java.net.*;

public class TCPejemplo1Cliente {
    
    public static void main(String[] args) throws Exception{
        
        // CREO FLUJO DE SALIDA AL SERVIDOR

        // ENVIO UN SALUDO AL SERVIDOR

        // CREO FLUJO DE ENTRADA AL SERVIDOR

        // EL SERVIDOR ME ENVIA UN MENSAJE

        // CERRAR STREAMS Y SOCKETS (Cuidado con el orden)
        
        int Puerto = 6000;// Puerto
        Socket cliente;
        
        try{
            cliente = new Socket("127.0.0.1",Puerto);
            System.out.println("Programa cliente iniciado...");
            
            try(OutputStream flujoSalidaAServidor=cliente.getOutputStream();
                InputStream flujoEntradaDeServidor=cliente.getInputStream();
                InputStreamReader flujoEntLecturaDeServidor = new InputStreamReader(flujoEntradaDeServidor, "UTF-8");
                OutputStreamWriter flujoSalEscrituraAServidor = new OutputStreamWriter(flujoSalidaAServidor,"UTF-8");
                BufferedWriter bufferEscrituraAServidor = new BufferedWriter (flujoSalEscrituraAServidor);
                BufferedReader bufferLecturaDeServidor = new BufferedReader(flujoEntLecturaDeServidor);
                InputStreamReader flujoLecturaEntEstandar = new InputStreamReader(System.in);
                BufferedReader bufferLecturaEntEstandar = new BufferedReader (flujoLecturaEntEstandar)){
                
                    String lineaLeida;
                    System.out.println("Introduce una línea como cliente.");
                    System.out.print("Cliente > ");
                    
                    while((lineaLeida = bufferLecturaEntEstandar.readLine()) != null && lineaLeida.length() > 0)
                    {
                        bufferEscrituraAServidor.write(lineaLeida);
                        bufferEscrituraAServidor.newLine();
                        bufferEscrituraAServidor.flush();
                        System.out.println("Servidor: " + bufferLecturaDeServidor.readLine());
                        System.out.print("Cliente > ");
                    }
                }catch (UnknownHostException e) {
                    System.err.println("Host desconocido");
                    System.exit(1);
                }
            
            cliente.close(); //cierro socket cliente
        }catch(IOException e)
        {
            System.out.println("Error");
        }
    }   
}
