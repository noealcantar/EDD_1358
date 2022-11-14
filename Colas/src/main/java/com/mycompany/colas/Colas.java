/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colas;

/**
 *
 * @author hp
 */
public class Colas {

public static void main(String[] args) {

 codigo <Integer> Cola = new Colas<>();

	Cola.enqueue(4);
	Cola.enqueue(90);
        Cola.enqueue(15);
	Cola.enqueue(90);
	Cola.enqueue(8);
	Cola.enqueue(24);
	Cola.enqueue(777);
        
System.out.println(Cola);
		
Cola.dequeue();
		
System.out.println(Cola);
					
	}
}