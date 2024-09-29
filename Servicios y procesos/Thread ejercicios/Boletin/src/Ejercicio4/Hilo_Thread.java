/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Nacho
 */
public class Hilo_Thread extends Thread{
    String nombre = "Hilo_Thread";
    
    public Hilo_Thread(String nb){
        this.nombre = nb;
    }
    
    public Hilo_Thread(){
        
    }
    
    @Override
    public void run(){
        for(int i = 0; i <= 2000; i++){
            System.out.println(nombre);
        }
        
    }
}
