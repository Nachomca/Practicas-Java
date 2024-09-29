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
public class Primo extends Thread{
    
    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
          return false;
        }
        for (int x = 2; x < numero / 2; x++) {
          // Si es divisible por cualquiera de estos números, no
          // es primo
          if (numero % x == 0)
            return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
}
    
    public void run(){
        boolean primo;
        for(int i = 1; i <= 15; i++){   
            if(esPrimo(i))
                System.out.println(i+" es primo");
            else
                System.out.println(i+" no es primo");
        }
        
    }
}
