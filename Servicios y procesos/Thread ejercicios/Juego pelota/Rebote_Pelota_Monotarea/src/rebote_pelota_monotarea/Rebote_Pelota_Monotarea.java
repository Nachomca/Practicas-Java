//Autor: Ignacio Martínez de Carvajal Andrés

package rebote_pelota_monotarea;

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

import java.awt.event.*;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rebote_Pelota_Monotarea {

    public static void main(String[] args) {
        JFrame marco = new MarcoRebote();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class Pelota {

    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;

    public void mueve_pelota(Rectangle2D limites) {
        x += dx;
        y += dy;
        if (x < limites.getMinX()) {
            dx = -dx;
        }
        if (x + TAMX >= limites.getMaxX()) {
            x = limites.getMaxX() - TAMX;
            dx = -dx;
        }
        if (y < limites.getMinY()) {
            y = limites.getMinY();
            dy = -dy;
        }
        if (y + TAMY >= limites.getMaxY()) {
            y = limites.getMaxY() - TAMY;
            dy = -dy;
        }
    }

    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, TAMX, TAMY);
    }
}

class LaminaPelota extends JPanel {

    private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();

    public void add(Pelota b) {
        pelotas.add(b);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Pelota b : pelotas) {
            g2.fill(b.getShape());
        }
    }
}

class MarcoRebote extends JFrame {

    private LaminaPelota lamina;

    public MarcoRebote() {
        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");

        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Dale!", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                try {
                    comienza_el_juego();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MarcoRebote.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        ponerBoton(laminaBotones, "Salir", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                System.exit(0);
            }
        });
        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void ponerBoton(Container c, String titulo, ActionListener oyente) {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }

    public void comienza_el_juego() throws InterruptedException {
        Pelota pelota = new Pelota();
        lamina.add(pelota);
        for (int i = 1; i <= 3000; i++) {
            pelota.mueve_pelota(lamina.getBounds());
            lamina.paint(lamina.getGraphics());
            
            sleep(7);
        }
    }
}
