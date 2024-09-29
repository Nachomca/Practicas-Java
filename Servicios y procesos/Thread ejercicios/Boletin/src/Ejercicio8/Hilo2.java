/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Nacho
 */
public class Hilo2 extends Thread{
    protected Semaphore p1;
    
    public Hilo2(Semaphore p1){
        this.p1 = p1;
    }
    
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Hola");
        }
        
    }
}
