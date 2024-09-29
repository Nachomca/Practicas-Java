package Controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.*;

/**
 *
 * @author Nacho y Jorge
 */

public class GestionEmpresa {
    
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
    
    //METODO PARA VER LOS DATOS DE LA EMPRESA
    public static Empresa sacarEmpresa(int numero)
    {
        Empresa emp = new Empresa();
        
        try {
            
            rs = stmt.executeQuery("Select * from EMPRESA where empNumero = " + numero);
            
            rs.next();
            emp = new Empresa(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4));

            
        }catch (Exception e) {
                System.out.println(e);
        }
        
        return emp;
    }
    
    //METODO PARA MODIFICAR LA EMPRESA
    public static void modificarEmpresa(int numero, String nombre, String contraseña)
    {
        try {
            
            stmt.executeUpdate("Update EMPRESA set nomEmp = '"+ nombre + "', contraseña = '" + contraseña + "'"
                    + " where empNumero = " + numero);
            
        }catch (Exception e) {
                System.out.println(e);
        }
    }
    
}
