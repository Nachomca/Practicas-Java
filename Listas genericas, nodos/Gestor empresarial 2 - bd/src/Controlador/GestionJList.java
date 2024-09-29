/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Modelo.*;

/**
 *
 * @author Nacho y Jorge
 */

public class GestionJList {
    
    static Statement stmt;
    static ResultSet rs;
    
    public static ArrayList rellenaArray()
    {
        ArrayList <Trabajador> aux = new ArrayList<Trabajador>();
        
        try {
            stmt = GestionConex.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("Select * from TRABAJADOR");
            
            while (rs.next()) {
              
                Trabajador tra = new Trabajador(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4), rs.getFloat(5), rs.getString(6));
                aux.add(tra);
                 
            }

            rs.close();
            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return aux;
    }
    
}
