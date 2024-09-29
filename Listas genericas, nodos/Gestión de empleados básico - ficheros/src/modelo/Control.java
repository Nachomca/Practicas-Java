package modelo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public  class Control extends Exception {
    
    public Control(String s) 
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
            
            case "sueldo":
            {
                sueldoSuperado();
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
    
    private void sueldoSuperado(){
        JFrame frame2 = new JFrame();
        JOptionPane.showMessageDialog(frame2, "El sueldo supera el máximo permitido.\nIntentalo de nuevo.");
    }
    
}
