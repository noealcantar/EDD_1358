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

public class ArregloADT<T>  {
	 int tamanio;
	  ArrayList<T> L;

	    public ArregloADT(int tam) {
	        this.tamanio = tam;
	        L = new ArrayList(this.tamanio);
	        for (int i = 0; i < this.tamanio; i++) {
	            this.L.add(null);
	        }
	    }

	    public T getElemento(int indice) {
	        if (comprobacion(indice)) {
	            return this.L.get(indice);
	        } else {
	            System.out.println("Fuera del rango");
	        }
	        return null;
	    }

	    private boolean comprobacion(int indice) {
	        return indice >= 0 && indice < this.tamanio;
	    }

	    public void setElemento(int indice, T dato) {
	        if (comprobacion(indice)) {
	            this.L.set(indice, dato);
	        } else {
	            System.out.println("Fuera del rango");
	        }
	    }

	    public int getLongitud() {
	        return this.tamanio;
	    }

	    public void limpiar(T dat) {
	        for (int i = 0; i < this.tamanio; i++) {
	            this.L.set(i, dat);
	        }
	    }
	    
	    public String toString(){
	        String estado = "-/-/-/-/-/ "+"Lugares disponibles: "+this.tamanio+" -/-/-/-/-/\n";
	        for (T dat : L) {
	            if(dat != null){
	                estado += dat.toString()+"\n";
	            }
	        }
	        return estado;
	    }
}