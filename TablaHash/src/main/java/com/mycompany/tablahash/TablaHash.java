/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablahash;

import java.util.ArrayList;

/**
 *
 * @author hp
 */

public class TablaHash<T> {
	
	 int key;
	    int tam;
	    T dato;
	    ArregloADT<T> Tabla;
	    ArrayList<T> array;


	    public TablaHash() {
	    }

	    public TablaHash(int tam) {
	        this.tam = tam;
	        Tabla = new ArregloADT(tam);
	    }
	   
	    public void add(int key, T dato){
	     int colocador = key%tam;
	     Tabla.setElemento(colocador, dato);
	    }

	    public T valueOf(int key){
	     int colocador = key%tam;   
	     return Tabla.getElemento(colocador) ; 
	    }
	 
	    public void remove(int key){
	     int colocador = key%tam; 
	     Tabla.limpiar(dato);
	    }

	    @Override
	    public String toString() {
	        return "-/-/-/"+Tabla+"-/-/-/"; 
	    }
	
}