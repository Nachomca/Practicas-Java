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
public class Main {
    public static void main(String[] args){
        Produce produce = new Produce();
        produce.start();
        
        Factorial factorial = new Factorial();
        factorial.start();
        
        Primo primo = new Primo();
        primo.start();
    }
}
