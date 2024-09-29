package p07;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Nacho
 */

public class Meta {
    
    //constantes
    private final int Ancho = 10;
    private final int Alto = 240;
    
    //atributos
    private int x; //horizontal
    private int y; //vertical
    private Principal principal;
    private Color color;
    
    //constructor
    public Meta(Principal principal, int x, int y, Color color){
    
        this.principal = principal;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //getter and setter
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void paint(Graphics2D g) {
	
        g.setColor(color);
        g.fillRect(x, y, Ancho, Alto);
    }
}