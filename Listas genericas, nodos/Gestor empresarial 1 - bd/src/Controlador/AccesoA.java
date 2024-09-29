/* Acesso a la base de datos:
 * - Con recorrido lineal -> nex()
 * - Con Statemen de s�lo lectura -> createStatement() (sin p�rametros. Opciones por defecto.
 * - Actualizaciones, Borrados, e inserciones directas a la BDs y no al ResulSet.
 */

package Controlador;
import Modelo.Empleado;
import Vista.PanelLista1a1;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AccesoA {
  
    public static ArrayList rellenaArray(){
        ArrayList <Empleado> aux = new ArrayList<Empleado>();
        
        //HACER LA CONEXION APARTE Y LLAMARLA CADA VEZ QUE SE HAGA UNA CONSULTA
        try {
            
            
            
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleado");
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();

            while (rs.next()) {
              
                  Empleado em = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
                  aux.add(em);
                 
              }
              rs.close();
              stmt.close();
              con.close();
            }catch (Exception e) {
                System.out.println(e);
            }
            return aux;
        }

    
    
    public static ArrayList filtraArray(String consulta){ 
        ArrayList <Empleado> aux = new ArrayList<Empleado>();
        
         try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
              
                  Empleado em = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
                  aux.add(em);
                 
              }
              rs.close();
              stmt.close();
              con.close();
              
            }catch (Exception e) {
                System.out.println(e);
            }
            return aux;
    }
    
    
    public static Empleado Avanzar(int num){
        Empleado emp = new Empleado(num, "", "", "", 0, 0, null);
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado");
            
            while(emp.getNumero() <= num)
            {
                rs.next();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
            }
            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return emp;
    }
    
    public static Empleado Av2(int num, String apellido){
        Empleado emp = new Empleado(num, "", "", "", 0, 0, null);
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado where apellido = '"+apellido+"'");
            
            while(emp.getNumero() <= num)
            {
                rs.next();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
            }
            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"No se puede seguir avanzando.\n No hay más elementos en la lista");
            }
        
        return emp;
    }
    
    public static Empleado Ret2(int num, String apellido){
        Empleado emp = new Empleado(num, "", "", "", 0, 0, null);
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado where apellido = '"+apellido+"'");
            
             rs.last();
             emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
            
            while(emp.getNumero() >= num)
            {
                rs.previous();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
            }
            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"No se puede seguir retrocediendo.\n No hay más elementos en la lista");
            }
        
        return emp;
    } 
    
    public static Empleado Retroceder(int num){
        Empleado emp = new Empleado(num, "", "", "", 0, 0, null);
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado");
            
             rs.last();
             emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
            
            while(emp.getNumero() >= num)
            {
                rs.previous();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
            }
            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return emp;
        
       
    }
    
    public static Empleado primero(){
        Empleado emp = null;
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado");
            
            rs.next();
            emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));

            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return emp;
    }
    
    public static Empleado primero2(String apellido){
        Empleado emp = null;
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado where apellido = '"+apellido+"'");
            
            rs.next();
            emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));

            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return emp;
    }
    
    public static boolean esPrimero2(Empleado em,String apellido)
    {
        Empleado emp;
        boolean primero = false;
        int bandera = 0;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado where apellido = '"+apellido+"'");
            
                rs.last();
                
            while(bandera == 0)
            {
  
                rs.previous();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
                
                if(em.getNumero() == emp.getNumero())
                    bandera = 1;
    
            }
             
            if(!rs.previous())
               primero = true;
            else
                primero = false;
            
            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return primero;
    }
    
    public static boolean esPrimero(Empleado em)
    {
        Empleado emp;
        boolean primero = false;
        int bandera = 0;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from Empleado");
            
                rs.last();
                
            while(bandera == 0)
            {
  
                rs.previous();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
                
                if(em.getNumero() == emp.getNumero())
                    bandera = 1;
    
            }
             
            if(!rs.previous())
               primero = true;
            else
                primero = false;
            
            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return primero;
    }
    
    public static boolean esUltimo2(Empleado em, String apellido)
    {
        Empleado emp;
        boolean primero = false;
        int bandera = 0;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            String consulta = "Select * from Empleado where apellido = '"+apellido+"'";
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(bandera == 0)
            {
                rs.next();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
                
                if(em.getNumero() == emp.getNumero())
                    bandera = 1;
            }
             
            if(!rs.next())
               primero = true;
            else
                primero = false;

            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return primero;
    }
    
     public static boolean esUltimo(Empleado em)
    {
        Empleado emp;
        boolean primero = false;
        int bandera = 0;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            String consulta = "Select * from Empleado";
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(bandera == 0)
            {
                rs.next();
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getDate(7));
                
                if(em.getNumero() == emp.getNumero())
                    bandera = 1;
            }
             
            if(!rs.next())
               primero = true;
            else
                primero = false;
            
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return primero;
    }

    public static String[] ContarApellidos() {
        int n = 0;
        String [] apellido = new String[0];
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","empresa","empresa");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            String consulta = "Select distinct APELLIDO from Empleado";
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(!rs.isLast())
            {
                n++;
                rs.next();
            }
            
            apellido = new String[n];
            
            n = 0;
            
            rs.first();
            
            while(!rs.isLast())
            {
                apellido[n] = rs.getString(1);
                n++;
                rs.next();
            }
 
            rs.close();
            stmt.close();
            con.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
        
        
        return apellido;
    }
}
