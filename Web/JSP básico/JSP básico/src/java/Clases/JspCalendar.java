package Clases;

import java.util.*;

/* Los JavaBean requieren:
   - Un constructor sin parámetros o argumentos;
   - Sus propiedades han de tener sus métodos get y set
 */

public class JspCalendar {
    Calendar calendar = null;

    public JspCalendar(Date fechaNacimiento) {
	calendar = Calendar.getInstance();
	calendar.setTime(fechaNacimiento);
    }
    
    public int calcularEdad(){
    
        int edad = 0;
        
        edad = calendar.get(Calendar.YEAR);
        
        int a�oActual = Calendar.getInstance().get(Calendar.YEAR);
        
        edad = a�oActual - edad;

        return edad;
    
    }
    
    public String obtenerSignoZodiaco(){
        
        String signo = "";
        
        int mes = 1 + calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        
        
        switch (mes) {
            case 1: // Enero
                signo = (dia <= 20) ? "Capricornio" : "Acuario";
                break;
            case 2: // Febrero
                signo = (dia <= 19) ? "Acuario" : "Piscis";
                break;
            case 3: // Marzo
                signo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4: // Abril
                signo = (dia <= 20) ? "Aries" : "Tauro";
                break;
            case 5: // Mayo
                signo = (dia <= 21) ? "Tauro" : "G�minis";
                break;
            case 6: // Junio
                signo = (dia <= 21) ? "G�minis" : "C�ncer";
                break;
            case 7: // Julio
                signo = (dia <= 22) ? "C�ncer" : "Leo";
                break;
            case 8: // Agosto
                signo = (dia <= 23) ? "Leo" : "Virgo";
                break;
            case 9: // Septiembre
                signo = (dia <= 23) ? "Virgo" : "Libra";
                break;
            case 10: // Octubre
                signo = (dia <= 23) ? "Libra" : "Escorpio";
                break;
            case 11: // Noviembre
                signo = (dia <= 22) ? "Escorpio" : "Sagitario";
                break;
            case 12: // Diciembre
                signo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Mes inv�lido";
                break;
        }
        
        return signo;
    
    }
}

