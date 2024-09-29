package modelo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public interface Interfaz {
//    Calendar c = new GregorianCalendar();
    
    int DIA = Calendar.DAY_OF_MONTH;
    int MES = Calendar.MONTH;
    int ANIO = Calendar.YEAR;
    
    public boolean cumpleMes();
    public boolean cumpleTrimestre();
    public boolean cumpleAño();
}
