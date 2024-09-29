/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Comparator;
import modelo.Empleado;

/**
 *
 * @author Pablo
 */
public class ElementComparator implements Comparator <Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getNumero() - o2.getNumero();
    }
        
}
