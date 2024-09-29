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
public class Main {
    public static void main(String[] args){
        //creamos 2 hilos del tipo Hilo_Thread con 2 constructores
        //diferentes
        Hilo_Thread hilo1 = new Hilo_Thread("Pablo");
        Hilo_Thread hilo2 = new Hilo_Thread();
        //creamos un hilo Runnable en un paso
        Thread hilo3 = new Thread(new Hilo_Runnable());
        //ponemos en marcha los 3 hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        //Se ejecutan aleatoriamente porque no están sincronizados.
    }
}
