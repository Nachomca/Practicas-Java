/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Nacho
 */
public class Factorial extends Thread{
    public void run(){
        int factorial = 1;
        for(int i = 1; i <= 10; i++){
            factorial = factorial * i;
            System.out.println("El factoria de "+i+" = "+factorial);
        }
        
    }
}
