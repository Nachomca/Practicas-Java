package p07;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


/**
 *
 * @author Nacho
 */

public class Corredor extends Thread{
    
    //constantes
    private final int diametro = 30;
    private static int posicion = 1;
    
    //atributos
    private int x; //horizontal
    private int y; //vertical
    private Principal principal;
    private Meta meta;
    private Color color;
    private String nombre;
    private boolean fin = false;
    //private BufferedImage vil_variable = ImageIO.read(new File("src/foto.png"));
    
    //constructor
    public Corredor(Principal principal, Meta meta, int x, int y, Color color, String nombre){
    
        this.principal = principal;
        this.meta = meta;
        this.x = x;
        this.y = y;
        this.color = color;
        this.nombre = nombre;
    }
    
    //getter and setter

    public static int getPosicion() {
        return posicion;
    }

    public static void setPosicion(int posicion) {
        Corredor.posicion = posicion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombGalgo) {
        this.nombre = nombGalgo;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }
    
    
    public void paint(Graphics2D g) {
	
        g.setColor(color);
        g.fillOval(x, y, diametro, diametro);
        //g.drawImage(vil_variable, x, y, null);
    }
    
    public void movimiento(int bandera){
        
        Random random = new Random();
        int retrocede = random.nextInt(20); //el corredor puede retroceder
        int velocidad = random.nextInt(6+1) * 10; //valocidad aleatoria de cada corredor
        
        if(bandera == 0){
            
            if(retrocede == 0){

                x = x - velocidad;

            }else{

                x = x + velocidad;
            }
        }else{
            
            x = x + velocidad;
        }
    }
    
    public void animar(){
        
        if(!fin){
            
            movimiento(1);
            principal.repaint();                
            finCarrera(meta);
            //System.out.println("Vamos tu puedes " + nombre + "!!!");
        }
    }
    
    public void finCarrera(Meta meta){
    
        if(meta.getX() <= x){
        
            synchronized (Corredor.class) {  //sincroniza los hilos para poder visualizar el orden de llegada
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "El galgo " + nombre + " ha llegado " + posicion);
    
                fin = true;

                posicion++;
            }
        }    
    }

    @Override
    public void run() {
    
        while (!fin) {
            try {
                    
                Thread.sleep(500);
                movimiento(0);
                principal.repaint();                
                finCarrera(meta);  
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
}