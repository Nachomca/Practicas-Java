package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Nacho y Jorge
 */

public class GestionConex {
    public static Connection con; //global para que no se cierre en todo el programa hasta llamar a cerrar()
    static PreparedStatement ps;
    
    public static void conectar()
    {
        try{            
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/gestion","gestion","gestion");
            System.out.println("Conectado");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static boolean consultaInicial(String nombre, String contraseña)
    {   
        try {

            ps = con.prepareStatement("select * from EMPRESA where nomEmp = ? and contraseña = ?");

            ps.setString(1, nombre);

            ps.setString(2, contraseña);


            ResultSet rs = ps.executeQuery();

            System.out.println("Entra en el try");
            
            if(rs.next())
            {
                rs.close();
            
                return true;
            }
            else
            {
                rs.close();
                
                return false;
            }
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public static int sacarNumero(String nombre)
    {
        int numero = 0;
        
        try
        {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from EMPRESA where nomEmp = '" + nombre + "'");
            
            rs.next();
            
            numero = rs.getInt(1);
            
            rs.close();
            stmt.close();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        return numero;
    }
    
    public static void cerrar()
    {
        try
        {
            ps.close();
            con.close();
            
            System.out.println("Todo cerrado");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
