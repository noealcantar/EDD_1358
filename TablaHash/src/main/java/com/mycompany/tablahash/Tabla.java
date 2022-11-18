/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tablahash;

/**
 *
 * @author hp
 */
public class Tabla {

public static void main(String[] args) {
    
        TablaHash prueba= new TablaHash(13);
        prueba.add(12, 756);
        prueba.add(26, 128);
        prueba.add(10, 948);
        System.out.println(prueba);
        //System.out.println("------------");
        prueba.remove(26);
        prueba.remove(10);
        prueba.remove(12);
        System.out.println(prueba);
       
    }
}