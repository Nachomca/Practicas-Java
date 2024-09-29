package Controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Terminal extends GregorianCalendar{
    
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    //String a GregorianCalendar.
    public static GregorianCalendar parseDate(String fecha) {
       
        GregorianCalendar cal = null;
        
        try {
            cal = new GregorianCalendar(
            Integer.parseInt(fecha.substring(6, 10)),
            Integer.parseInt(fecha.substring(3, 5)) - 1, // Porque el calendario va de 0 a 11
            Integer.parseInt(fecha.substring(0, 2)));
        }
        catch (NumberFormatException e) {
            System.out.println("\n\tError: Formato incorrecto.");
        }
        
        return cal;
    }
     
    //GregorianCalendar a String.
    public static String parseDate(GregorianCalendar cal) {

        System.out.println("Entra en el parseDate");
        return cal.toString();
    }
    
    // Método sobreescrito auxiliar toString.
    @Override
    public String toString()
    {
        try {
            Date thisDate = this.getTime();
            return sdf.format(thisDate);
        }
        catch(Exception e) {
            return null;
        }
    }
    
}
