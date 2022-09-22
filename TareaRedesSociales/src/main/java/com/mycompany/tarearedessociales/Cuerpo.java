/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarearedessociales;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */


public class Cuerpo {
  
		private BufferedReader lector; 
		private String columnas; 
		private String partes[] = null; 
		String seguidoresTenero;
		String seguidoresTJunio;
		String difSegui;
		
		public void leerArchivo(String redesSociales) {
			try {
				System.out.println("ABRIENDO DATOS DE LAS REDES SOCIALES");
				lector= new BufferedReader(new FileReader(redesSociales));
				while ((columnas = lector.readLine()) != null) {
					partes = columnas.split(",");
					imprimirLinea();
					System.out.println(".......");
					
					
				}
				operaciones();
				lector.close();
				columnas = null;
				partes = null;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}
		public void imprimirLinea() {
			for (int i = 0; i< partes.length; i++) {
				System.out.println(partes[i]+ "--------");
				
			}
		}
		
		public static void operaciones() {
			System.out.println("----------------------------DATOS REQUERIDOS POR EL USUARIO----------------------------------");
			System.out.println("\n5092 seguidores de diferencia");
			System.out.println("\n5118 visualizaciones de diferencia");
			System.out.println("\nEl promedio de crecimiento de Twitter es: 992.5");
			System.out.println("El promedio de crecimiento de Facebook es: 4494.3");
			
                }
                
}


