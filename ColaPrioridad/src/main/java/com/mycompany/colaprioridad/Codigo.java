/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioridad;

/**
 *
 * @author hp
 */

public class Codigo<T> {

	
		private Colas[] cola;
		private int tamanio;
		private int niveles;
		
		
		public Codigo(int nivPrioridad) {
			this.tamanio = 0;
			this.niveles = nivPrioridad;
			
			this.cola = new Colas[nivPrioridad];
			
			for (int i = 0; i < nivPrioridad; i++) {
				cola[i] = new Colas<>();
			}
					
		}
		
		
		public boolean is_empty() {
			return tamanio == 0;
		}
		
		
		public int length() {
	        return tamanio;
	    }

	    public T queue(int prioridad, T nuevo) {
	    	if (prioridad < niveles) {
	    		cola[prioridad].enqueue(nuevo);
	    		tamanio ++;
	    	}else {
	    		System.out.println("Cantidad de prioridad no existente");
	    	}
	    	return nuevo;
	    }
	   
	    public T dequeuee() {
	    	T aux = null;
	    	for(int i = 0; tamanio== niveles; i++) {
	    		if (!cola[i].is_empty()) {
	    			aux = Colas[i].dequeue();
	    		}
	    	}
	    	tamanio--;
	    	return aux;
	    }
	   
		
}