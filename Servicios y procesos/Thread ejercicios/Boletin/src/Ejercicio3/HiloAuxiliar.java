/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Nacho
 */
public class HiloAuxiliar extends Thread{
    
    @Override
    public void run(){
        System.out.println("Hilo Auxiliar Muerto: Estado = "+Thread.currentThread().getState());
        for(int i = 10; i >= 1; i--){
            System.out.print(i+",");
        }
        
    }
    
 
}
