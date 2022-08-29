/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Arreglo;

import Métodos.Magia;

/**
 *
 * @author hp
 */
public class ADT {
;   
    public static void main(String[] args) {
        Magia l = new Magia();
        Magia<String> lk = new Magia<String>();
        
        lk.setElemento(0, "Noé Vargas Alcántar");
//        lk.longitud();
        lk.getElemento(0);
       // lk.limpiar(0);
        
        
        
        System.out.println(lk);
    }
    
}


