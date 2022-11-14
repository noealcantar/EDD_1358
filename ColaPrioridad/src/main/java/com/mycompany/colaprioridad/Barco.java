/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colaprioridad;

/**
 *
 * @author hp
 */

public class Barco {
public static void main(String[] args) {
Codigo Barco = new Codigo<>(6);
		 		
	 Barco.queue(4, "Maestre");
	 Barco.queue(2, "Ninos");
	 Barco.queue(4, "Mecanico");
	 Barco.queue(3, "Hombres");
	 Barco.queue(4, "Vigia");
	 Barco.queue(5, "Capitan");
	 Barco.queue(4, "Timonel");
	 Barco.queue(3, "Mujeres");
         Barco.queue(2, "Tercera Edad");
	 Barco.queue(1, "Ninas");
		 		
System.out.println(Barco);
		     }

		 }

