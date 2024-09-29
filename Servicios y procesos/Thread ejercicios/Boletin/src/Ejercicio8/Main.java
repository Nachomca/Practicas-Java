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
public class Main {
    public static void main(String[] args){
        Semaphore P1 = new Semaphore(1,true);
        
        Hilo1 hilo1 = new Hilo1(P1);
        hilo1.start();
        Hilo2 hilo2 = new Hilo2(P1);
        hilo2.start();
        Hilo3 hilo3 = new Hilo3(P1);
        hilo3.start();
    }
}
