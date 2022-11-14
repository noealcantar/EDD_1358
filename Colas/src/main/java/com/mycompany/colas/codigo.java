/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

import java.util.ArrayList;

/**
 *
 * @author hp
 */

public class codigo<T> {
	
	int elem;
	private ArrayList<T> cola;
	
	public codigo(){
		cola = new ArrayList<T>();
	}
	
	public boolean is_empty() {
		return cola.isEmpty();
	}
	
	public int length() {
		return cola.size();
	}
	
	
	public void enqueue(T dato) {
		cola.add(dato);
	}
	
	public void dequeue() {
		
		T dato;
		
		if(is_empty()) {
			dato = null;
		}else {
			dato = cola.get(0);
			cola.remove(0);
		}
		
	}
	
	public String toString() {
		return "Cola -/-/" + this.cola + "-/-/";
	}
	
}