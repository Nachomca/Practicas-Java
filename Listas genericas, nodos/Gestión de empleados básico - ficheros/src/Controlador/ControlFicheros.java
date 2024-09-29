package Controlador;

import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

public class ControlFicheros{
    
    public void creaFichero(Lista <Empleado> lista)
    {       
        try {
            ObjectOutputStream flujoSalidaFichero = new ObjectOutputStream(new FileOutputStream("DatosLista.dat", true));
            
            //System.out.println("********Volcando la lista al fichero *********"+ "\n");
        
            try{
                for(Nodo <Empleado> aux = lista.primero(); aux != null; aux = aux.getSgt())
                {
                    flujoSalidaFichero.writeObject(aux.getDato());
                }
                
                //System.out.println("Lista guardada correctamente.");
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Lista guardada correctamente en el Fichero.");
                
            }catch(IOException e)
            {
                //System.out.println("Error en la escritura de Fichero");
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"AVISO. Error en la escritura del Fichero.");
            }
            
            flujoSalidaFichero.close();
            
        } catch (Exception e) {
            //System.out.println(" Error cerrar flujo"+e.getMessage());
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"AVISO. Error cerrar flujo."+e.getMessage());
        }

    }
    
    public Lista <Empleado> leeFichero()
    {
        Lista <Empleado> list = new Lista <Empleado>();
        
        int cont = 1;
        
        //System.out.println("Leyendo fichero");
        
        try {
            InputStream file = new FileInputStream("DatosLista.dat");
            
            InputStream buffer = new BufferedInputStream(file);
            
            ObjectInputStream flujoEntradaFichero = new ObjectInputStream(buffer);
            
            //System.out.println("Va a leer el objeto");

            Object aux = flujoEntradaFichero.readObject();
            
            //System.out.println("Objeto leido");
            
            while(aux!=null){
                if(aux instanceof Analista)
                {
                    list.crearNodo((Analista)aux, cont);
                }else if(aux instanceof Programador)
                {
                    list.crearNodo((Programador)aux, cont);
                }
                
                aux = flujoEntradaFichero.readObject();
                cont++;
            }
            
            flujoEntradaFichero.close();
            //System.out.println("Lista cargada correctamente.");
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Lista cargada correctamente.");
            
        } catch (Exception e) {
            //System.out.println(" Error lectura de fichero");
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Lista cargada correctamente.");
        }
        
        return list;
    }
    
}

