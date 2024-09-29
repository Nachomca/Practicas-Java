/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class ControlException extends Exception{
    public ControlException(String s) 
    {
        switch(s) 
        {
            case "int":
            {
                intNoValido();
                break;
            }

            case "float":
            {
                floatNoValido();
                break;
            }
            case "fecha":
            {
                fechaNoValida();
                break;
            }
        }
        
    }
   private void intNoValido() 
    {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "ERROR. El dato introducido no es un entero.");
    }

    private void floatNoValido() 
    {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "ERROR. Debes usar un decimal.");
    }
    
    private void fechaNoValida(){
        JFrame frame2 = new JFrame();
        JOptionPane.showMessageDialog(frame2, "La fecha introducida no es correcta.\nIntentalo de nuevo.");
    } 
}
