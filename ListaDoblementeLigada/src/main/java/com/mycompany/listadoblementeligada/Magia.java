/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listadoblementeligada;

import com.mycompany.listadoblementeligada.ListaDoblementeLigada; 
/**
 *
 * @author hp
 */
public class Magia  {
    
	public static void main(String[] args) {
		
	 ListaDoblementeLigada <Integer> head = new ListaDoblementeLigada<Integer>();

	System.out.println("-------------- Valores iniciales ----------------");
	head.agregar_al_inicio(18);
	head.agregar_al_final(06);
	head.agregar_al_final(2003);
	head.transversal();
		System.out.println("\n  El tamanio de la lista es: "+ head.get_tamanio());
		System.out.println("------------------------------------------------------\n");
		System.out.println("\n Agregar al inicio: \n");
	head.agregar_al_inicio(12);
	head.transversal();
        	System.out.println("\n El tama�o de la lista es:: "+ head.get_tamanio());
		System.out.println("------------------------------------------------------\n");
		System.out.println("\n Agregar despues de:");
	head.agregar_despues_de(2004, 3);
	head.transversal();
		System.out.println("\n El tamanio de la lista es:: "+ head.get_tamanio());
		System.out.println("------------------------------------------------------\n");
		System.out.println("\n Agregar al final:\n");
	head.agregar_al_final(25);
	head.transversal();
		System.out.println("\n El tama�o de la lista es:: "+ head.get_tamanio());
		System.out.println("------------------------------------------------------\n");
		System.out.println("\nEliminar el primero\n");
	head.Eliminar_el_primero();
	head.transversal();
		System.out.println("\nEl tama�o de la lista es:: "+ head.get_tamanio());
		System.out.println("..................................................\n");
		System.out.println("\nEliminar posici�n 2\n");
	head.Eliminar(3);
	head.transversal();
		System.out.println("\nEl tama�o de la lista es:: "+ head.get_tamanio());
		System.out.println("..................................................\n");
		System.out.println("\nEliminar al final\n");
	head.Eliminar_al_final();
	head.transversal();
		System.out.println("\nEl tama�o de la lista es:: "+ head.get_tamanio());
		System.out.println("..................................................\n");
		System.out.println("\nBuscar; buscar 44\n");
		System.out.println("Posicion en la que esta: " + head.buscar(44));
		System.out.println("..................................................\n");
		System.out.println("\n Actualizar el 44 a 3102 \n");
	head.actualizar(2003, 2010);
	head.transversal();
		System.out.println("\n el tamanio de la lista es:: "+ head.get_tamanio());
		System.out.println("..................................................\n");
}
}

