/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Nacho
 */
public class Hilo extends Thread{
    
    @Override
    public void run(){
        System.out.println("¡Saludo desde un hilo extendiendo de Thread!");
    }
    
 
}
