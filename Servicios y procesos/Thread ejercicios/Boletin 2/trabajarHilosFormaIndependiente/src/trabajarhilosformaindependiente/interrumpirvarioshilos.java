/*
    Si le das a muchos  aparecerá el error ConcurrentModificationException 
    Que es que l iterador, al detectar que se ha modificado la lista, no puede
    garantizar que itere por todos los datos correctamente. No puede asegurar la integridad de los datos.

    Pasa igual que el anterior, si se generan muchas pelotas del mismo hilo, solo se detendrá la última
*/

//Autor: Ignacio Martínez de Carvajal Andrés

package trabajarhilosformaindependiente;

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
    Thread t1, t2, t3; 
    JButton comienza1, comienza2, comienza3, detener1, detener2, detener3; 

    public MarcoRebote() {
        setBounds(600, 300, 600, 350);
        setTitle("Rebotes");

        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();

        comienza1 = new JButton("Hilo1");
        comienza1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego(evento); 
            }
        });
        
        laminaBotones.add(comienza1);
        
        comienza2 = new JButton("Hilo2");
        comienza2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego(evento);
            }
        });
        
        laminaBotones.add(comienza2);
        
        comienza3 = new JButton("Hilo3");
        comienza3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego(evento);
            }
        });
        
        laminaBotones.add(comienza3);

        detener1 = new JButton("Detener1");
        detener1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                detener(evento);
            }
        });
        
        laminaBotones.add(detener1);
        
        detener2 = new JButton("Detener2");
        detener2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                detener(evento);
            }
        });
        
        laminaBotones.add(detener2);
        
        detener3 = new JButton("Detener3");
        detener3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                detener(evento);
            }
        });
        
        laminaBotones.add(detener3);
        
        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void comienza_el_juego(ActionEvent e) {
        Pelota pelota = new Pelota();
        lamina.add(pelota);
            
        Runnable r = new PelotaConHilos(pelota, lamina);        
        
        if(e.getSource().equals(comienza1)) 
        {
            t1 = new Thread(r);
            t1.start();     
        }
        else
        {
            if(e.getSource().equals(comienza2))
            {                
                t2 = new Thread(r);
                t2.start();     
            }
            else
            {
                if(e.getSource().equals(comienza3))
                {                
                    t3 = new Thread(r);
                    t3.start();      
                }
            }
        }
        
    }
    
    public void detener(ActionEvent e){

        if(e.getSource().equals(detener1)) 
        {
            t1.interrupt(); 
        }
        else
        {
            if(e.getSource().equals(detener2))
            {                
                t2.interrupt();     
            }
            else
            {
                if(e.getSource().equals(detener3))
                {                
                    t3.interrupt();    
                }
            }
        }
        
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
