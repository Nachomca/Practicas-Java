/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Nacho
 */
public class Hilo1 extends Thread{
    protected Semaphore p1;
    
    public Hilo1(Semaphore p1){
        this.p1 = p1;
    }
    
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Adios");
        }
        
    }
}
