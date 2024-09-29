/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author Nacho
 */
public class Hilo extends Thread{
    String str;
    
    public Hilo(String str){
        this.str = str;
    }
    
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println(str);
        }
        
    }
    
    public static void main(String[] args)
    {
        Hilo Hil1 = new Hilo("alfredo");
        Hil1.start();
        new Hilo("pepe").start();
        new Hilo("jose").start();
        new Hilo("juan").start();
    }
}
