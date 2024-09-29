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
public class main {
    public static void main(String[] args){
        System.out.println("Hilo Auxiliar Nuevo: Estado = "+Thread.currentThread().getState());
        new HiloAuxiliar().start();
        System.out.println("Hilo Auxiliar Iniciado: Estado = "+Thread.currentThread().getState());
        System.out.println("Esperamos a que termine el hilo");
    }
}
