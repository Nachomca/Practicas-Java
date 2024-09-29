/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Nacho
 */
public class Hilo implements Runnable{
    
    Thread t;
    
    public Hilo(){
        t = new Thread(this,"Hilo1");
        t.start();
    }
    
    
    public void run(){
        System.out.println("¡Saludo desde un hilo creado con Runnable!");
    }
}
