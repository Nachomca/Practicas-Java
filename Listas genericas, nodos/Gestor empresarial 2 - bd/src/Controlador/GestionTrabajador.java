package Controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho y Jorge
 */

public class GestionTrabajador {
    
    static Statement stmt;
    static ResultSet rs;
    
    //METODOS PARA CONTROLAR EL STMT Y RS
    public static void abrir(){
    
        try {
            stmt = GestionConex.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Falla el abrir");
        }
        
    }
    
    public static void cerrar(){
    
        try {
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Falla el cerrar");
        }
        
    }
    
    //METODOS PARA LISTAR TRABAJADORES
    public static Trabajador primero(int numEmpresa)
    {
        Trabajador tra = new Trabajador();
        
        try {

            rs = stmt.executeQuery("Select * from TRABAJADOR where empTra = " + numEmpresa);
            
            rs.next();
            tra = new Trabajador(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4), rs.getFloat(5), rs.getString(6));
            System.out.println("PRIMERO" + tra.toString());

        }catch (Exception e) {
                System.out.println(e);
                System.out.println("Falla el primero");
            }
        
        return tra;
    }
    
    public static Trabajador avanzar()
    {
        Trabajador tra = new Trabajador();
        
        try {
              rs.next();

              tra = new Trabajador(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4), rs.getFloat(5), rs.getString(6));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return tra;
        
    }
    
    public static Trabajador retroceder()
    {
        Trabajador tra = new Trabajador();
        
        try {
             rs.previous();

              tra = new Trabajador(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4), rs.getFloat(5), rs.getString(6));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return tra;
    }
    
    public static Trabajador verUltimo()
    {
        Trabajador tra = new Trabajador();
        
        try {
              rs.last();

              tra = new Trabajador(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4), rs.getFloat(5), rs.getString(6));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return tra;
    }
    
    public static Trabajador verPrimero()
    {
        Trabajador tra = new Trabajador();
        
        try {
              rs.first();

              tra = new Trabajador(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4), rs.getFloat(5), rs.getString(6));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return tra;
    }
    
    public static boolean esUltimo()
    {
        try {
              
              if(rs.isLast())
                  return true;
              
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return false;
    }
    
    public static boolean esPrimero()
    {
        try {
              
              if(rs.isFirst())
                  return true;
              
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return false;
    }
    
    //METODOS PARA EL ALTA DE TRABAJADORES
    public static void nuevoTrabajador(int num, int numEmp, String nombre, float sueldo, String foto)
    {

        try {

            stmt.executeUpdate("insert into TRABAJADOR values (" + num + "," + numEmp + "," + " '" +nombre+ "', CURRENT_DATE, " + sueldo +", '" + foto + "')");

        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Falla el alta");
        }
    }
    
    public static int sacarNumero()
    {
        int numero = 0;
        try {

            rs = stmt.executeQuery("Select max(traNumero) from TRABAJADOR");
            rs.next();
            numero = rs.getInt(1);
            System.out.println("numero: " + numero);

        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Falla el sacar numero es: " + numero);
        }
        return numero;
    }
    
    //METODOS PARA MODIFICAR TRABAJADORES
    public static void modificarTrabajador(String nombre, String sueldo, String foto, String numero)
    {
        try {

            stmt.executeUpdate("update TRABAJADOR set nomtrab = '" + nombre + "', sueldotra = " + Float.parseFloat(sueldo) + ", foto = '" + foto + "'"
                    + " where traNumero = " + Integer.parseInt(numero));
            

        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Falla el modificar");
        }
    }
    
}
