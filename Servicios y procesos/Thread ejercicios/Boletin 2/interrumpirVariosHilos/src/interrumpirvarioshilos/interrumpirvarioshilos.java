/*
    Si le das a muchos  aparecerá el error ConcurrentModificationException 
    Que es que l iterador, al detectar que se ha modificado la lista, no puede
    garantizar que itere por todos los datos correctamente. No puede asegurar la integridad de los datos.

    Si se generan varias pelotas, solo se detendrá la última
*/

//Autor: Ignacio Martínez de Carvajal Andrés

package interrumpirvarioshilos;

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

import java.awt.event.*;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class interrumpirvarioshilos {

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
    Thread t;

    public MarcoRebote() {
        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");

        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Dale!", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {                
                    comienza_el_juego();
            }
        });
        ponerBoton(laminaBotones, "Salir", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                System.exit(0);
            }
        });
        
        ponerBoton(laminaBotones, "Detener", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                detener();
            }
        });
                
        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void ponerBoton(Container c, String titulo, ActionListener oyente) {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }

    public void comienza_el_juego() {
        Pelota pelota = new Pelota();
        lamina.add(pelota);
            
        Runnable r = new PelotaConHilos(pelota, lamina);       
        
        t = new Thread(r);
        t.start();       
    }
    
    public void detener(){
        
        t.interrupt();
    }
}

class PelotaConHilos implements Runnable{ 
    private Pelota pelota;
    private Component componente;
    
    public PelotaConHilos(Pelota unaPelota, Component unComponente)
    {
        this.pelota = unaPelota;
        this.componente = unComponente;
    }
    
    public void run() 
    {
        System.out.println("Estado del hilo al comenzar"+ Thread.currentThread().isInterrupted()); 

        while(!Thread.currentThread().isInterrupted()){ 
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());
            
            try {
                Thread.sleep(4);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }
        System.out.println("Estado del hilo al finalizar"+ Thread.currentThread().isInterrupted());
    }
}
