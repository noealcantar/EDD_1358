/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.juegodevida;

/**
 *
 * @author hp
 */
public class JuegoDeVida {


	 public static void main(String[] args) {
		 
	        Tablero t = new Tablero();
	       
	       
	        System.out.println("------------------------");
	        
	        System.out.println(t.getTablero());
	       //ingresa las generaciones en el indice.
	        for(int i=0; i<7;i++){
	            t.reglas();
	            t.contarVecinos();
	            System.out.println("Generacion: " + i + "\n" + t.getTablero());
	        }
	        System.out.println("------------------------");    
	    }
}
